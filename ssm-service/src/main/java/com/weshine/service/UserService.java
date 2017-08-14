package com.weshine.service;

import com.weshine.model.User;

public interface UserService {
    User getUser(Integer id);

    void insert2User(User user);

}
