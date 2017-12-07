package com.gu.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gu.dao.UserMapper;
import com.gu.entity.User;

@Service("userService")
public class UserService {

	@Resource
	private UserMapper userMapper;

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userId);
	}

	public boolean addUser(User record) {
		boolean result = false;
        try {
        	userMapper.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
	}
}
