package com.cn.tai.controller;


import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testslf4jController {
	private Logger logger = Logger.getLogger(Testslf4jController.class);

    @PostConstruct
    public @ResponseBody String HelloWorld(){
        for(int i=0;i<10;i++){	
            logger.debug("debug"+i);
            logger.info("info"+i);
            logger.warn("warn"+i);
            logger.error("error"+i);
            logger.fatal("fatal"+i);
        }
        return "Hello World!";
    }
}


