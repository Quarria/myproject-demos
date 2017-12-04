package com.gu.controller;

import com.gu.entity.User;
import com.gu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Song on 2017/2/15.
 * User控制层
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String index(){
        return "user/index";
    }

    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(@RequestParam(value = "user_name")String user_name){
        User user = userService.findUserByName(user_name);
        if (user != null){
            return user.getUer_id()+"/"+user.getUser_name()+"/"+user.getUser_age();
        }else{
            return "null";
        }
    }
}
