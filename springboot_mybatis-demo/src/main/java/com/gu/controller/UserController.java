package com.gu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gu.entity.User;
import com.gu.service.UserService;

@Controller
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

	@Resource
    private UserService userService;
	
	@RequestMapping("/showUser")
	@ResponseBody
	 public User toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        return user;
    }
}
