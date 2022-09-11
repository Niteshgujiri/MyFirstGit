package com.jspiders.Shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jspiders.Shopping.entity.User;
import com.jspiders.Shopping.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	
	public  User saveUserDetails( User user)
	{
		 return userRepository.save(user);
	}

}
