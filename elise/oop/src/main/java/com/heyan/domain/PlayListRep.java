package com.heyan.domain;

import java.util.List;

import lombok.Data;

/**
 * Created by Ezio on 2018/2/28.
 */
@Data
public class PlayListRep {

	/**
	 * playlist : {"subscribers":[],"subscribed":false,"creator":{"defaultAvatar":false,"province":410000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/rFgHGoeQ7uVaHZMoKFU4xw==/109951162997130622.jpg","accountStatus":0,"gender":1,"city":410100,"birthday":777788259424,"userId":119543810,"userType":0,"nickname":"褐言_","signature":"这个世界会好吗","description":"","detailDescription":"","avatarImgId":109951162997130622,"backgroundImgId":1364493994711367,"backgroundUrl":"http://p1.music.126.net/DIKr8dvhHZpVNEYq1nPKGQ==/1364493994711367.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"avatarImgIdStr":"109951162997130622","backgroundImgIdStr":"1364493994711367","avatarImgId_str":"109951162997130622"},"tracks":[{"name":"天空之城","id":26508186,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":15,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":223015,"h":{"br":320000,"fid":0,"size":8947321,"vd":-0.89},"m":{"br":160000,"fid":0,"size":4485085,"vd":-0.47},"l":{"br":96000,"fid":0,"size":2700191,"vd":-0.48},"a":null,"cd":"1","no":5,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007,"tns":["Be With You"]},{"name":"关于郑州的记忆","id":25867002,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":26,"crbt":null,"cf":"","al":{"id":2336486,"name":"你好,郑州","picUrl":"http://p1.music.126.net/80diFjTazGCdf0Ql3HAqGA==/2296879790481625.jpg","tns":[],"pic":2296879790481625},"dt":228146,"h":{"br":320000,"fid":0,"size":9145643,"vd":0.573325},"m":{"br":160000,"fid":0,"size":4581007,"vd":0.551266},"l":{"br":96000,"fid":0,"size":2755153,"vd":-2.65076E-4},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":290061,"publishTime":1283270400007},{"name":"梵高先生","id":26508240,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":22,"crbt":null,"cf":"","al":{"id":2515029,"name":"梵高先生","picUrl":"http://p1.music.126.net/UuSe-Vc6rS7JtRJSQgDU2g==/2323268069553116.jpg","tns":[],"pic":2323268069553116},"dt":249746,"h":{"br":320000,"fid":0,"size":9992402,"vd":-0.48},"m":{"br":160000,"fid":0,"size":4996223,"vd":-0.04},"l":{"br":96000,"fid":0,"size":2997751,"vd":-0.05},"a":null,"cd":"1","no":6,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1126713600000},{"name":"你离开了南京，从此没有人和我说话","id":26508242,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":22,"crbt":null,"cf":"","al":{"id":2515029,"name":"梵高先生","picUrl":"http://p1.music.126.net/UuSe-Vc6rS7JtRJSQgDU2g==/2323268069553116.jpg","tns":[],"pic":2323268069553116},"dt":71813,"h":{"br":320000,"fid":0,"size":2875602,"vd":-2.51},"m":{"br":160000,"fid":0,"size":1437823,"vd":-2.08},"l":{"br":96000,"fid":0,"size":862711,"vd":-2.06},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1126713600000},{"name":"和你在一起","id":26523120,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":26,"crbt":null,"cf":"","al":{"id":2518001,"name":"这个世界会好吗","picUrl":"http://p1.music.126.net/JUE7I2P9IwGOLPtxGvtTnQ==/2399134371866485.jpg","tns":[],"pic":2399134371866485},"dt":251933,"h":{"br":320000,"fid":0,"size":10080173,"vd":-0.71},"m":{"br":160000,"fid":0,"size":5040109,"vd":-0.27},"l":{"br":96000,"fid":0,"size":3024083,"vd":-0.26},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1150300800000},{"name":"米店","id":26522011,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":210999,"h":{"br":320000,"fid":0,"size":8466664,"vd":-0.56},"m":{"br":160000,"fid":0,"size":4244755,"vd":-0.12},"l":{"br":96000,"fid":0,"size":2555991,"vd":-0.15},"a":null,"cd":"1","no":13,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007},{"name":"热河","id":29724295,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":21,"crbt":null,"cf":"","al":{"id":3056371,"name":"1701","picUrl":"http://p1.music.126.net/t0RSGoEnZ_OGIMvwXCevMQ==/3228166139854194.jpg","tns":[],"pic":3228166139854194},"dt":406538,"h":{"br":320000,"fid":0,"size":16263950,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":8132033,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":4879266,"vd":-2.65076E-4},"a":null,"cd":"1","no":6,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1415808000000},{"name":"山阴路的夏天","id":26508232,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":16,"crbt":null,"cf":"","al":{"id":2515028,"name":"F","picUrl":"http://p1.music.126.net/7w7pX7BKTdBcFF1AtuZC2g==/5957153999486269.jpg","tns":[],"pic":5957153999486269},"dt":278024,"h":{"br":320000,"fid":0,"size":11124107,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5562116,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":3337320,"vd":-2.65076E-4},"a":null,"cd":"1","no":5,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":313139,"publishTime":1317225600007},{"name":"定西","id":29724292,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":13,"crbt":null,"cf":"","al":{"id":3056371,"name":"1701","picUrl":"http://p1.music.126.net/t0RSGoEnZ_OGIMvwXCevMQ==/3228166139854194.jpg","tns":[],"pic":3228166139854194},"dt":295882,"h":{"br":320000,"fid":0,"size":11837763,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5918939,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":3551409,"vd":-2.65076E-4},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1415808000000},{"name":"寻找","id":26508228,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":16,"crbt":null,"cf":"","al":{"id":2515028,"name":"F","picUrl":"http://p1.music.126.net/7w7pX7BKTdBcFF1AtuZC2g==/5957153999486269.jpg","tns":[],"pic":5957153999486269},"dt":225071,"h":null,"m":{"br":160000,"fid":0,"size":4513054,"vd":0.417572},"l":{"br":96000,"fid":0,"size":2713530,"vd":0.324343},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":290060,"publishTime":1317225600007},{"name":"忽然","id":26353044,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":12,"crbt":null,"cf":"","al":{"id":2336486,"name":"你好,郑州","picUrl":"http://p1.music.126.net/80diFjTazGCdf0Ql3HAqGA==/2296879790481625.jpg","tns":[],"pic":2296879790481625},"dt":126853,"h":{"br":320000,"fid":0,"size":5094564,"vd":1.67599},"m":{"br":160000,"fid":0,"size":2555463,"vd":2.05952},"l":{"br":96000,"fid":0,"size":1539822,"vd":2.32495},"a":null,"cd":"1","no":4,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1283270400007},{"name":"送别","id":435948318,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":14,"crbt":null,"cf":"","al":{"id":34914649,"name":"《8》","picUrl":"http://p1.music.126.net/My-dbWJBANW4qr5CCqIiAw==/17684545021514178.jpg","tns":[],"pic_str":"17684545021514178","pic":17684545021514178},"dt":202427,"h":{"br":320000,"fid":0,"size":8100093,"vd":0.0782854},"m":{"br":160000,"fid":0,"size":4050069,"vd":0.505068},"l":{"br":96000,"fid":0,"size":2430059,"vd":0.234009},"a":null,"cd":"1","no":9,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":0,"publishTime":1476761806570},{"name":"你离开了南京，从此没有人和我说话 2015现场版","id":34200930,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":10,"crbt":null,"cf":"","al":{"id":3117093,"name":"看见","picUrl":"http://p1.music.126.net/dG7OF1YlLQRlDStqHScJoQ==/2943392627712408.jpg","tns":[],"pic":2943392627712408},"dt":124648,"h":{"br":320000,"fid":0,"size":4988386,"vd":5.64018},"m":{"br":160000,"fid":0,"size":2494215,"vd":6.16521},"l":{"br":96000,"fid":0,"size":1496546,"vd":6.15497},"a":null,"cd":"1","no":5,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1435334400007},{"name":"和你在一起2013版[Live]","id":28406900,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":16,"crbt":null,"cf":"","al":{"id":2786478,"name":"勾三搭四（2013 Live）","picUrl":"http://p1.music.126.net/q-V2SNRZhYo9sgftJm-olA==/5961552045955874.jpg","tns":[],"pic":5961552045955874},"dt":261781,"h":{"br":320000,"fid":0,"size":10472010,"vd":-0.65},"m":{"br":160000,"fid":0,"size":5236027,"vd":-0.24},"l":{"br":96000,"fid":0,"size":3141634,"vd":-0.26},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":294032,"publishTime":1396281600007,"tns":["Be With You"]},{"name":"墙上的向日葵(2014i/O版)","id":30212877,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":25,"crbt":null,"cf":"","al":{"id":3091514,"name":"i/O（2014 Live）","picUrl":"http://p1.music.126.net/g8rtg6LCWuENs4pgZeTyvg==/2539871863244150.jpg","tns":[],"pic":2539871863244150},"dt":482246,"h":{"br":320000,"fid":0,"size":19291994,"vd":-0.31},"m":{"br":160000,"fid":0,"size":9646019,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":5787629,"vd":-2.65076E-4},"a":null,"cd":"1","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":386086,"publishTime":1426003200007},{"name":"热河 2015现场版","id":34200934,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":10,"crbt":null,"cf":"","al":{"id":3117093,"name":"看见","picUrl":"http://p1.music.126.net/dG7OF1YlLQRlDStqHScJoQ==/2943392627712408.jpg","tns":[],"pic":2943392627712408},"dt":484500,"h":{"br":320000,"fid":0,"size":19382900,"vd":-0.95},"m":{"br":160000,"fid":0,"size":9691472,"vd":-0.53},"l":{"br":96000,"fid":0,"size":5814901,"vd":-0.59},"a":null,"cd":"1","no":7,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1435334400007},{"name":"鸵鸟&天空之城&我们不能失去信仰(2014i/O版)","id":30967318,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":19,"crbt":null,"cf":"","al":{"id":3091514,"name":"i/O（2014 Live）","picUrl":"http://p1.music.126.net/g8rtg6LCWuENs4pgZeTyvg==/2539871863244150.jpg","tns":[],"pic":2539871863244150},"dt":606119,"h":{"br":320000,"fid":0,"size":24246900,"vd":-0.36},"m":{"br":160000,"fid":0,"size":12123472,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":7274101,"vd":-0.02},"a":null,"cd":"1","no":10,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1426003200007},{"name":"结婚","id":26508184,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":352620,"h":{"br":320000,"fid":0,"size":14131056,"vd":0},"m":{"br":160000,"fid":0,"size":7076951,"vd":0.346384},"l":{"br":96000,"fid":0,"size":4255308,"vd":-2.65076E-4},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007},{"name":"谁他妈没织过毛衣","id":28590174,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":673,"crbt":null,"cf":"","al":{"id":2847068,"name":"热门华语219","picUrl":"http://p1.music.126.net/wKd7AutpY4Z7_Hxisi9ZEw==/3306231465784387.jpg","tns":[],"pic":3306231465784387},"dt":138266,"h":null,"m":{"br":128000,"fid":0,"size":2232637,"vd":1.75382},"l":{"br":96000,"fid":0,"size":1680094,"vd":2.24838},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":0,"publishTime":1388505600004},{"name":"听妈妈讲那过去的事情","id":26522009,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":169693,"h":{"br":320000,"fid":0,"size":6814696,"vd":-1.54},"m":{"br":160000,"fid":0,"size":3418779,"vd":-1.1},"l":{"br":96000,"fid":0,"size":2060412,"vd":-1.1},"a":null,"cd":"1","no":11,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":14031,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007},{"name":"杭州","id":26508235,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":16,"crbt":null,"cf":"","al":{"id":2515028,"name":"F","picUrl":"http://p1.music.126.net/7w7pX7BKTdBcFF1AtuZC2g==/5957153999486269.jpg","tns":[],"pic":5957153999486269},"dt":238178,"h":{"br":320000,"fid":0,"size":9529577,"vd":-3.3},"m":{"br":160000,"fid":0,"size":4764843,"vd":-2.87},"l":{"br":96000,"fid":0,"size":2858949,"vd":-2.91},"a":null,"cd":"1","no":8,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":290064,"publishTime":1317225600007},{"name":"再见","id":26522014,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":88879,"h":{"br":320000,"fid":0,"size":3581766,"vd":-1.96},"m":{"br":160000,"fid":0,"size":1802306,"vd":-1.51},"l":{"br":96000,"fid":0,"size":1090521,"vd":-1.54},"a":null,"cd":"1","no":16,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007},{"name":"被禁忌的游戏","id":26508205,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":15,"crbt":null,"cf":"","al":{"id":2515026,"name":"被禁忌的游戏","picUrl":"http://p1.music.126.net/cYGiS-NIhAElWdpFkyFqFQ==/2378243650941258.jpg","tns":[],"pic":2378243650941258},"dt":377826,"h":{"br":320000,"fid":0,"size":15115537,"vd":4.95029},"m":{"br":160000,"fid":0,"size":7557791,"vd":4.91707},"l":{"br":96000,"fid":0,"size":4534692,"vd":4.59759},"a":null,"cd":"1","no":7,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1101830400000},{"name":"回答","id":478490652,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":15,"crbt":null,"cf":"","al":{"id":35501199,"name":"李志、电声与管弦乐","picUrl":"http://p1.music.126.net/aQwr_LalAJJ03qDW6JivUg==/18574049929931926.jpg","tns":[],"pic_str":"18574049929931926","pic":18574049929931926},"dt":378378,"h":{"br":320000,"fid":0,"size":15137480,"vd":-2.42},"m":{"br":160000,"fid":0,"size":7568763,"vd":-2},"l":{"br":96000,"fid":0,"size":4541276,"vd":-2.06},"a":null,"cd":"1","no":12,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":5606607,"publishTime":1494864000007},{"name":"苍井空","id":26508183,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":260290,"h":{"br":320000,"fid":0,"size":10438389,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5230618,"vd":0.0188411},"l":{"br":96000,"fid":0,"size":3147509,"vd":-2.65076E-4},"a":null,"cd":"1","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007},{"name":"黑色信封 (2016 unplugged)","id":424474911,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":6,"crbt":null,"cf":"","al":{"id":34808540,"name":"李志北京不插电现场 2016.5.29","picUrl":"http://p1.music.126.net/RN-nvLgMuLujEvbMRUFQvA==/3420580718570196.jpg","tns":[],"pic":3420580718570196},"dt":280207,"h":{"br":320000,"fid":0,"size":11210754,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5605400,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":3363258,"vd":-2.65076E-4},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":433013,"rtype":0,"rurl":null,"mv":0,"publishTime":1470844800007},{"name":"兰花草","id":435948312,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":34914649,"name":"《8》","picUrl":"http://p1.music.126.net/My-dbWJBANW4qr5CCqIiAw==/17684545021514178.jpg","tns":[],"pic_str":"17684545021514178","pic":17684545021514178},"dt":164025,"h":{"br":320000,"fid":0,"size":6564093,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":3282069,"vd":0.0265486},"l":{"br":96000,"fid":0,"size":1969259,"vd":-2.65076E-4},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":0,"publishTime":1476761806570},{"name":"想起了她","id":26508244,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":23,"crbt":null,"cf":"","al":{"id":2515029,"name":"梵高先生","picUrl":"http://p1.music.126.net/UuSe-Vc6rS7JtRJSQgDU2g==/2323268069553116.jpg","tns":[],"pic":2323268069553116},"dt":273493,"h":{"br":320000,"fid":0,"size":10942214,"vd":0.27769},"m":{"br":160000,"fid":0,"size":5471129,"vd":0.67415},"l":{"br":96000,"fid":0,"size":3282695,"vd":0.677875},"a":null,"cd":"1","no":7,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1126713600000},{"name":"妈妈","id":26523123,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":15,"crbt":null,"cf":"","al":{"id":2518001,"name":"这个世界会好吗","picUrl":"http://p1.music.126.net/JUE7I2P9IwGOLPtxGvtTnQ==/2399134371866485.jpg","tns":[],"pic":2399134371866485},"dt":244106,"h":{"br":320000,"fid":0,"size":9766704,"vd":0.39},"m":{"br":160000,"fid":0,"size":4883374,"vd":0.84},"l":{"br":96000,"fid":0,"size":2930042,"vd":0.82},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1150300800000},{"name":"鸵鸟 (2016 unplugged)","id":424477861,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":6,"crbt":null,"cf":"","al":{"id":34808540,"name":"李志北京不插电现场 2016.5.29","picUrl":"http://p1.music.126.net/RN-nvLgMuLujEvbMRUFQvA==/3420580718570196.jpg","tns":[],"pic":3420580718570196},"dt":259011,"h":{"br":320000,"fid":0,"size":10363342,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5181694,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":3109034,"vd":-2.65076E-4},"a":null,"cd":"1","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":433013,"rtype":0,"rurl":null,"mv":0,"publishTime":1470844800007},{"name":"门","id":26508230,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":14,"crbt":null,"cf":"","al":{"id":2515028,"name":"F","picUrl":"http://p1.music.126.net/7w7pX7BKTdBcFF1AtuZC2g==/5957153999486269.jpg","tns":[],"pic":5957153999486269},"dt":386756,"h":{"br":320000,"fid":0,"size":15472953,"vd":-0.83},"m":{"br":160000,"fid":0,"size":7736529,"vd":-0.39},"l":{"br":96000,"fid":0,"size":4641959,"vd":-0.41},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1317225600007},{"name":"尽头","id":478490647,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":15,"crbt":null,"cf":"","al":{"id":35501199,"name":"李志、电声与管弦乐","picUrl":"http://p1.music.126.net/aQwr_LalAJJ03qDW6JivUg==/18574049929931926.jpg","tns":[],"pic_str":"18574049929931926","pic":18574049929931926},"dt":258538,"h":{"br":320000,"fid":0,"size":10344533,"vd":-1.87},"m":{"br":160000,"fid":0,"size":5172289,"vd":-1.44},"l":{"br":96000,"fid":0,"size":3103391,"vd":-1.47},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":5606623,"publishTime":1494864000007},{"name":"春末的南方城市 (2016 unplugged)","id":424474922,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":6,"crbt":null,"cf":"","al":{"id":34808540,"name":"李志北京不插电现场 2016.5.29","picUrl":"http://p1.music.126.net/RN-nvLgMuLujEvbMRUFQvA==/3420580718570196.jpg","tns":[],"pic":3420580718570196},"dt":404475,"h":{"br":320000,"fid":0,"size":16181333,"vd":-1.38},"m":{"br":160000,"fid":0,"size":8090689,"vd":-0.94},"l":{"br":96000,"fid":0,"size":4854431,"vd":-0.97},"a":null,"cd":"1","no":10,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":433013,"rtype":0,"rurl":null,"mv":0,"publishTime":1470844800007},{"name":"铅笔","id":478490649,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":15,"crbt":null,"cf":"","al":{"id":35501199,"name":"李志、电声与管弦乐","picUrl":"http://p1.music.126.net/aQwr_LalAJJ03qDW6JivUg==/18574049929931926.jpg","tns":[],"pic_str":"18574049929931926","pic":18574049929931926},"dt":312432,"h":{"br":320000,"fid":0,"size":12500158,"vd":-1.79},"m":{"br":160000,"fid":0,"size":6250102,"vd":-1.37},"l":{"br":96000,"fid":0,"size":3750079,"vd":-1.42},"a":null,"cd":"1","no":7,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":5606610,"publishTime":1494864000007},{"name":"序曲","id":478491639,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":15,"crbt":null,"cf":"","al":{"id":35501199,"name":"李志、电声与管弦乐","picUrl":"http://p1.music.126.net/aQwr_LalAJJ03qDW6JivUg==/18574049929931926.jpg","tns":[],"pic_str":"18574049929931926","pic":18574049929931926},"dt":289756,"h":{"br":320000,"fid":0,"size":11593187,"vd":-1.81},"m":{"br":160000,"fid":0,"size":5796616,"vd":-1.39},"l":{"br":96000,"fid":0,"size":3477987,"vd":-1.45},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":5606632,"publishTime":1494864000007},{"name":"Hey Jude","id":435948315,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":17,"crbt":null,"cf":"","al":{"id":34914649,"name":"《8》","picUrl":"http://p1.music.126.net/My-dbWJBANW4qr5CCqIiAw==/17684545021514178.jpg","tns":[],"pic_str":"17684545021514178","pic":17684545021514178},"dt":263592,"h":{"br":320000,"fid":0,"size":10546199,"vd":0.0641205},"m":{"br":160000,"fid":0,"size":5273122,"vd":0.345832},"l":{"br":96000,"fid":0,"size":3163891,"vd":0.173223},"a":null,"cd":"1","no":6,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":5619842,"publishTime":1476761806570},{"name":"董卓瑶","id":26508239,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":22,"crbt":null,"cf":"","al":{"id":2515029,"name":"梵高先生","picUrl":"http://p1.music.126.net/UuSe-Vc6rS7JtRJSQgDU2g==/2323268069553116.jpg","tns":[],"pic":2323268069553116},"dt":197786,"h":{"br":320000,"fid":0,"size":7914100,"vd":-1.92},"m":{"br":160000,"fid":0,"size":3957072,"vd":-1.5},"l":{"br":96000,"fid":0,"size":2374261,"vd":-1.52},"a":null,"cd":"1","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1126713600000},{"name":"鼠说","id":29724291,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":0,"v":11,"crbt":null,"cf":"","al":{"id":3056371,"name":"1701","picUrl":"http://p1.music.126.net/t0RSGoEnZ_OGIMvwXCevMQ==/3228166139854194.jpg","tns":[],"pic":3228166139854194},"dt":317184,"h":{"br":320000,"fid":0,"size":12690399,"vd":-0.88},"m":{"br":160000,"fid":0,"size":6345257,"vd":-0.44},"l":{"br":96000,"fid":0,"size":3807200,"vd":-0.48},"a":null,"cd":"1","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1415808000000},{"name":"不多","id":29724294,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":0,"v":11,"crbt":null,"cf":"","al":{"id":3056371,"name":"1701","picUrl":"http://p1.music.126.net/t0RSGoEnZ_OGIMvwXCevMQ==/3228166139854194.jpg","tns":[],"pic":3228166139854194},"dt":236541,"h":{"br":320000,"fid":0,"size":9464799,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":4732457,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":2839520,"vd":-2.65076E-4},"a":null,"cd":"1","no":5,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1415808000000},{"name":"九月","id":26508221,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":"","fee":0,"v":14,"crbt":null,"cf":"","al":{"id":2515027,"name":"工体东路没有人","picUrl":"http://p1.music.126.net/iKd_lDlSm37GsoAz5ERGmQ==/5883486720419469.jpg","tns":[],"pic":5883486720419469},"dt":264986,"h":null,"m":{"br":158000,"fid":0,"size":5277724,"vd":0},"l":{"br":96000,"fid":0,"size":3196471,"vd":0},"a":null,"cd":"1","no":10,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1231603200007},{"name":"一头偶像","id":440411394,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":["A Piece of Idol"],"pop":95,"st":0,"rt":null,"fee":8,"v":5,"crbt":null,"cf":"","al":{"id":34984288,"name":"在每一条伤心的应天大街上","picUrl":"http://p1.music.126.net/Nax0AgExEk_M6RPX7vffqA==/18627925998890851.jpg","tns":[],"pic_str":"18627925998890851","pic":18627925998890851},"dt":222593,"h":{"br":320000,"fid":0,"size":8906754,"vd":-2.95},"m":{"br":160000,"fid":0,"size":4453400,"vd":-2.51},"l":{"br":96000,"fid":0,"size":2672058,"vd":-2.54},"a":null,"cd":"1","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":433013,"rtype":0,"rurl":null,"mv":0,"publishTime":1479571200007},{"name":"采蘑菇的小姑娘","id":435948316,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":34914649,"name":"《8》","picUrl":"http://p1.music.126.net/My-dbWJBANW4qr5CCqIiAw==/17684545021514178.jpg","tns":[],"pic_str":"17684545021514178","pic":17684545021514178},"dt":132703,"h":{"br":320000,"fid":0,"size":5311260,"vd":-0.13},"m":{"br":160000,"fid":0,"size":2655653,"vd":0},"l":{"br":96000,"fid":0,"size":1593409,"vd":-2.65076E-4},"a":null,"cd":"1","no":7,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":0,"publishTime":1476761806570},{"name":"普希金 (2015动静版)","id":406072281,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]},{"id":7536,"name":"丁薇","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":8,"v":6,"crbt":null,"cf":"","al":{"id":34527676,"name":"动静（2015Live）","picUrl":"http://p1.music.126.net/PNWRoOw2UyHKE7eSo4NKHQ==/1375489048830535.jpg","tns":[],"pic":1375489048830535},"dt":273280,"h":{"br":320000,"fid":0,"size":10933855,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5466950,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":3280187,"vd":-2.65076E-4},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1457921040804},{"name":"大象","id":478491644,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":8,"v":16,"crbt":null,"cf":"","al":{"id":35501199,"name":"李志、电声与管弦乐","picUrl":"http://p1.music.126.net/aQwr_LalAJJ03qDW6JivUg==/18574049929931926.jpg","tns":[],"pic_str":"18574049929931926","pic":18574049929931926},"dt":409514,"h":{"br":320000,"fid":0,"size":16382999,"vd":-1.63},"m":{"br":160000,"fid":0,"size":8191522,"vd":-1.21},"l":{"br":96000,"fid":0,"size":4914931,"vd":-1.27},"a":null,"cd":"1","no":10,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":5606621,"publishTime":1494864000007},{"name":"意味","id":26508182,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":201701,"h":{"br":320000,"fid":0,"size":8094680,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":4058763,"vd":0.135177},"l":{"br":96000,"fid":0,"size":2444396,"vd":-2.65076E-4},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007},{"name":"看见","id":29724293,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":0,"v":13,"crbt":null,"cf":"","al":{"id":3056371,"name":"1701","picUrl":"http://p1.music.126.net/t0RSGoEnZ_OGIMvwXCevMQ==/3228166139854194.jpg","tns":[],"pic":3228166139854194},"dt":253504,"h":{"br":320000,"fid":0,"size":10142938,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5071527,"vd":0},"l":{"br":96000,"fid":0,"size":3042962,"vd":0},"a":null,"cd":"1","no":4,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":385736,"publishTime":1415808000000},{"name":"梵高先生 2015伴奏版","id":31311404,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":0,"v":16,"crbt":null,"cf":"","al":{"id":3117093,"name":"看见","picUrl":"http://p1.music.126.net/dG7OF1YlLQRlDStqHScJoQ==/2943392627712408.jpg","tns":[],"pic":2943392627712408},"dt":166000,"h":{"br":320000,"fid":0,"size":6667590,"vd":0},"m":{"br":160000,"fid":0,"size":3333844,"vd":0},"l":{"br":96000,"fid":0,"size":2000345,"vd":0},"a":null,"cd":"1","no":10,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1435334400007},{"name":"虎口脱险","id":34200634,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]},{"id":886237,"name":"爻-梁颖","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":0,"v":710,"crbt":null,"cf":"","al":{"id":3271338,"name":"热门华语278","picUrl":"http://p1.music.126.net/SDYKlOH5UTUYRlM-Bo9l3g==/3411784581986489.jpg","tns":[],"pic":3411784581986489},"dt":308662,"h":null,"m":null,"l":{"br":96000,"fid":0,"size":3704625,"vd":9.4},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":0,"publishTime":1388505600004},{"name":"路","id":25867005,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]},{"id":9352,"name":"邵夷贝","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":"","fee":0,"v":12,"crbt":null,"cf":"","al":{"id":2336486,"name":"你好,郑州","picUrl":"http://p1.music.126.net/80diFjTazGCdf0Ql3HAqGA==/2296879790481625.jpg","tns":[],"pic":2296879790481625},"dt":143346,"h":{"br":320000,"fid":0,"size":5753910,"vd":0.979982},"m":{"br":160000,"fid":0,"size":2885144,"vd":1.27884},"l":{"br":96000,"fid":0,"size":1737637,"vd":0.841622},"a":null,"cd":"1","no":8,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1283270400007},{"name":"你好明天","id":440464357,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":["Ciao Tomorrow"],"pop":95,"st":0,"rt":null,"fee":8,"v":5,"crbt":null,"cf":"","al":{"id":34984288,"name":"在每一条伤心的应天大街上","picUrl":"http://p1.music.126.net/Nax0AgExEk_M6RPX7vffqA==/18627925998890851.jpg","tns":[],"pic_str":"18627925998890851","pic":18627925998890851},"dt":267468,"h":{"br":320000,"fid":0,"size":10701889,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5350967,"vd":0},"l":{"br":96000,"fid":0,"size":3210598,"vd":-2.65076E-4},"a":null,"cd":"1","no":8,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":433013,"rtype":0,"rurl":null,"mv":0,"publishTime":1479571200007}],"trackIds":[{"id":26508186,"v":15},{"id":25867002,"v":26},{"id":26508240,"v":22},{"id":26508242,"v":22},{"id":26523120,"v":26},{"id":26522011,"v":13},{"id":29724295,"v":21},{"id":26508232,"v":16},{"id":29724292,"v":13},{"id":26508228,"v":16},{"id":26353044,"v":12},{"id":435948318,"v":14},{"id":34200930,"v":10},{"id":28406900,"v":16},{"id":30212877,"v":25},{"id":34200934,"v":10},{"id":30967318,"v":19},{"id":26508184,"v":13},{"id":28590174,"v":673},{"id":26522009,"v":13},{"id":26508235,"v":16},{"id":26522014,"v":13},{"id":26508205,"v":15},{"id":478490652,"v":15},{"id":26508183,"v":13},{"id":424474911,"v":6},{"id":435948312,"v":13},{"id":26508244,"v":23},{"id":26523123,"v":15},{"id":424477861,"v":6},{"id":26508230,"v":14},{"id":478490647,"v":15},{"id":424474922,"v":6},{"id":478490649,"v":15},{"id":478491639,"v":15},{"id":435948315,"v":17},{"id":26508239,"v":22},{"id":29724291,"v":11},{"id":29724294,"v":11},{"id":26508221,"v":14},{"id":440411394,"v":5},{"id":435948316,"v":13},{"id":406072281,"v":6},{"id":478491644,"v":16},{"id":26508182,"v":13},{"id":29724293,"v":13},{"id":31311404,"v":16},{"id":34200634,"v":710},{"id":25867005,"v":12},{"id":440464357,"v":5}],"coverImgUrl":"http://p1.music.126.net/sudO8rv3hU5PuRux_a7grQ==/109951163166832026.jpg","highQuality":false,"updateTime":1519745811816,"privacy":0,"trackUpdateTime":1519745777631,"trackCount":50,"coverImgId":109951163166832026,"createTime":1519745478234,"commentThreadId":"A_PL_0_2120018129","newImported":false,"userId":119543810,"playCount":0,"specialType":0,"trackNumberUpdateTime":1519745777551,"adType":0,"status":0,"subscribedCount":0,"cloudTrackCount":0,"description":"这个世界会好嘛？","ordered":false,"tags":[],"name":"李志都唱了些什么，我用代码告诉你","id":2120018129,"shareCount":0,"coverImgId_str":"109951163166832026","commentCount":0}
	 * code : 200
	 * privileges : [{"id":26508186,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":25867002,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26508240,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26508242,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26523120,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26522011,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":29724295,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26508232,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":29724292,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26508228,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":192000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26353044,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":435948318,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":34200930,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":28406900,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":30212877,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":34200934,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":30967318,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":320000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26508184,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":28590174,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":128000,"fl":320000,"toast":false,"flag":0,"preSell":false},{"id":26522009,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26508235,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26522014,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26508205,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":478490652,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":1,"preSell":false},{"id":26508183,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":424474911,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":2,"preSell":false},{"id":435948312,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26508244,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26523123,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":424477861,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":2,"preSell":false},{"id":26508230,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":478490647,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":1,"preSell":false},{"id":424474922,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":2,"preSell":false},{"id":478490649,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":1,"preSell":false},{"id":478491639,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":1,"preSell":false},{"id":435948315,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26508239,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":29724291,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":29724294,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":26508221,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":128000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":440411394,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":2,"preSell":false},{"id":435948316,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":406072281,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":2,"preSell":false},{"id":478491644,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":1,"preSell":false},{"id":26508182,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":29724293,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":31311404,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":34200634,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":128000,"fl":320000,"toast":false,"flag":0,"preSell":false},{"id":25867005,"fee":0,"payed":0,"st":0,"pl":320000,"dl":320000,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":320000,"toast":false,"flag":2,"preSell":false},{"id":440464357,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":2,"preSell":false}]
	 */

