package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app")
public class ApplicationController {
	
	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public String getMethod() {
		return "From getMethod in ApplicationController";
	}
	
	@RequestMapping(path = "/post", method = RequestMethod.POST)
	public String postMethod() {
		return "From postMethod in ApplicationController";
	}
	
	@RequestMapping(path = "/put", method = RequestMethod.PUT)
	public String putMethod() {
		return "From putMethod in ApplicationController";
	}
	
	@RequestMapping(path = "/patch", method = RequestMethod.PATCH)
	public String patchMethod() {
		return "From patchMethod in ApplicationController";
	}
	
	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public String deleteMethod() {
		return "From deleteMethod in ApplicationController";
	}
	
}
