package org.demo.component.controller;

import org.demo.component.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	private UserService userService;
	
	@Autowired 
	public LoginController(UserService userService) {
		this.userService = userService;
	}

}
