package com.weshine.service.impl;

import com.weshine.dao.UserDao;
import com.weshine.model.User;
import com.weshine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(Integer id) {
        return userDao.getUser(id);
    }

    public void insert2User(User user) {
        userDao.insertUser1(user);
        user.setAge(user.getAge()+1);
        userDao.insertUser2(user);
    }
}