	private PlaylistBean playlist;
	private int code;
	private List<PrivilegesBean> privileges;

	public PlaylistBean getPlaylist() {
		return playlist;
	}

	public void setPlaylist(PlaylistBean playlist) {
		this.playlist = playlist;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public List<PrivilegesBean> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<PrivilegesBean> privileges) {
		this.privileges = privileges;
	}

	public static class PlaylistBean {
		/**
		 * subscribers : []
		 * subscribed : false
		 * creator : {"defaultAvatar":false,"province":410000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/rFgHGoeQ7uVaHZMoKFU4xw==/109951162997130622.jpg","accountStatus":0,"gender":1,"city":410100,"birthday":777788259424,"userId":119543810,"userType":0,"nickname":"褐言_","signature":"这个世界会好吗","description":"","detailDescription":"","avatarImgId":109951162997130622,"backgroundImgId":1364493994711367,"backgroundUrl":"http://p1.music.126.net/DIKr8dvhHZpVNEYq1nPKGQ==/1364493994711367.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"avatarImgIdStr":"109951162997130622","backgroundImgIdStr":"1364493994711367","avatarImgId_str":"109951162997130622"}
		 * tracks : [{"name":"天空之城","id":26508186,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":15,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":223015,"h":{"br":320000,"fid":0,"size":8947321,"vd":-0.89},"m":{"br":160000,"fid":0,"size":4485085,"vd":-0.47},"l":{"br":96000,"fid":0,"size":2700191,"vd":-0.48},"a":null,"cd":"1","no":5,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007},{"name":"关于郑州的记忆","id":25867002,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":26,"crbt":null,"cf":"","al":{"id":2336486,"name":"你好,郑州","picUrl":"http://p1.music.126.net/80diFjTazGCdf0Ql3HAqGA==/2296879790481625.jpg","tns":[],"pic":2296879790481625},"dt":228146,"h":{"br":320000,"fid":0,"size":9145643,"vd":0.573325},"m":{"br":160000,"fid":0,"size":4581007,"vd":0.551266},"l":{"br":96000,"fid":0,"size":2755153,"vd":-2.65076E-4},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":290061,"publishTime":1283270400007},{"name":"梵高先生","id":26508240,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":22,"crbt":null,"cf":"","al":{"id":2515029,"name":"梵高先生","picUrl":"http://p1.music.126.net/UuSe-Vc6rS7JtRJSQgDU2g==/2323268069553116.jpg","tns":[],"pic":2323268069553116},"dt":249746,"h":{"br":320000,"fid":0,"size":9992402,"vd":-0.48},"m":{"br":160000,"fid":0,"size":4996223,"vd":-0.04},"l":{"br":96000,"fid":0,"size":2997751,"vd":-0.05},"a":null,"cd":"1","no":6,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1126713600000},{"name":"你离开了南京，从此没有人和我说话","id":26508242,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":22,"crbt":null,"cf":"","al":{"id":2515029,"name":"梵高先生","picUrl":"http://p1.music.126.net/UuSe-Vc6rS7JtRJSQgDU2g==/2323268069553116.jpg","tns":[],"pic":2323268069553116},"dt":71813,"h":{"br":320000,"fid":0,"size":2875602,"vd":-2.51},"m":{"br":160000,"fid":0,"size":1437823,"vd":-2.08},"l":{"br":96000,"fid":0,"size":862711,"vd":-2.06},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1126713600000},{"name":"和你在一起","id":26523120,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":26,"crbt":null,"cf":"","al":{"id":2518001,"name":"这个世界会好吗","picUrl":"http://p1.music.126.net/JUE7I2P9IwGOLPtxGvtTnQ==/2399134371866485.jpg","tns":[],"pic":2399134371866485},"dt":251933,"h":{"br":320000,"fid":0,"size":10080173,"vd":-0.71},"m":{"br":160000,"fid":0,"size":5040109,"vd":-0.27},"l":{"br":96000,"fid":0,"size":3024083,"vd":-0.26},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1150300800000},{"name":"米店","id":26522011,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":210999,"h":{"br":320000,"fid":0,"size":8466664,"vd":-0.56},"m":{"br":160000,"fid":0,"size":4244755,"vd":-0.12},"l":{"br":96000,"fid":0,"size":2555991,"vd":-0.15},"a":null,"cd":"1","no":13,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007},{"name":"热河","id":29724295,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":21,"crbt":null,"cf":"","al":{"id":3056371,"name":"1701","picUrl":"http://p1.music.126.net/t0RSGoEnZ_OGIMvwXCevMQ==/3228166139854194.jpg","tns":[],"pic":3228166139854194},"dt":406538,"h":{"br":320000,"fid":0,"size":16263950,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":8132033,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":4879266,"vd":-2.65076E-4},"a":null,"cd":"1","no":6,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1415808000000},{"name":"山阴路的夏天","id":26508232,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":16,"crbt":null,"cf":"","al":{"id":2515028,"name":"F","picUrl":"http://p1.music.126.net/7w7pX7BKTdBcFF1AtuZC2g==/5957153999486269.jpg","tns":[],"pic":5957153999486269},"dt":278024,"h":{"br":320000,"fid":0,"size":11124107,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5562116,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":3337320,"vd":-2.65076E-4},"a":null,"cd":"1","no":5,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":313139,"publishTime":1317225600007},{"name":"定西","id":29724292,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":13,"crbt":null,"cf":"","al":{"id":3056371,"name":"1701","picUrl":"http://p1.music.126.net/t0RSGoEnZ_OGIMvwXCevMQ==/3228166139854194.jpg","tns":[],"pic":3228166139854194},"dt":295882,"h":{"br":320000,"fid":0,"size":11837763,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5918939,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":3551409,"vd":-2.65076E-4},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1415808000000},{"name":"寻找","id":26508228,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":16,"crbt":null,"cf":"","al":{"id":2515028,"name":"F","picUrl":"http://p1.music.126.net/7w7pX7BKTdBcFF1AtuZC2g==/5957153999486269.jpg","tns":[],"pic":5957153999486269},"dt":225071,"h":null,"m":{"br":160000,"fid":0,"size":4513054,"vd":0.417572},"l":{"br":96000,"fid":0,"size":2713530,"vd":0.324343},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":290060,"publishTime":1317225600007},{"name":"忽然","id":26353044,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":12,"crbt":null,"cf":"","al":{"id":2336486,"name":"你好,郑州","picUrl":"http://p1.music.126.net/80diFjTazGCdf0Ql3HAqGA==/2296879790481625.jpg","tns":[],"pic":2296879790481625},"dt":126853,"h":{"br":320000,"fid":0,"size":5094564,"vd":1.67599},"m":{"br":160000,"fid":0,"size":2555463,"vd":2.05952},"l":{"br":96000,"fid":0,"size":1539822,"vd":2.32495},"a":null,"cd":"1","no":4,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1283270400007},{"name":"送别","id":435948318,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":14,"crbt":null,"cf":"","al":{"id":34914649,"name":"《8》","picUrl":"http://p1.music.126.net/My-dbWJBANW4qr5CCqIiAw==/17684545021514178.jpg","tns":[],"pic_str":"17684545021514178","pic":17684545021514178},"dt":202427,"h":{"br":320000,"fid":0,"size":8100093,"vd":0.0782854},"m":{"br":160000,"fid":0,"size":4050069,"vd":0.505068},"l":{"br":96000,"fid":0,"size":2430059,"vd":0.234009},"a":null,"cd":"1","no":9,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":0,"publishTime":1476761806570},{"name":"你离开了南京，从此没有人和我说话 2015现场版","id":34200930,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":10,"crbt":null,"cf":"","al":{"id":3117093,"name":"看见","picUrl":"http://p1.music.126.net/dG7OF1YlLQRlDStqHScJoQ==/2943392627712408.jpg","tns":[],"pic":2943392627712408},"dt":124648,"h":{"br":320000,"fid":0,"size":4988386,"vd":5.64018},"m":{"br":160000,"fid":0,"size":2494215,"vd":6.16521},"l":{"br":96000,"fid":0,"size":1496546,"vd":6.15497},"a":null,"cd":"1","no":5,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1435334400007},{"name":"和你在一起2013版[Live]","id":28406900,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":16,"crbt":null,"cf":"","al":{"id":2786478,"name":"勾三搭四（2013 Live）","picUrl":"http://p1.music.126.net/q-V2SNRZhYo9sgftJm-olA==/5961552045955874.jpg","tns":[],"pic":5961552045955874},"dt":261781,"h":{"br":320000,"fid":0,"size":10472010,"vd":-0.65},"m":{"br":160000,"fid":0,"size":5236027,"vd":-0.24},"l":{"br":96000,"fid":0,"size":3141634,"vd":-0.26},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":294032,"publishTime":1396281600007,"tns":["Be With You"]},{"name":"墙上的向日葵(2014i/O版)","id":30212877,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":25,"crbt":null,"cf":"","al":{"id":3091514,"name":"i/O（2014 Live）","picUrl":"http://p1.music.126.net/g8rtg6LCWuENs4pgZeTyvg==/2539871863244150.jpg","tns":[],"pic":2539871863244150},"dt":482246,"h":{"br":320000,"fid":0,"size":19291994,"vd":-0.31},"m":{"br":160000,"fid":0,"size":9646019,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":5787629,"vd":-2.65076E-4},"a":null,"cd":"1","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":386086,"publishTime":1426003200007},{"name":"热河 2015现场版","id":34200934,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":10,"crbt":null,"cf":"","al":{"id":3117093,"name":"看见","picUrl":"http://p1.music.126.net/dG7OF1YlLQRlDStqHScJoQ==/2943392627712408.jpg","tns":[],"pic":2943392627712408},"dt":484500,"h":{"br":320000,"fid":0,"size":19382900,"vd":-0.95},"m":{"br":160000,"fid":0,"size":9691472,"vd":-0.53},"l":{"br":96000,"fid":0,"size":5814901,"vd":-0.59},"a":null,"cd":"1","no":7,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1435334400007},{"name":"鸵鸟&天空之城&我们不能失去信仰(2014i/O版)","id":30967318,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":19,"crbt":null,"cf":"","al":{"id":3091514,"name":"i/O（2014 Live）","picUrl":"http://p1.music.126.net/g8rtg6LCWuENs4pgZeTyvg==/2539871863244150.jpg","tns":[],"pic":2539871863244150},"dt":606119,"h":{"br":320000,"fid":0,"size":24246900,"vd":-0.36},"m":{"br":160000,"fid":0,"size":12123472,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":7274101,"vd":-0.02},"a":null,"cd":"1","no":10,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1426003200007},{"name":"结婚","id":26508184,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":352620,"h":{"br":320000,"fid":0,"size":14131056,"vd":0},"m":{"br":160000,"fid":0,"size":7076951,"vd":0.346384},"l":{"br":96000,"fid":0,"size":4255308,"vd":-2.65076E-4},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007},{"name":"谁他妈没织过毛衣","id":28590174,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":0,"v":673,"crbt":null,"cf":"","al":{"id":2847068,"name":"热门华语219","picUrl":"http://p1.music.126.net/wKd7AutpY4Z7_Hxisi9ZEw==/3306231465784387.jpg","tns":[],"pic":3306231465784387},"dt":138266,"h":null,"m":{"br":128000,"fid":0,"size":2232637,"vd":1.75382},"l":{"br":96000,"fid":0,"size":1680094,"vd":2.24838},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":0,"publishTime":1388505600004},{"name":"听妈妈讲那过去的事情","id":26522009,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":169693,"h":{"br":320000,"fid":0,"size":6814696,"vd":-1.54},"m":{"br":160000,"fid":0,"size":3418779,"vd":-1.1},"l":{"br":96000,"fid":0,"size":2060412,"vd":-1.1},"a":null,"cd":"1","no":11,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":14031,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007},{"name":"杭州","id":26508235,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":16,"crbt":null,"cf":"","al":{"id":2515028,"name":"F","picUrl":"http://p1.music.126.net/7w7pX7BKTdBcFF1AtuZC2g==/5957153999486269.jpg","tns":[],"pic":5957153999486269},"dt":238178,"h":{"br":320000,"fid":0,"size":9529577,"vd":-3.3},"m":{"br":160000,"fid":0,"size":4764843,"vd":-2.87},"l":{"br":96000,"fid":0,"size":2858949,"vd":-2.91},"a":null,"cd":"1","no":8,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":290064,"publishTime":1317225600007},{"name":"再见","id":26522014,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":88879,"h":{"br":320000,"fid":0,"size":3581766,"vd":-1.96},"m":{"br":160000,"fid":0,"size":1802306,"vd":-1.51},"l":{"br":96000,"fid":0,"size":1090521,"vd":-1.54},"a":null,"cd":"1","no":16,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007},{"name":"被禁忌的游戏","id":26508205,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":15,"crbt":null,"cf":"","al":{"id":2515026,"name":"被禁忌的游戏","picUrl":"http://p1.music.126.net/cYGiS-NIhAElWdpFkyFqFQ==/2378243650941258.jpg","tns":[],"pic":2378243650941258},"dt":377826,"h":{"br":320000,"fid":0,"size":15115537,"vd":4.95029},"m":{"br":160000,"fid":0,"size":7557791,"vd":4.91707},"l":{"br":96000,"fid":0,"size":4534692,"vd":4.59759},"a":null,"cd":"1","no":7,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1101830400000},{"name":"回答","id":478490652,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":15,"crbt":null,"cf":"","al":{"id":35501199,"name":"李志、电声与管弦乐","picUrl":"http://p1.music.126.net/aQwr_LalAJJ03qDW6JivUg==/18574049929931926.jpg","tns":[],"pic_str":"18574049929931926","pic":18574049929931926},"dt":378378,"h":{"br":320000,"fid":0,"size":15137480,"vd":-2.42},"m":{"br":160000,"fid":0,"size":7568763,"vd":-2},"l":{"br":96000,"fid":0,"size":4541276,"vd":-2.06},"a":null,"cd":"1","no":12,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":5606607,"publishTime":1494864000007},{"name":"苍井空","id":26508183,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":260290,"h":{"br":320000,"fid":0,"size":10438389,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5230618,"vd":0.0188411},"l":{"br":96000,"fid":0,"size":3147509,"vd":-2.65076E-4},"a":null,"cd":"1","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007},{"name":"黑色信封 (2016 unplugged)","id":424474911,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":6,"crbt":null,"cf":"","al":{"id":34808540,"name":"李志北京不插电现场 2016.5.29","picUrl":"http://p1.music.126.net/RN-nvLgMuLujEvbMRUFQvA==/3420580718570196.jpg","tns":[],"pic":3420580718570196},"dt":280207,"h":{"br":320000,"fid":0,"size":11210754,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5605400,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":3363258,"vd":-2.65076E-4},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":433013,"rtype":0,"rurl":null,"mv":0,"publishTime":1470844800007},{"name":"兰花草","id":435948312,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":34914649,"name":"《8》","picUrl":"http://p1.music.126.net/My-dbWJBANW4qr5CCqIiAw==/17684545021514178.jpg","tns":[],"pic_str":"17684545021514178","pic":17684545021514178},"dt":164025,"h":{"br":320000,"fid":0,"size":6564093,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":3282069,"vd":0.0265486},"l":{"br":96000,"fid":0,"size":1969259,"vd":-2.65076E-4},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":0,"publishTime":1476761806570},{"name":"想起了她","id":26508244,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":23,"crbt":null,"cf":"","al":{"id":2515029,"name":"梵高先生","picUrl":"http://p1.music.126.net/UuSe-Vc6rS7JtRJSQgDU2g==/2323268069553116.jpg","tns":[],"pic":2323268069553116},"dt":273493,"h":{"br":320000,"fid":0,"size":10942214,"vd":0.27769},"m":{"br":160000,"fid":0,"size":5471129,"vd":0.67415},"l":{"br":96000,"fid":0,"size":3282695,"vd":0.677875},"a":null,"cd":"1","no":7,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1126713600000},{"name":"妈妈","id":26523123,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":15,"crbt":null,"cf":"","al":{"id":2518001,"name":"这个世界会好吗","picUrl":"http://p1.music.126.net/JUE7I2P9IwGOLPtxGvtTnQ==/2399134371866485.jpg","tns":[],"pic":2399134371866485},"dt":244106,"h":{"br":320000,"fid":0,"size":9766704,"vd":0.39},"m":{"br":160000,"fid":0,"size":4883374,"vd":0.84},"l":{"br":96000,"fid":0,"size":2930042,"vd":0.82},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1150300800000},{"name":"鸵鸟 (2016 unplugged)","id":424477861,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":6,"crbt":null,"cf":"","al":{"id":34808540,"name":"李志北京不插电现场 2016.5.29","picUrl":"http://p1.music.126.net/RN-nvLgMuLujEvbMRUFQvA==/3420580718570196.jpg","tns":[],"pic":3420580718570196},"dt":259011,"h":{"br":320000,"fid":0,"size":10363342,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5181694,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":3109034,"vd":-2.65076E-4},"a":null,"cd":"1","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":433013,"rtype":0,"rurl":null,"mv":0,"publishTime":1470844800007},{"name":"门","id":26508230,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":14,"crbt":null,"cf":"","al":{"id":2515028,"name":"F","picUrl":"http://p1.music.126.net/7w7pX7BKTdBcFF1AtuZC2g==/5957153999486269.jpg","tns":[],"pic":5957153999486269},"dt":386756,"h":{"br":320000,"fid":0,"size":15472953,"vd":-0.83},"m":{"br":160000,"fid":0,"size":7736529,"vd":-0.39},"l":{"br":96000,"fid":0,"size":4641959,"vd":-0.41},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1317225600007},{"name":"尽头","id":478490647,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":15,"crbt":null,"cf":"","al":{"id":35501199,"name":"李志、电声与管弦乐","picUrl":"http://p1.music.126.net/aQwr_LalAJJ03qDW6JivUg==/18574049929931926.jpg","tns":[],"pic_str":"18574049929931926","pic":18574049929931926},"dt":258538,"h":{"br":320000,"fid":0,"size":10344533,"vd":-1.87},"m":{"br":160000,"fid":0,"size":5172289,"vd":-1.44},"l":{"br":96000,"fid":0,"size":3103391,"vd":-1.47},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":5606623,"publishTime":1494864000007},{"name":"春末的南方城市 (2016 unplugged)","id":424474922,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":6,"crbt":null,"cf":"","al":{"id":34808540,"name":"李志北京不插电现场 2016.5.29","picUrl":"http://p1.music.126.net/RN-nvLgMuLujEvbMRUFQvA==/3420580718570196.jpg","tns":[],"pic":3420580718570196},"dt":404475,"h":{"br":320000,"fid":0,"size":16181333,"vd":-1.38},"m":{"br":160000,"fid":0,"size":8090689,"vd":-0.94},"l":{"br":96000,"fid":0,"size":4854431,"vd":-0.97},"a":null,"cd":"1","no":10,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":433013,"rtype":0,"rurl":null,"mv":0,"publishTime":1470844800007},{"name":"铅笔","id":478490649,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":15,"crbt":null,"cf":"","al":{"id":35501199,"name":"李志、电声与管弦乐","picUrl":"http://p1.music.126.net/aQwr_LalAJJ03qDW6JivUg==/18574049929931926.jpg","tns":[],"pic_str":"18574049929931926","pic":18574049929931926},"dt":312432,"h":{"br":320000,"fid":0,"size":12500158,"vd":-1.79},"m":{"br":160000,"fid":0,"size":6250102,"vd":-1.37},"l":{"br":96000,"fid":0,"size":3750079,"vd":-1.42},"a":null,"cd":"1","no":7,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":5606610,"publishTime":1494864000007},{"name":"序曲","id":478491639,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":null,"fee":8,"v":15,"crbt":null,"cf":"","al":{"id":35501199,"name":"李志、电声与管弦乐","picUrl":"http://p1.music.126.net/aQwr_LalAJJ03qDW6JivUg==/18574049929931926.jpg","tns":[],"pic_str":"18574049929931926","pic":18574049929931926},"dt":289756,"h":{"br":320000,"fid":0,"size":11593187,"vd":-1.81},"m":{"br":160000,"fid":0,"size":5796616,"vd":-1.39},"l":{"br":96000,"fid":0,"size":3477987,"vd":-1.45},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":5606632,"publishTime":1494864000007},{"name":"Hey Jude","id":435948315,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":17,"crbt":null,"cf":"","al":{"id":34914649,"name":"《8》","picUrl":"http://p1.music.126.net/My-dbWJBANW4qr5CCqIiAw==/17684545021514178.jpg","tns":[],"pic_str":"17684545021514178","pic":17684545021514178},"dt":263592,"h":{"br":320000,"fid":0,"size":10546199,"vd":0.0641205},"m":{"br":160000,"fid":0,"size":5273122,"vd":0.345832},"l":{"br":96000,"fid":0,"size":3163891,"vd":0.173223},"a":null,"cd":"1","no":6,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":5619842,"publishTime":1476761806570},{"name":"董卓瑶","id":26508239,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":100,"st":0,"rt":"","fee":0,"v":22,"crbt":null,"cf":"","al":{"id":2515029,"name":"梵高先生","picUrl":"http://p1.music.126.net/UuSe-Vc6rS7JtRJSQgDU2g==/2323268069553116.jpg","tns":[],"pic":2323268069553116},"dt":197786,"h":{"br":320000,"fid":0,"size":7914100,"vd":-1.92},"m":{"br":160000,"fid":0,"size":3957072,"vd":-1.5},"l":{"br":96000,"fid":0,"size":2374261,"vd":-1.52},"a":null,"cd":"1","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1126713600000},{"name":"鼠说","id":29724291,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":0,"v":11,"crbt":null,"cf":"","al":{"id":3056371,"name":"1701","picUrl":"http://p1.music.126.net/t0RSGoEnZ_OGIMvwXCevMQ==/3228166139854194.jpg","tns":[],"pic":3228166139854194},"dt":317184,"h":{"br":320000,"fid":0,"size":12690399,"vd":-0.88},"m":{"br":160000,"fid":0,"size":6345257,"vd":-0.44},"l":{"br":96000,"fid":0,"size":3807200,"vd":-0.48},"a":null,"cd":"1","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1415808000000},{"name":"不多","id":29724294,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":0,"v":11,"crbt":null,"cf":"","al":{"id":3056371,"name":"1701","picUrl":"http://p1.music.126.net/t0RSGoEnZ_OGIMvwXCevMQ==/3228166139854194.jpg","tns":[],"pic":3228166139854194},"dt":236541,"h":{"br":320000,"fid":0,"size":9464799,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":4732457,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":2839520,"vd":-2.65076E-4},"a":null,"cd":"1","no":5,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1415808000000},{"name":"九月","id":26508221,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":"","fee":0,"v":14,"crbt":null,"cf":"","al":{"id":2515027,"name":"工体东路没有人","picUrl":"http://p1.music.126.net/iKd_lDlSm37GsoAz5ERGmQ==/5883486720419469.jpg","tns":[],"pic":5883486720419469},"dt":264986,"h":null,"m":{"br":158000,"fid":0,"size":5277724,"vd":0},"l":{"br":96000,"fid":0,"size":3196471,"vd":0},"a":null,"cd":"1","no":10,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1231603200007},{"name":"一头偶像","id":440411394,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":["A Piece of Idol"],"pop":95,"st":0,"rt":null,"fee":8,"v":5,"crbt":null,"cf":"","al":{"id":34984288,"name":"在每一条伤心的应天大街上","picUrl":"http://p1.music.126.net/Nax0AgExEk_M6RPX7vffqA==/18627925998890851.jpg","tns":[],"pic_str":"18627925998890851","pic":18627925998890851},"dt":222593,"h":{"br":320000,"fid":0,"size":8906754,"vd":-2.95},"m":{"br":160000,"fid":0,"size":4453400,"vd":-2.51},"l":{"br":96000,"fid":0,"size":2672058,"vd":-2.54},"a":null,"cd":"1","no":2,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":433013,"rtype":0,"rurl":null,"mv":0,"publishTime":1479571200007},{"name":"采蘑菇的小姑娘","id":435948316,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":34914649,"name":"《8》","picUrl":"http://p1.music.126.net/My-dbWJBANW4qr5CCqIiAw==/17684545021514178.jpg","tns":[],"pic_str":"17684545021514178","pic":17684545021514178},"dt":132703,"h":{"br":320000,"fid":0,"size":5311260,"vd":-0.13},"m":{"br":160000,"fid":0,"size":2655653,"vd":0},"l":{"br":96000,"fid":0,"size":1593409,"vd":-2.65076E-4},"a":null,"cd":"1","no":7,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":0,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":0,"publishTime":1476761806570},{"name":"普希金 (2015动静版)","id":406072281,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]},{"id":7536,"name":"丁薇","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":8,"v":6,"crbt":null,"cf":"","al":{"id":34527676,"name":"动静（2015Live）","picUrl":"http://p1.music.126.net/PNWRoOw2UyHKE7eSo4NKHQ==/1375489048830535.jpg","tns":[],"pic":1375489048830535},"dt":273280,"h":{"br":320000,"fid":0,"size":10933855,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5466950,"vd":-2.65076E-4},"l":{"br":96000,"fid":0,"size":3280187,"vd":-2.65076E-4},"a":null,"cd":"1","no":3,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1457921040804},{"name":"大象","id":478491644,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":8,"v":16,"crbt":null,"cf":"","al":{"id":35501199,"name":"李志、电声与管弦乐","picUrl":"http://p1.music.126.net/aQwr_LalAJJ03qDW6JivUg==/18574049929931926.jpg","tns":[],"pic_str":"18574049929931926","pic":18574049929931926},"dt":409514,"h":{"br":320000,"fid":0,"size":16382999,"vd":-1.63},"m":{"br":160000,"fid":0,"size":8191522,"vd":-1.21},"l":{"br":96000,"fid":0,"size":4914931,"vd":-1.27},"a":null,"cd":"1","no":10,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":5606621,"publishTime":1494864000007},{"name":"意味","id":26508182,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":"","fee":0,"v":13,"crbt":null,"cf":"","al":{"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255},"dt":201701,"h":{"br":320000,"fid":0,"size":8094680,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":4058763,"vd":0.135177},"l":{"br":96000,"fid":0,"size":2444396,"vd":-2.65076E-4},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1255622400007},{"name":"看见","id":29724293,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":0,"v":13,"crbt":null,"cf":"","al":{"id":3056371,"name":"1701","picUrl":"http://p1.music.126.net/t0RSGoEnZ_OGIMvwXCevMQ==/3228166139854194.jpg","tns":[],"pic":3228166139854194},"dt":253504,"h":{"br":320000,"fid":0,"size":10142938,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5071527,"vd":0},"l":{"br":96000,"fid":0,"size":3042962,"vd":0},"a":null,"cd":"1","no":4,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":385736,"publishTime":1415808000000},{"name":"梵高先生 2015伴奏版","id":31311404,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":0,"v":16,"crbt":null,"cf":"","al":{"id":3117093,"name":"看见","picUrl":"http://p1.music.126.net/dG7OF1YlLQRlDStqHScJoQ==/2943392627712408.jpg","tns":[],"pic":2943392627712408},"dt":166000,"h":{"br":320000,"fid":0,"size":6667590,"vd":0},"m":{"br":160000,"fid":0,"size":3333844,"vd":0},"l":{"br":96000,"fid":0,"size":2000345,"vd":0},"a":null,"cd":"1","no":10,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1435334400007},{"name":"虎口脱险","id":34200634,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]},{"id":886237,"name":"爻-梁颖","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":null,"fee":0,"v":710,"crbt":null,"cf":"","al":{"id":3271338,"name":"热门华语278","picUrl":"http://p1.music.126.net/SDYKlOH5UTUYRlM-Bo9l3g==/3411784581986489.jpg","tns":[],"pic":3411784581986489},"dt":308662,"h":null,"m":null,"l":{"br":96000,"fid":0,"size":3704625,"vd":9.4},"a":null,"cd":"1","no":1,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":0,"rtype":0,"rurl":null,"mv":0,"publishTime":1388505600004},{"name":"路","id":25867005,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]},{"id":9352,"name":"邵夷贝","tns":[],"alias":[]}],"alia":[],"pop":95,"st":0,"rt":"","fee":0,"v":12,"crbt":null,"cf":"","al":{"id":2336486,"name":"你好,郑州","picUrl":"http://p1.music.126.net/80diFjTazGCdf0Ql3HAqGA==/2296879790481625.jpg","tns":[],"pic":2296879790481625},"dt":143346,"h":{"br":320000,"fid":0,"size":5753910,"vd":0.979982},"m":{"br":160000,"fid":0,"size":2885144,"vd":1.27884},"l":{"br":96000,"fid":0,"size":1737637,"vd":0.841622},"a":null,"cd":"1","no":8,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":1,"s_id":0,"mst":9,"cp":16001,"rtype":0,"rurl":null,"mv":0,"publishTime":1283270400007},{"name":"你好明天","id":440464357,"pst":0,"t":0,"ar":[{"id":3681,"name":"李志","tns":[],"alias":[]}],"alia":["Ciao Tomorrow"],"pop":95,"st":0,"rt":null,"fee":8,"v":5,"crbt":null,"cf":"","al":{"id":34984288,"name":"在每一条伤心的应天大街上","picUrl":"http://p1.music.126.net/Nax0AgExEk_M6RPX7vffqA==/18627925998890851.jpg","tns":[],"pic_str":"18627925998890851","pic":18627925998890851},"dt":267468,"h":{"br":320000,"fid":0,"size":10701889,"vd":-2.65076E-4},"m":{"br":160000,"fid":0,"size":5350967,"vd":0},"l":{"br":96000,"fid":0,"size":3210598,"vd":-2.65076E-4},"a":null,"cd":"1","no":8,"rtUrl":null,"ftype":0,"rtUrls":[],"djId":0,"copyright":2,"s_id":0,"mst":9,"cp":433013,"rtype":0,"rurl":null,"mv":0,"publishTime":1479571200007}]
		 * trackIds : [{"id":26508186,"v":15},{"id":25867002,"v":26},{"id":26508240,"v":22},{"id":26508242,"v":22},{"id":26523120,"v":26},{"id":26522011,"v":13},{"id":29724295,"v":21},{"id":26508232,"v":16},{"id":29724292,"v":13},{"id":26508228,"v":16},{"id":26353044,"v":12},{"id":435948318,"v":14},{"id":34200930,"v":10},{"id":28406900,"v":16},{"id":30212877,"v":25},{"id":34200934,"v":10},{"id":30967318,"v":19},{"id":26508184,"v":13},{"id":28590174,"v":673},{"id":26522009,"v":13},{"id":26508235,"v":16},{"id":26522014,"v":13},{"id":26508205,"v":15},{"id":478490652,"v":15},{"id":26508183,"v":13},{"id":424474911,"v":6},{"id":435948312,"v":13},{"id":26508244,"v":23},{"id":26523123,"v":15},{"id":424477861,"v":6},{"id":26508230,"v":14},{"id":478490647,"v":15},{"id":424474922,"v":6},{"id":478490649,"v":15},{"id":478491639,"v":15},{"id":435948315,"v":17},{"id":26508239,"v":22},{"id":29724291,"v":11},{"id":29724294,"v":11},{"id":26508221,"v":14},{"id":440411394,"v":5},{"id":435948316,"v":13},{"id":406072281,"v":6},{"id":478491644,"v":16},{"id":26508182,"v":13},{"id":29724293,"v":13},{"id":31311404,"v":16},{"id":34200634,"v":710},{"id":25867005,"v":12},{"id":440464357,"v":5}]
		 * coverImgUrl : http://p1.music.126.net/sudO8rv3hU5PuRux_a7grQ==/109951163166832026.jpg
		 * highQuality : false
		 * updateTime : 1519745811816
		 * privacy : 0
		 * trackUpdateTime : 1519745777631
		 * trackCount : 50
		 * coverImgId : 109951163166832026
		 * createTime : 1519745478234
		 * commentThreadId : A_PL_0_2120018129
		 * newImported : false
		 * userId : 119543810
		 * playCount : 0
		 * specialType : 0
		 * trackNumberUpdateTime : 1519745777551
		 * adType : 0
		 * status : 0
		 * subscribedCount : 0
		 * cloudTrackCount : 0
		 * description : 这个世界会好嘛？
		 * ordered : false
		 * tags : []
		 * name : 李志都唱了些什么，我用代码告诉你
		 * id : 2120018129
		 * shareCount : 0
		 * coverImgId_str : 109951163166832026
		 * commentCount : 0
		 */

