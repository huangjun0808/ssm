package com.weshine.service;

import com.weshine.model.User;

import java.util.Map;

public interface UserService extends BaseService<User, Integer> {

    User getUser(Integer id);

    void insert2User(User user);

    Map getBy1(String field, String value);
}
