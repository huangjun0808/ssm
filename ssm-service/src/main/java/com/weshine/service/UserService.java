package com.weshine.service;

import com.github.pagehelper.Page;
import com.weshine.model.User;

/**
 * 接口@
 *
 * @author huangjun
 * &date 2017/11/2
 */
public interface UserService extends BaseService<User> {

    public Page<User> getPage();

}
