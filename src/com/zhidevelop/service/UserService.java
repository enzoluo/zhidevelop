package com.zhidevelop.service;

import com.zhidevelop.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description
 * author enzoluo
 * time 2018-03-06 10:22
 * version v1.0
 **/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public boolean verify(String loginName,String password){
        return userDao.verify(loginName,password);
    }
}
