package com.weshine.dao;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

public abstract interface BaseDao<T, PK extends Serializable> {

    T get(PK id);

    T getBy(@Param("field") String field, @Param("value") String value);

    void insert(T object);

    void update(T object);

    void remove(PK id);

}
