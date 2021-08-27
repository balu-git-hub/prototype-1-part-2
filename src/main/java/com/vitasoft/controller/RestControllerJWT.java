package com.vitasoft.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerJWT{


	
	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "index";
	}

}
