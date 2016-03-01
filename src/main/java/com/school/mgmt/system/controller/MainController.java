package com.school.mgmt.system.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.school.mgmt.system.domain.Student;
import com.school.mgmt.system.exception.StudentException;

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
	
	@RequestMapping(value = "student/add", method = RequestMethod.POST)
	public @ResponseBody Student add(@Valid @RequestBody Student student)throws StudentException{
		if (student.getFirstName().equals("Ex")) {
			throw new StudentException(student.getEmail(), "Unable to save employee with email: ");
		}
		return student;
	}
	
	@RequestMapping(value = {"/register"}, method = RequestMethod.GET)
	public String register() {
		return "register";
	}
	
}
