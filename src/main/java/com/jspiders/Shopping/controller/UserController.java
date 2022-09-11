package com.jspiders.Shopping.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.Shopping.constant.ShoppingConstant;
import com.jspiders.Shopping.entity.User;
import com.jspiders.Shopping.service.UserService;

@RestController
@RequestMapping(value=ShoppingConstant.FOREWARD_SLASH)
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value=ShoppingConstant.ADD_USER_DETAILS)
	public @ResponseBody User addUserDetails(@RequestBody User user)
	{
		 return userService.saveUserDetails(user);
	}


	
}
