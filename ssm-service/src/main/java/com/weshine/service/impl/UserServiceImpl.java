package com.weshine.service.impl;

import com.github.pagehelper.PageHelper;
import com.weshine.dao.UserDao;
import com.weshine.model.User;
import com.weshine.service.UserService;
import com.weshine.support.bean.common.Page;
import com.weshine.support.bean.query.UserQuery;
import com.weshine.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User, Integer> implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Page<User> page(UserQuery userQuery) {
        PageHelper.startPage(userQuery.getPageNum(),userQuery.getPageSize());
        List<User> list = userDao.list(userQuery);
        return new Page<User>(list);
    }

    @Override
    public List<User> list(UserQuery userQuery) {
        return userDao.list(userQuery);
    }

    @Override
    public void softDelete(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUpdateTime(DateUtil.getTimeStamp());
        user.setEnabled(Boolean.FALSE);
        userDao.update(user);
    }
}
