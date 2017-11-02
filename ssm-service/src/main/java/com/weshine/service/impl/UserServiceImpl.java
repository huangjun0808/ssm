package com.weshine.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.weshine.dao.UserDao;
import com.weshine.model.User;
import com.weshine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author huangjun
 */
@Service("userService")
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public Page<User> getPage() {
        PageHelper.startPage(1,5);
        List<User> list = userDao.selectAll();
        return (Page<User>) list;
    }
}