		private boolean subscribed;
		private CreatorBean creator;
		private String coverImgUrl;
		private boolean highQuality;
		private long updateTime;
		private int privacy;
		private long trackUpdateTime;
		private int trackCount;
		private long coverImgId;
		private long createTime;
		private String commentThreadId;
		private boolean newImported;
		private int userId;
		private int playCount;
		private int specialType;
		private long trackNumberUpdateTime;
		private int adType;
		private int status;
		private int subscribedCount;
		private int cloudTrackCount;
		private String description;
		private boolean ordered;
		private String name;
		private int id;
		private int shareCount;
		private String coverImgId_str;
		private int commentCount;
		private List<?> subscribers;
		private List<TracksBean> tracks;
		private List<TrackIdsBean> trackIds;
		private List<?> tags;

		public boolean isSubscribed() {
			return subscribed;
		}

		public void setSubscribed(boolean subscribed) {
			this.subscribed = subscribed;
		}

		public CreatorBean getCreator() {
			return creator;
		}

		public void setCreator(CreatorBean creator) {
			this.creator = creator;
		}

		public String getCoverImgUrl() {
			return coverImgUrl;
		}

		public void setCoverImgUrl(String coverImgUrl) {
			this.coverImgUrl = coverImgUrl;
		}

		public boolean isHighQuality() {
			return highQuality;
		}

