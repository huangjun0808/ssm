package com.weshine.service;

import com.github.pagehelper.Page;
import com.weshine.model.User;

public interface UserService extends BaseService<User> {

    public Page<User> getPage();

}
