package com.weshine.dao;

import com.weshine.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserDao extends BaseDao<User, Integer> {

    User getUser(Integer id);

    void insertUser1(User user);

    void insertUser2(User user);

    Map getBy1(@Param("field") String field, @Param("value") String value);
}
