package com.example.springjspdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method= RequestMethod.POST)
	public String welcomePage(ModelMap model, @RequestParam String userID, @RequestParam String password) {
		if(userID.equals("admin") && password.equals("123")) {
			model.put("userId", userID);
			return "welcome";
		}
		model.put("errorMsg", "Please provide the correct userId and password");
		return "login";
//		return "welcome";
	}
}
