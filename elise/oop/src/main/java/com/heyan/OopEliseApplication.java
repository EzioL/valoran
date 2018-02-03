package com.heyan;

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
	OOPPageProcessor mProcessor;


	@GetMapping("/index")
	public String index() {
		new Thread(() -> mProcessor.start(mProcessor)).start();
		return "爬虫开启";
	}


}
