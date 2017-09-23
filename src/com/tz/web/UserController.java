package com.tz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tz.dao.UserDao;
import com.tz.model.User;
import com.tz.util.TzStringUtils;


@Controller
public class UserController {
	 
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
}
