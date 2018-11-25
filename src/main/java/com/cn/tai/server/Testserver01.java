package com.cn.tai.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("file")
public class Testserver01 implements MassegeService{
	@Value("${name:Hello}")
    private String name;
	@Override
	public String getMassege() {
		// TODO Auto-generated method stub
		return "file"+this.name;
	}
}
