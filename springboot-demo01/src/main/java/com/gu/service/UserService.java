package com.gu.service;

import com.gu.entity.User;
import com.gu.repository.UserRepossitoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Song on 2017/2/15.
 * User业务逻辑
 */
@Service
public class UserService {
    @Autowired
    private UserRepossitoty userRepossitoty;

    public User findUserByName(String user_name){
        User user = null;
        try{
            user = userRepossitoty.findByUserName(user_name);
        }catch (Exception e){}

        return user;

    }
}
