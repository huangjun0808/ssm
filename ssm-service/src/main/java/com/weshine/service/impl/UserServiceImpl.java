package com.weshine.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.weshine.dao.UserDao;
import com.weshine.model.User;
import com.weshine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * 类@
 *
 * @author huangjun
 * &date 2017/11/2
 */
@Service(value = "userService")
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public Page<User> getPage() {
        PageHelper.startPage(1,5);
        List<User> list = userDao.selectAll();
        return (Page<User>) list;
    }

    @Override
    public String getName() {
        return "22";
    }

    @Override
    public String getPassword() {
        return "22";
    }
}
