package com.heyan;

import com.heyan.processor.NCMProcessor;
import com.heyan.processor.OOPPageProcessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OopEliseApplication {

	public static void main(String[] args) {
		SpringApplication.run(OopEliseApplication.class, args);
	}



	@Autowired
	OOPPageProcessor oopPageProcessor;
	@Autowired
	NCMProcessor ncmProcessor;

	@GetMapping("/index")
	public String index() {
		new Thread(() -> oopPageProcessor.start(oopPageProcessor)).start();
		return "爬虫开启";
	}

	@GetMapping("/ncm")
	public String ncm() {
		new Thread(() -> ncmProcessor.start(ncmProcessor)).start();
		return "网易云请求开启";
	}

}
