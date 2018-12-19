package com.dd.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.PermitAll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dd.dao.ConfigDAO;
import com.dd.dao.DAOException;
import com.dd.data.AppStatusInfo;
import com.dd.data.Brand;

@RestController
@CrossOrigin
public class BaseController {
	private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

	@RequestMapping("/")
	public String healthy() {
	    return String.valueOf(System.currentTimeMillis());
	}
	
	@RequestMapping("/healthz")
	public String healthz() {
	    return String.valueOf(System.currentTimeMillis());
	}
	
	@RequestMapping("/rediness")
	public String rediness() {
		return String.valueOf(System.currentTimeMillis());
	}
	
	

}
