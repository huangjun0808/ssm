package com.weshine.dao;

import com.weshine.model.User;

public interface UserDao {

    User getUser(Integer id);

    void insertUser1(User user);

    void insertUser2(User user);
}
