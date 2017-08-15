package com.weshine.service.impl;

import com.weshine.dao.UserDao;
import com.weshine.model.User;
import com.weshine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Map;

@Service("userService")
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User, Integer> implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(Integer id) {
        return userDao.getUser(id);
    }

    public void insert2User(User user) {
        userDao.insertUser1(user);
//        userDao.insertUser2(user);
    }

    public Map getBy1(String field, String value) {
        return userDao.getBy1(field,value);
    }
}
