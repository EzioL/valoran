package com.heyan;


import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Encoder;

/**
 * Created by Ezio on 2017/7/12.
 */
public class EliseUtils {
//	public static String crawlAjaxUrl(String songId, int offset) {
//
//		CloseableHttpClient httpclient = HttpClients.createDefault();
//		CloseableHttpResponse response = null;
//		String first_param = "{rid:\"\", offset:\"offset_param\", total:\"true\", limit:\"20\", csrf_token:\"\"}";
//		first_param = first_param.replace("offset_param", offset + "");
//		//first_param = first_param.replace("limit_param", ONE_PAGE + "");
//		try {
//			// 参数加密
//			// 16位随机字符串，直接FFF
//			// String secKey = new BigInteger(100, new SecureRandom()).toString(32).substring(0, 16);
//			String secKey = "FFFFFFFFFFFFFFFF";
//			// EliseUtils
//			String encText = EliseUtils.aesEncrypt(aesEncrypt(first_param, "0CoJUm6Qyw8W8jud"), secKey);
//			//
//			String encSecKey = rsaEncrypt();
//
//			HttpPost httpPost = new HttpPost("http://music.163.com/weapi/v1/resource/comments/R_SO_4_" + songId + "/?csrf_token=");
//			httpPost.addHeader("Referer", NetEaseMusicPageProcessor.BASE_URL);
//
//			List<NameValuePair> ls = new ArrayList<NameValuePair>();
//			ls.add(new BasicNameValuePair("params", encText));
//			ls.add(new BasicNameValuePair("encSecKey", encSecKey));
//
//			UrlEncodedFormEntity paramEntity = new UrlEncodedFormEntity(ls, "utf-8");
//			httpPost.setEntity(paramEntity);
//
//			response = httpclient.execute(httpPost);
//			HttpEntity entity = response.getEntity();
//
//			if (entity != null) {
//				return EntityUtils.toString(entity, "utf-8");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				response.close();
//				httpclient.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//		return "";
//	}

	/**
	 * ASE-128-CBC加密模式可以需要16位
	 *
	 * @param src 加密内容
	 * @param key 密钥
	 * @return
	 */
	public static String aesEncrypt(String src, String key) throws Exception {
		String encodingFormat = "UTF-8";
		String iv = "0102030405060708";

		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		byte[] raw = key.getBytes();
		SecretKeySpec secretKeySpec = new SecretKeySpec(raw, "AES");
		IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
		// 使用CBC模式，需要一个向量vi，增加加密算法强度
		cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
		byte[] encrypted = cipher.doFinal(src.getBytes(encodingFormat));
		return new BASE64Encoder().encode(encrypted);

	}

	public static String rsaEncrypt() {
		String secKey = "257348aecb5e556c066de214e531faadd1c55d814f9be95fd06d6bff9f4c7a41f831f6394d5a3fd2e3881736d94a02ca919d952872e7d0a50ebfa1769a7a62d512f5f1ca21aec60bc3819a9c3ffca5eca9a0dba6d6f7249b06f5965ecfff3695b54e1c28f3f624750ed39e7de08fc8493242e26dbc4484a01c76f739e135637c";
		return secKey;
	}

	public static String parseMillisecone(long millisecond) {
		String time = null;
		try {
			long yushu_day = millisecond % (1000 * 60 * 60 * 24);
			long yushu_hour = (millisecond % (1000 * 60 * 60 * 24))
					% (1000 * 60 * 60);
			long yushu_minute = millisecond % (1000 * 60 * 60 * 24)
					% (1000 * 60 * 60) % (1000 * 60);
			@SuppressWarnings("unused")
			long yushu_second = millisecond % (1000 * 60 * 60 * 24)
					% (1000 * 60 * 60) % (1000 * 60) % 1000;
			if (yushu_day == 0) {
				return (millisecond / (1000 * 60 * 60 * 24)) + "天";
			} else {
				if (yushu_hour == 0) {
					return (millisecond / (1000 * 60 * 60 * 24)) + "天"
							+ (yushu_day / (1000 * 60 * 60)) + "时";
				} else {
					if (yushu_minute == 0) {
						return (millisecond / (1000 * 60 * 60 * 24)) + "天"
								+ (yushu_day / (1000 * 60 * 60)) + "时"
								+ (yushu_hour / (1000 * 60)) + "分";
					} else {
						return (millisecond / (1000 * 60 * 60 * 24)) + "天"
								+ (yushu_day / (1000 * 60 * 60)) + "时"
								+ (yushu_hour / (1000 * 60)) + "分"
								+ (yushu_minute / 1000) + "秒";

					}

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return time;
	}

	/*
	 * 将时间戳转换为时间
     */
	public static String stampToDate(long s) {
		String res;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long lt = s;
		Date date = new Date(lt);
		res = simpleDateFormat.format(date);
		return res;
	}

	/**
	 * 将emoji表情替换成*
	 *
	 * @param source
	 * @return 过滤后的字符串
	 */
	public static String filterEmoji(String source) {
		if (StringUtils.isNotBlank(source)) {
			return source.replaceAll("[\\ud800\\udc00-\\udbff\\udfff\\ud800-\\udfff]", "*");
		} else {
			return source;
		}
	}


	public static String getCities(String path) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(
					"src/json/HK_geo.json"));// 读取原始json文件
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static Integer getIntegerFromString(String line){
		String pattern = "[^0-9]";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);
		String s = m.replaceAll("").trim();
		return  Integer.parseInt(s);

	}

}