		public void setHighQuality(boolean highQuality) {
			this.highQuality = highQuality;
		}

		public long getUpdateTime() {
			return updateTime;
		}

		public void setUpdateTime(long updateTime) {
			this.updateTime = updateTime;
		}

		public int getPrivacy() {
			return privacy;
		}

		public void setPrivacy(int privacy) {
			this.privacy = privacy;
		}

		public long getTrackUpdateTime() {
			return trackUpdateTime;
		}

		public void setTrackUpdateTime(long trackUpdateTime) {
			this.trackUpdateTime = trackUpdateTime;
		}

		public int getTrackCount() {
			return trackCount;
		}

		public void setTrackCount(int trackCount) {
			this.trackCount = trackCount;
		}

		public long getCoverImgId() {
			return coverImgId;
		}

		public void setCoverImgId(long coverImgId) {
			this.coverImgId = coverImgId;
		}

		public long getCreateTime() {
			return createTime;
		}

		public void setCreateTime(long createTime) {
			this.createTime = createTime;
		}

		public String getCommentThreadId() {
			return commentThreadId;
		}

		public void setCommentThreadId(String commentThreadId) {
			this.commentThreadId = commentThreadId;
		}

		public boolean isNewImported() {
			return newImported;
		}

		public void setNewImported(boolean newImported) {
			this.newImported = newImported;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public int getPlayCount() {
			return playCount;
		}

		public void setPlayCount(int playCount) {
			this.playCount = playCount;
		}

		public int getSpecialType() {
			return specialType;
		}

		public void setSpecialType(int specialType) {
			this.specialType = specialType;
		}

		public long getTrackNumberUpdateTime() {
			return trackNumberUpdateTime;
		}

		public void setTrackNumberUpdateTime(long trackNumberUpdateTime) {
			this.trackNumberUpdateTime = trackNumberUpdateTime;
		}

		public int getAdType() {
			return adType;
		}

		public void setAdType(int adType) {
			this.adType = adType;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public int getSubscribedCount() {
			return subscribedCount;
		}

		public void setSubscribedCount(int subscribedCount) {
			this.subscribedCount = subscribedCount;
		}

		public int getCloudTrackCount() {
			return cloudTrackCount;
		}

		public void setCloudTrackCount(int cloudTrackCount) {
			this.cloudTrackCount = cloudTrackCount;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public boolean isOrdered() {
			return ordered;
		}

		public void setOrdered(boolean ordered) {
			this.ordered = ordered;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getShareCount() {
			return shareCount;
		}

		public void setShareCount(int shareCount) {
			this.shareCount = shareCount;
		}

		public String getCoverImgId_str() {
			return coverImgId_str;
		}

		public void setCoverImgId_str(String coverImgId_str) {
			this.coverImgId_str = coverImgId_str;
		}

		public int getCommentCount() {
			return commentCount;
		}

		public void setCommentCount(int commentCount) {
			this.commentCount = commentCount;
		}

		public List<?> getSubscribers() {
			return subscribers;
		}

		public void setSubscribers(List<?> subscribers) {
			this.subscribers = subscribers;
		}

		public List<TracksBean> getTracks() {
			return tracks;
		}

		public void setTracks(List<TracksBean> tracks) {
			this.tracks = tracks;
		}

		public List<TrackIdsBean> getTrackIds() {
			return trackIds;
		}

		public void setTrackIds(List<TrackIdsBean> trackIds) {
			this.trackIds = trackIds;
		}

		public List<?> getTags() {
			return tags;
		}

		public void setTags(List<?> tags) {
			this.tags = tags;
		}

		public static class CreatorBean {
			/**
			 * defaultAvatar : false
			 * province : 410000
			 * authStatus : 0
			 * followed : false
			 * avatarUrl : http://p1.music.126.net/rFgHGoeQ7uVaHZMoKFU4xw==/109951162997130622.jpg
			 * accountStatus : 0
			 * gender : 1
			 * city : 410100
			 * birthday : 777788259424
			 * userId : 119543810
			 * userType : 0
			 * nickname : 褐言_
			 * signature : 这个世界会好吗
			 * description :
			 * detailDescription :
			 * avatarImgId : 109951162997130622
			 * backgroundImgId : 1364493994711367
			 * backgroundUrl : http://p1.music.126.net/DIKr8dvhHZpVNEYq1nPKGQ==/1364493994711367.jpg
			 * authority : 0
			 * mutual : false
			 * expertTags : null
			 * experts : null
			 * djStatus : 0
			 * vipType : 0
			 * remarkName : null
			 * avatarImgIdStr : 109951162997130622
			 * backgroundImgIdStr : 1364493994711367
			 * avatarImgId_str : 109951162997130622
			 */

			private boolean defaultAvatar;
			private int province;
			private int authStatus;
			private boolean followed;
			private String avatarUrl;
			private int accountStatus;
			private int gender;
			private int city;
			private long birthday;
			private int userId;
			private int userType;
			private String nickname;
			private String signature;
			private String description;
			private String detailDescription;
			private long avatarImgId;
			private long backgroundImgId;
			private String backgroundUrl;
			private int authority;
			private boolean mutual;
			private Object expertTags;
			private Object experts;
			private int djStatus;
			private int vipType;
			private Object remarkName;
			private String avatarImgIdStr;
			private String backgroundImgIdStr;
			private String avatarImgId_str;

			public boolean isDefaultAvatar() {
				return defaultAvatar;
			}

			public void setDefaultAvatar(boolean defaultAvatar) {
				this.defaultAvatar = defaultAvatar;
			}

			public int getProvince() {
				return province;
			}

			public void setProvince(int province) {
				this.province = province;
			}

			public int getAuthStatus() {
				return authStatus;
			}

			public void setAuthStatus(int authStatus) {
				this.authStatus = authStatus;
			}

			public boolean isFollowed() {
				return followed;
			}

			public void setFollowed(boolean followed) {
				this.followed = followed;
			}

			public String getAvatarUrl() {
				return avatarUrl;
			}

			public void setAvatarUrl(String avatarUrl) {
				this.avatarUrl = avatarUrl;
			}

			public int getAccountStatus() {
				return accountStatus;
			}

			public void setAccountStatus(int accountStatus) {
				this.accountStatus = accountStatus;
			}

			public int getGender() {
				return gender;
			}

			public void setGender(int gender) {
				this.gender = gender;
			}

			public int getCity() {
				return city;
			}

			public void setCity(int city) {
				this.city = city;
			}

			public long getBirthday() {
				return birthday;
			}

			public void setBirthday(long birthday) {
				this.birthday = birthday;
			}

			public int getUserId() {
				return userId;
			}

			public void setUserId(int userId) {
				this.userId = userId;
			}

			public int getUserType() {
				return userType;
			}

			public void setUserType(int userType) {
				this.userType = userType;
			}

			public String getNickname() {
				return nickname;
			}

			public void setNickname(String nickname) {
				this.nickname = nickname;
			}

			public String getSignature() {
				return signature;
			}

			public void setSignature(String signature) {
				this.signature = signature;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDetailDescription() {
				return detailDescription;
			}

			public void setDetailDescription(String detailDescription) {
				this.detailDescription = detailDescription;
			}

			public long getAvatarImgId() {
				return avatarImgId;
			}

			public void setAvatarImgId(long avatarImgId) {
				this.avatarImgId = avatarImgId;
			}

			public long getBackgroundImgId() {
				return backgroundImgId;
			}

			public void setBackgroundImgId(long backgroundImgId) {
				this.backgroundImgId = backgroundImgId;
			}

			public String getBackgroundUrl() {
				return backgroundUrl;
			}

			public void setBackgroundUrl(String backgroundUrl) {
				this.backgroundUrl = backgroundUrl;
			}

			public int getAuthority() {
				return authority;
			}

			public void setAuthority(int authority) {
				this.authority = authority;
			}

			public boolean isMutual() {
				return mutual;
			}

			public void setMutual(boolean mutual) {
				this.mutual = mutual;
			}

			public Object getExpertTags() {
				return expertTags;
			}

			public void setExpertTags(Object expertTags) {
				this.expertTags = expertTags;
			}

			public Object getExperts() {
				return experts;
			}

			public void setExperts(Object experts) {
				this.experts = experts;
			}

			public int getDjStatus() {
				return djStatus;
			}

			public void setDjStatus(int djStatus) {
				this.djStatus = djStatus;
			}

			public int getVipType() {
				return vipType;
			}

			public void setVipType(int vipType) {
				this.vipType = vipType;
			}

			public Object getRemarkName() {
				return remarkName;
			}

			public void setRemarkName(Object remarkName) {
				this.remarkName = remarkName;
			}

			public String getAvatarImgIdStr() {
				return avatarImgIdStr;
			}

			public void setAvatarImgIdStr(String avatarImgIdStr) {
				this.avatarImgIdStr = avatarImgIdStr;
			}

			public String getBackgroundImgIdStr() {
				return backgroundImgIdStr;
			}

			public void setBackgroundImgIdStr(String backgroundImgIdStr) {
				this.backgroundImgIdStr = backgroundImgIdStr;
			}

			public String getAvatarImgId_str() {
				return avatarImgId_str;
			}

			public void setAvatarImgId_str(String avatarImgId_str) {
				this.avatarImgId_str = avatarImgId_str;
			}
		}

		public static class TracksBean {
			/**
			 * name : 天空之城
			 * id : 26508186
			 * pst : 0
			 * t : 0
			 * ar : [{"id":3681,"name":"李志","tns":[],"alias":[]}]
			 * alia : []
			 * pop : 100
			 * st : 0
			 * rt :
			 * fee : 0
			 * v : 15
			 * crbt : null
			 * cf :
			 * al : {"id":2515024,"name":"我爱南京","picUrl":"http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg","tns":[],"pic":2378243650941255}
			 * dt : 223015
			 * h : {"br":320000,"fid":0,"size":8947321,"vd":-0.89}
			 * m : {"br":160000,"fid":0,"size":4485085,"vd":-0.47}
			 * l : {"br":96000,"fid":0,"size":2700191,"vd":-0.48}
			 * a : null
			 * cd : 1
			 * no : 5
			 * rtUrl : null
			 * ftype : 0
			 * rtUrls : []
			 * djId : 0
			 * copyright : 1
			 * s_id : 0
			 * mst : 9
			 * cp : 16001
			 * rtype : 0
			 * rurl : null
			 * mv : 0
			 * publishTime : 1255622400007
			 * tns : ["Be With You"]
			 */

			private String name;
			private int id;
			private int pst;
			private int t;
			private int pop;
			private int st;
			private String rt;
			private int fee;
			private int v;
			private Object crbt;
			private String cf;
			private AlBean al;
			private int dt;
			private HBean h;
			private MBean m;
			private LBean l;
			private Object a;
			private String cd;
			private int no;
			private Object rtUrl;
			private int ftype;
			private int djId;
			private int copyright;
			private int s_id;
			private int mst;
			private int cp;
			private int rtype;
			private Object rurl;
			private int mv;
			private long publishTime;
			private List<ArBean> ar;
			private List<?> alia;
			private List<?> rtUrls;
			private List<String> tns;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public int getPst() {
				return pst;
			}

			public void setPst(int pst) {
				this.pst = pst;
			}

			public int getT() {
				return t;
			}

			public void setT(int t) {
				this.t = t;
			}

			public int getPop() {
				return pop;
			}

			public void setPop(int pop) {
				this.pop = pop;
			}

			public int getSt() {
				return st;
			}

			public void setSt(int st) {
				this.st = st;
			}

			public String getRt() {
				return rt;
			}

			public void setRt(String rt) {
				this.rt = rt;
			}

			public int getFee() {
				return fee;
			}

			public void setFee(int fee) {
				this.fee = fee;
			}

			public int getV() {
				return v;
			}

			public void setV(int v) {
				this.v = v;
			}

			public Object getCrbt() {
				return crbt;
			}

			public void setCrbt(Object crbt) {
				this.crbt = crbt;
			}

			public String getCf() {
				return cf;
			}

			public void setCf(String cf) {
				this.cf = cf;
			}

			public AlBean getAl() {
				return al;
			}

			public void setAl(AlBean al) {
				this.al = al;
			}

			public int getDt() {
				return dt;
			}

			public void setDt(int dt) {
				this.dt = dt;
			}

			public HBean getH() {
				return h;
			}

			public void setH(HBean h) {
				this.h = h;
			}

			public MBean getM() {
				return m;
			}

			public void setM(MBean m) {
				this.m = m;
			}

			public LBean getL() {
				return l;
			}

			public void setL(LBean l) {
				this.l = l;
			}

			public Object getA() {
				return a;
			}

			public void setA(Object a) {
				this.a = a;
			}

			public String getCd() {
				return cd;
			}

			public void setCd(String cd) {
				this.cd = cd;
			}

			public int getNo() {
				return no;
			}

			public void setNo(int no) {
				this.no = no;
			}

			public Object getRtUrl() {
				return rtUrl;
			}

			public void setRtUrl(Object rtUrl) {
				this.rtUrl = rtUrl;
			}

			public int getFtype() {
				return ftype;
			}

			public void setFtype(int ftype) {
				this.ftype = ftype;
			}

			public int getDjId() {
				return djId;
			}

			public void setDjId(int djId) {
				this.djId = djId;
			}

			public int getCopyright() {
				return copyright;
			}

			public void setCopyright(int copyright) {
				this.copyright = copyright;
			}

			public int getS_id() {
				return s_id;
			}

			public void setS_id(int s_id) {
				this.s_id = s_id;
			}

			public int getMst() {
				return mst;
			}

			public void setMst(int mst) {
				this.mst = mst;
			}

			public int getCp() {
				return cp;
			}

			public void setCp(int cp) {
				this.cp = cp;
			}

			public int getRtype() {
				return rtype;
			}

			public void setRtype(int rtype) {
				this.rtype = rtype;
			}

			public Object getRurl() {
				return rurl;
			}

			public void setRurl(Object rurl) {
				this.rurl = rurl;
			}

			public int getMv() {
				return mv;
			}

			public void setMv(int mv) {
				this.mv = mv;
			}

			public long getPublishTime() {
				return publishTime;
			}

			public void setPublishTime(long publishTime) {
				this.publishTime = publishTime;
			}

			public List<ArBean> getAr() {
				return ar;
			}

			public void setAr(List<ArBean> ar) {
				this.ar = ar;
			}

			public List<?> getAlia() {
				return alia;
			}

			public void setAlia(List<?> alia) {
				this.alia = alia;
			}

			public List<?> getRtUrls() {
				return rtUrls;
			}

			public void setRtUrls(List<?> rtUrls) {
				this.rtUrls = rtUrls;
			}

			public List<String> getTns() {
				return tns;
			}

			public void setTns(List<String> tns) {
				this.tns = tns;
			}

			public static class AlBean {
				/**
				 * id : 2515024
				 * name : 我爱南京
				 * picUrl : http://p1.music.126.net/qDiDdR6wbQCsGsn34dmCVg==/2378243650941255.jpg
				 * tns : []
				 * pic : 2378243650941255
				 */

				private int id;
				private String name;
				private String picUrl;
				private long pic;
				private List<?> tns;

				public int getId() {
					return id;
				}

				public void setId(int id) {
					this.id = id;
				}

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getPicUrl() {
					return picUrl;
				}

				public void setPicUrl(String picUrl) {
					this.picUrl = picUrl;
				}

				public long getPic() {
					return pic;
				}

				public void setPic(long pic) {
					this.pic = pic;
				}

				public List<?> getTns() {
					return tns;
				}

				public void setTns(List<?> tns) {
					this.tns = tns;
				}
			}

			public static class HBean {
				/**
				 * br : 320000
				 * fid : 0
				 * size : 8947321
				 * vd : -0.89
				 */

				private int br;
				private int fid;
				private int size;
				private double vd;

				public int getBr() {
					return br;
				}

				public void setBr(int br) {
					this.br = br;
				}

				public int getFid() {
					return fid;
				}

				public void setFid(int fid) {
					this.fid = fid;
				}

				public int getSize() {
					return size;
				}

				public void setSize(int size) {
					this.size = size;
				}

				public double getVd() {
					return vd;
				}

				public void setVd(double vd) {
					this.vd = vd;
				}
			}

			public static class MBean {
				/**
				 * br : 160000
				 * fid : 0
				 * size : 4485085
				 * vd : -0.47
				 */

				private int br;
				private int fid;
				private int size;
				private double vd;

				public int getBr() {
					return br;
				}

				public void setBr(int br) {
					this.br = br;
				}

				public int getFid() {
					return fid;
				}

				public void setFid(int fid) {
					this.fid = fid;
				}

				public int getSize() {
					return size;
				}

				public void setSize(int size) {
					this.size = size;
				}

				public double getVd() {
					return vd;
				}

				public void setVd(double vd) {
					this.vd = vd;
				}
			}

			public static class LBean {
				/**
				 * br : 96000
				 * fid : 0
				 * size : 2700191
				 * vd : -0.48
				 */

				private int br;
				private int fid;
				private int size;
				private double vd;

				public int getBr() {
					return br;
				}

				public void setBr(int br) {
					this.br = br;
				}

				public int getFid() {
					return fid;
				}

				public void setFid(int fid) {
					this.fid = fid;
				}

				public int getSize() {
					return size;
				}

				public void setSize(int size) {
					this.size = size;
				}

				public double getVd() {
					return vd;
				}

				public void setVd(double vd) {
					this.vd = vd;
				}
			}

			public static class ArBean {
				/**
				 * id : 3681
				 * name : 李志
				 * tns : []
				 * alias : []
				 */

				private int id;
				private String name;
				private List<?> tns;
				private List<?> alias;

				public int getId() {
					return id;
				}

				public void setId(int id) {
					this.id = id;
				}

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public List<?> getTns() {
					return tns;
				}

				public void setTns(List<?> tns) {
					this.tns = tns;
				}

				public List<?> getAlias() {
					return alias;
				}

				public void setAlias(List<?> alias) {
					this.alias = alias;
				}
			}
		}

		public static class TrackIdsBean {
			/**
			 * id : 26508186
			 * v : 15
			 */

			private int id;
			private int v;

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public int getV() {
				return v;
			}

			public void setV(int v) {
				this.v = v;
			}
		}
	}

	public static class PrivilegesBean {
		/**
		 * id : 26508186
		 * fee : 0
		 * payed : 0
		 * st : 0
		 * pl : 320000
		 * dl : 320000
		 * sp : 7
		 * cp : 1
		 * subp : 1
		 * cs : false
		 * maxbr : 999000
		 * fl : 320000
		 * toast : false
		 * flag : 2
		 * preSell : false
		 */

		private int id;
		private int fee;
		private int payed;
		private int st;
		private int pl;
		private int dl;
		private int sp;
		private int cp;
		private int subp;
		private boolean cs;
		private int maxbr;
		private int fl;
		private boolean toast;
		private int flag;
		private boolean preSell;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getFee() {
			return fee;
		}

		public void setFee(int fee) {
			this.fee = fee;
		}

		public int getPayed() {
			return payed;
		}

		public void setPayed(int payed) {
			this.payed = payed;
		}

		public int getSt() {
			return st;
		}

		public void setSt(int st) {
			this.st = st;
		}

		public int getPl() {
			return pl;
		}

		public void setPl(int pl) {
			this.pl = pl;
		}

		public int getDl() {
			return dl;
		}

		public void setDl(int dl) {
			this.dl = dl;
		}

		public int getSp() {
			return sp;
		}

		public void setSp(int sp) {
			this.sp = sp;
		}

		public int getCp() {
			return cp;
		}

		public void setCp(int cp) {
			this.cp = cp;
		}

		public int getSubp() {
			return subp;
		}

		public void setSubp(int subp) {
			this.subp = subp;
		}

		public boolean isCs() {
			return cs;
		}

		public void setCs(boolean cs) {
			this.cs = cs;
		}

		public int getMaxbr() {
			return maxbr;
		}

		public void setMaxbr(int maxbr) {
			this.maxbr = maxbr;
		}

		public int getFl() {
			return fl;
		}

		public void setFl(int fl) {
			this.fl = fl;
		}

		public boolean isToast() {
			return toast;
		}

		public void setToast(boolean toast) {
			this.toast = toast;
		}

		public int getFlag() {
			return flag;
		}

		public void setFlag(int flag) {
			this.flag = flag;
		}

		public boolean isPreSell() {
			return preSell;
		}

		public void setPreSell(boolean preSell) {
			this.preSell = preSell;
		}
	}
}
