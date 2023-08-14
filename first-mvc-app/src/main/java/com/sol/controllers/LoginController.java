package com.sol.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sol.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

//	//public LoginService loginService = new LoginService();
//	@Autowired
//	LoginService loginService;
//
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
////	@ResponseBody converts text to body
//	public String loginPage() {
//		return "login"; // page path, by viewResolver we can write the name only and not the full path
//	}
//
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String getLoginInfo(@RequestParam String name, @RequestParam String password, ModelMap model) {
//		// System.out.println(name);
//
//		System.out.println(loginService.validateUserLogin(name, password));
//
//		if (!loginService.validateUserLogin(name, password)) {
//			model.put("errorMsg", "Invalid username or password");
//			return "login";
//		}
//
//		model.put("name", name);
//
//		return "home";
//
//	}
//
//	@RequestMapping(value = "/home")
//	public String homePage() {
//		return "home";
//	}

}
