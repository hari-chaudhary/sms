package com.school.mgmt.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping(value = { "/error-forbidden" }, method = RequestMethod.GET)
	public String error() {
		return "error-forbidden";
	}
		
	@RequestMapping(value = {"/admin"}, method = RequestMethod.GET)
	public String admin() {
		return "admin";
	}
	
	@RequestMapping(value = {"/staff"}, method = RequestMethod.GET)
	public String staff() {
		return "staff";
	}
	
	@RequestMapping(value = {"/student"}, method = RequestMethod.GET)
	public String student() {
		return "student";
	}
	
	@RequestMapping(value = {"/register"}, method = RequestMethod.GET)
	public String register() {
		return "register";
	}
	
}
