package com.cn.tai.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RestController;

import com.cn.tai.pojo.ConfigBean;
import com.cn.tai.pojo.User;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=ConfigController.class)
@RestController

@EnableConfigurationProperties({ConfigBean.class,User.class})
public class ConfigController {
	@Autowired 
	private  ConfigBean conf;
	@Autowired
	private  User user;
	@Test
	public void Print() {
		System.out.println(conf.toString());
		System.out.println(user.toString());
		
	}
}
