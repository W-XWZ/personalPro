package com.personal.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.personal.dao.UserMapper;
import com.personal.domain.User;
import com.personal.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserMapper userDao;  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  