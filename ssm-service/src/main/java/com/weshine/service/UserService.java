package com.weshine.service;

import com.weshine.model.User;
import com.weshine.support.bean.common.Page;
import com.weshine.support.bean.query.UserQuery;

import java.util.List;

public interface UserService extends BaseService<User, Integer> {

    Page<User> page(UserQuery userQuery);

    List<User> list(UserQuery userQuery);

    void softDelete(Integer id);


}
