package com.cn.tai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.tai.pojo.ConfigBean;
import com.cn.tai.pojo.User;
import com.cn.tai.server.MassegeService;
import com.cn.tai.server.Testserver;
import com.cn.tai.server.Testserver01;

//启动类
@RestController
@SpringBootApplication
public class SpringTest02Application {
 
	@Autowired
	private  ConfigBean conf;
	@Autowired
	private  User user;
	@Autowired
	private  MassegeService massegeservice;
	@RequestMapping("/")
	public String hello() {	
		System.out.println(massegeservice.getMassege());
		return "hello,world";
	}

	@RequestMapping("/conf")
	public String config() {
		return conf.toString();
		
	}
	@RequestMapping("/user")
	public String user() {
		return user.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTest02Application.class, args);
		/*
		 * SpringApplication application=new
		 * SpringApplication(SpringBootApplication.class);
		 * application.setBannerMode(Banner.Mode.LOG); application.run(args);
		 */
	}

}
