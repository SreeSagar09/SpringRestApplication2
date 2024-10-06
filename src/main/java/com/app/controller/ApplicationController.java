package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app")
public class ApplicationController {
	
	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public String getMethod() {
		try {
			return "From getMethod in ApplicationController";
		} catch (Exception e) {
			return "Internal Server Error";
		}
	}
	
	@RequestMapping(path = "/post", method = RequestMethod.POST)
	public String postMethod() {
		try {
			return "From postMethod in ApplicationController";
		} catch (Exception e) {
			return "Internal Server Error";
		}
	}
	
	@RequestMapping(path = "/put", method = RequestMethod.PUT)
	public String putMethod() {
		try {
			return "From putMethod in ApplicationController";
		} catch (Exception e) {
			return "Internal Server Error";
		}
	}
	
	@RequestMapping(path = "/patch", method = RequestMethod.PATCH)
	public String patchMethod() {
		try {
			return "From patchMethod in ApplicationController";
		} catch (Exception e) {
			return "Internal Server Error";
		}
	}
	
	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public String deleteMethod() {
		try {
			return "From deleteMethod in ApplicationController";
		} catch (Exception e) {
			return "Internal Server Error";
		}
	}
	
}
