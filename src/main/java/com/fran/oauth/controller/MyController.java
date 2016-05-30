package com.fran.oauth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by francisco on 3/31/16.
 */
@RestController
public class MyController {

	private int counter=0;
	
    private static final Logger log = LoggerFactory.getLogger(MyController.class);

	
    @RequestMapping("/my")
    public String myControllerFunction(){
    	log.info("my API called {} times", ++counter);
    	
        return String.format("my API called %s times", counter);
    }
}
