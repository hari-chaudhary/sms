package com.school.mgmt.system.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@SessionAttributes("loggedInUser")
@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model) {
//		model.addAttribute("error", "true");
		return "login";

	}

	@RequestMapping("/error-forbidden")
	public String errorForbidden() {
		return "error-forbidden";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model, SessionStatus session) {
		SecurityContextHolder.getContext().setAuthentication(null);
		session.setComplete();
		return "redirect:/welcome";
	}
}
