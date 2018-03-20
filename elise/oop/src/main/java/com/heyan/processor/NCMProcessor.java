package com.heyan.processor;

import com.google.gson.Gson;
import com.heyan.domain.LyricRep;
import com.heyan.domain.PlayListRep;
import com.heyan.entity.Lyric;
import com.heyan.entity.Song;
import com.heyan.repository.LyricRepository;
import com.heyan.repository.SongRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * Created by Ezio on 2017/01/09.
 */

@Component
public class NCMProcessor implements PageProcessor {


	// 设置编码 ，超时时间，重试次数，
	private Site site = Site.me().setRetryTimes(10).setSleepTime(5000).setTimeOut(5000)
			.addCookie("Domain", BASE_URL)
			.setCharset("utf-8")
			.setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.89 Safari/537.36");

	public static final String BASE_URL = "http://oh.lihaotian.me:3000";
	public static final String PLAY_LIST = "/playlist/detail?id=";
	public static final String SONG_LYRIC = "/lyric?id=";
	public static final String LIZHI_ = "2120018129";


	@Autowired
	private SongRepository songRepository;
	@Autowired
	private LyricRepository lyricRepository;

	@Override
	public void process(Page page) {
		//page 分2种 歌单(歌曲)，歌词;
		if (page.getUrl().toString().contains(PLAY_LIST)) {
			//歌单(歌曲)
			PlayListRep rep = new Gson().fromJson(page.getRawText(), PlayListRep.class);
			rep.getPlaylist().getTracks().stream().map(e -> {
				Song song = Song.translationFromTrack(e);
				//songRepository.saveAndFlush(song);
				return e.getId();
			}).forEach(e -> {
				//将歌曲Id 放入歌词请求队列
				page.addTargetRequest(BASE_URL + SONG_LYRIC + e);
			});

		} else if (page.getUrl().toString().contains(SONG_LYRIC)) {
			//歌词
			LyricRep rep = new Gson().fromJson(page.getRawText(), LyricRep.class);
			Lyric lyric = new Lyric();
			String url = page.getUrl().toString();
			String[] split = url.split("=");
			Integer songId = Integer.parseInt(split[split.length-1]);
			lyric.setSongId(songId);
			lyric.setNolyric(rep.isNolyric());
			if (!lyric.isNolyric()){
				LyricRep.LrcBean lrc = rep.getLrc();
				lyric.setLyricText(lrc.getLyric());
				lyric.setVersion(lrc.getVersion());
			}

			lyricRepository.saveAndFlush(lyric);
			//System.err.println(" 歌词---> "+ );
		}

	}


	@Override
	public Site getSite() {
		return site;
	}


	public void start(NCMProcessor processor) {

		Site site = new Site();
		site.setCharset("UTF-8");
		Spider.create(processor)
				.addUrl(BASE_URL + PLAY_LIST + LIZHI_)
				.thread(3)
				.run();

	}


}
