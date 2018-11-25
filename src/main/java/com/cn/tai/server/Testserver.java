package com.cn.tai.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("goodbye")
public class Testserver implements MassegeService{
	
	@Value("${name:World}")
     private String name;
	@Override
	public String getMassege() {
		// TODO Auto-generated method stub
		return "hello "+this.name;
	}

}
 