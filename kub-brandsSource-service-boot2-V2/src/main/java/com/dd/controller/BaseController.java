package com.dd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
@CrossOrigin
public class BaseController {
	private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

	@RequestMapping("/healthz")
	public String healthz() {
	    return String.valueOf(System.currentTimeMillis());
	}
	
	@RequestMapping("/rediness")
	public String rediness() {
		return String.valueOf(System.currentTimeMillis());
	}
	
	

}
