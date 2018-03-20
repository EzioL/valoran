package com.heyan.processor;

import com.heyan.EliseUtils;
import com.heyan.domain.BlindListBean;
import com.heyan.entity.BeautyScore;
import com.heyan.repository.BeautyScoreRepository;
import com.wilddog.client.SyncReference;
import com.wilddog.client.WilddogSync;
import com.wilddog.wilddogcore.WilddogApp;
import com.wilddog.wilddogcore.WilddogOptions;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.downloader.HttpClientDownloader;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;

/**
 * Created by Ezio on 2018/2/3.
 */
@Component
public class OOPPageProcessor implements PageProcessor {
	@Autowired
	BeautyScoreRepository beautyScoreRepository;

	public static final String BASE_URL = "http://date.jobbole.com";
	public static boolean FLAG_FIRST = false;

	private Site site = Site.me()
			.setDomain(BASE_URL)
			.setSleepTime(1000)
			.setRetryTimes(30)
			.setCharset("utf-8")
			.setTimeOut(30000)
			.setUserAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.104 Safari/537.36");

	@Override
	public void process(Page page) {
		//列表页
		if (page.getUrl().toString().equals(BASE_URL)
				|| page.getUrl().toString().contains(BASE_URL + "/page")) {
			//下一页放进队列
			Selectable nextPage = page.getHtml().xpath("//li[@id='pagination-next-page']");
			if (nextPage != null) {
				page.addTargetRequest(nextPage.xpath("a/@href").toString());
			}
			//保存列表数据
			setBlindListBean(page);
		} else {
			//详情页
			List<Selectable> entries = page.getHtml().xpath("//div[@class='p-entry']").xpath("p").nodes();
			List<String> conditions = Lists.newArrayList();
			List<BeautyScore> scores = Lists.newArrayList();
			String url = page.getUrl().toString();
			Integer id = EliseUtils.getIntegerFromString(url);
			for (Selectable e : entries) {
				if (e.toString().contains("img")) {
					Selectable img = e.xpath("/p/img/@src");
					BeautyScore score = new BeautyScore();
					score.setOopId(id);
					score.setImgUrl(img.toString());
					scores.add(score);

					beautyScoreRepository.saveAndFlush(score);
				} else {
					Selectable text = e.xpath("/p/text()");
					String[] split = text.toString().split("：|:| '<br>'");
					System.err.println("split-----> " + split);
				}
			}
			//batch
			//beautyScoreRepository.save(scores);


//
//			List<String> strings = entries.stream()
//					.map(e -> e.xpath("img") != null ? e.xpath("img/@src").toString() : e.toString())
//					.collect(Collectors.toList());
//
//			System.err.println(strings);
//
//
//			List<String> strings2 = entries.stream()
//					.map(e -> e.xpath("text()").toString())
//					.collect(Collectors.toList());
//
//			System.err.println(strings2);
		}


	}

	private void setBlindListBean(Page page) {
		List<Selectable> medias = page.getHtml().xpath("//li[@class='media']").nodes();
		//第一个是广告
		//int i = page.getUrl().toString().equals(BASE_URL) ? 1 : 0;
		for (int i = 1; i < medias.size(); i++) {
			Selectable media = medias.get(i);
			BlindListBean bean = new BlindListBean();
			String url = media.xpath("div/h3/a/@href").toString();
			Integer id = EliseUtils.getIntegerFromString(url);
			//System.err.println("id -- "+id);
			bean.setId(id);
			bean.setUrl(url);
			bean.setTitle(media.xpath("div/h3/a/text()").toString());
			bean.setVote(Integer.parseInt(media.xpath("a/span/text()").toString()));
			bean.setDistanceNow(media.xpath("p/span[1]/text()").toString());
			bean.setTag(media.xpath("p/span[2]/a/text()").toString());
			bean.setUpdateTime(EliseUtils.stampToDate(new Date().getTime()));

			/*getSyncReference().child("oop_blind").child("list").child(bean.getId() + "")
					.setValue(bean, new SyncReference.CompletionListener() {
						@Override
						public void onComplete(SyncError syncError, SyncReference syncReference) {
							if (syncError == null) {
								//System.err.println("setValue ok ");
							}
						}
					});*/
			//详情页放进队列
			page.addTargetRequest(url);
		}
	}


	@Override
	public Site getSite() {
		return site;
	}

	public void start(OOPPageProcessor processor) {
		initWilddog();

		long start = System.currentTimeMillis();
		FLAG_FIRST = true;
		Spider.create(processor)
				.addUrl(BASE_URL)
				.setDownloader(new HttpClientDownloader())
				.thread(2)
				.run();
		long end = System.currentTimeMillis();
		System.out.println("爬虫结束,耗时--->" + EliseUtils.parseMillisecone(end - start));
	}

	//野狗云的

	private void initWilddog() {
		// 初始化
		WilddogOptions options = new WilddogOptions.Builder().setSyncUrl("https://wd9364851068tbnqkr.wilddogio.com").build();
		WilddogApp.initializeApp(options);
		getSyncReference();
	}

	private SyncReference syncReference;

	private SyncReference getSyncReference() {
		if (syncReference == null) {
			syncReference = WilddogSync.getInstance().getReference();
		}
		return syncReference;
	}

}
