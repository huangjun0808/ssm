package com.weshine.dao;

import com.weshine.model.User;
import com.weshine.support.bean.query.UserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao extends BaseDao<User, Integer> {

    List<User> list(UserQuery userQuery);
}
