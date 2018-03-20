package com.heyan.domain;

import lombok.Data;

/**
 * Created by Ezio on 2018/2/28.
 */
@Data
public class LyricRep {

	/**
	 * sgc : false
	 * sfy : false
	 * qfy : false
	 * lrc : {"version":40,"lyric":"[00:01.399]飞机飞过天空，天空之城\n[00:09.650]落雨下的黄昏的我们\n[00:16.659]此刻我在异乡的夜里\n[00:24.360]感觉着你忽明忽暗\n[00:29.280]\n[00:31.300]我想回到过去，沉默着欢喜\n[00:39.220]天空之城在哭泣，越来越明亮的你\n[00:46.410]爱情不过是生活的屁\n[00:53.470]折磨着我也折磨着你\n[00:57.990]\n[01:00.000]港岛妹妹，你献给我的西班牙馅饼\n[01:07.500]甜蜜地融化了我，天空之城在哭泣\n[01:14.520]港岛妹妹，我们曾拥有的甜蜜的爱情\n[01:22.110]疯狂地撕裂了我，天空之城在哭泣\n[01:30.600]\n[01:58.980]港岛妹妹，你献给我的西班牙馅饼\n[02:07.100]甜蜜地融化了我，天空之城在哭泣\n[02:13.899]港岛妹妹，我们曾拥有的甜蜜的爱情\n[02:21.099]疯狂地撕裂了我，天空之城在哭泣\n[02:28.479]港岛妹妹，你献给我的西班牙馅饼\n[02:36.309]甜蜜地融化了我，天空之城在哭泣\n[02:43.439]港岛妹妹，我们曾拥有的甜蜜的爱情\n[02:51.489]疯狂地撕裂了我，天空之城在哭泣\n[02:58.300]\n[03:04.090]有人路过那里，回来告诉我\n[03:11.409]天空之城在哭泣，无法呼吸的你\n[03:19.390]此刻我在异乡的夜里\n[03:26.099]想念着你越来越远\n"}
	 * klyric : {"version":0,"lyric":null}
	 * tlyric : {"version":0,"lyric":null}
	 * code : 200
	 */

	private boolean sgc;
	private boolean sfy;
	private boolean qfy;
	private LrcBean lrc;
	private KlyricBean klyric;
	private TlyricBean tlyric;
	private int code;
	/**
	 * nolyric : true
	 */

	private boolean nolyric;

	public boolean isSgc() {
		return sgc;
	}

	public void setSgc(boolean sgc) {
		this.sgc = sgc;
	}

	public boolean isSfy() {
		return sfy;
	}

	public void setSfy(boolean sfy) {
		this.sfy = sfy;
	}

	public boolean isQfy() {
		return qfy;
	}

	public void setQfy(boolean qfy) {
		this.qfy = qfy;
	}

	public LrcBean getLrc() {
		return lrc;
	}

	public void setLrc(LrcBean lrc) {
		this.lrc = lrc;
	}

	public KlyricBean getKlyric() {
		return klyric;
	}

	public void setKlyric(KlyricBean klyric) {
		this.klyric = klyric;
	}

	public TlyricBean getTlyric() {
		return tlyric;
	}

	public void setTlyric(TlyricBean tlyric) {
		this.tlyric = tlyric;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public boolean isNolyric() {
		return nolyric;
	}

	public void setNolyric(boolean nolyric) {
		this.nolyric = nolyric;
	}

	public static class LrcBean {
		/**
		 * version : 40
		 * lyric : [00:01.399]飞机飞过天空，天空之城
		 [00:09.650]落雨下的黄昏的我们
		 [00:16.659]此刻我在异乡的夜里
		 [00:24.360]感觉着你忽明忽暗
		 [00:29.280]
		 [00:31.300]我想回到过去，沉默着欢喜
		 [00:39.220]天空之城在哭泣，越来越明亮的你
		 [00:46.410]爱情不过是生活的屁
		 [00:53.470]折磨着我也折磨着你
		 [00:57.990]
		 [01:00.000]港岛妹妹，你献给我的西班牙馅饼
		 [01:07.500]甜蜜地融化了我，天空之城在哭泣
		 [01:14.520]港岛妹妹，我们曾拥有的甜蜜的爱情
		 [01:22.110]疯狂地撕裂了我，天空之城在哭泣
		 [01:30.600]
		 [01:58.980]港岛妹妹，你献给我的西班牙馅饼
		 [02:07.100]甜蜜地融化了我，天空之城在哭泣
		 [02:13.899]港岛妹妹，我们曾拥有的甜蜜的爱情
		 [02:21.099]疯狂地撕裂了我，天空之城在哭泣
		 [02:28.479]港岛妹妹，你献给我的西班牙馅饼
		 [02:36.309]甜蜜地融化了我，天空之城在哭泣
		 [02:43.439]港岛妹妹，我们曾拥有的甜蜜的爱情
		 [02:51.489]疯狂地撕裂了我，天空之城在哭泣
		 [02:58.300]
		 [03:04.090]有人路过那里，回来告诉我
		 [03:11.409]天空之城在哭泣，无法呼吸的你
		 [03:19.390]此刻我在异乡的夜里
		 [03:26.099]想念着你越来越远

		 */

		private int version;
		private String lyric;

		public int getVersion() {
			return version;
		}

		public void setVersion(int version) {
			this.version = version;
		}

		public String getLyric() {
			return lyric;
		}

		public void setLyric(String lyric) {
			this.lyric = lyric;
		}
	}

	public static class KlyricBean {
		/**
		 * version : 0
		 * lyric : null
		 */

		private int version;
		private Object lyric;

		public int getVersion() {
			return version;
		}

		public void setVersion(int version) {
			this.version = version;
		}

		public Object getLyric() {
			return lyric;
		}

		public void setLyric(Object lyric) {
			this.lyric = lyric;
		}
	}

	public static class TlyricBean {
		/**
		 * version : 0
		 * lyric : null
		 */

		private int version;
		private Object lyric;

		public int getVersion() {
			return version;
		}

		public void setVersion(int version) {
			this.version = version;
		}

		public Object getLyric() {
			return lyric;
		}

		public void setLyric(Object lyric) {
			this.lyric = lyric;
		}
	}
}
