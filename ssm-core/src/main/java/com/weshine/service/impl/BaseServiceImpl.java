package com.weshine.service.impl;

import com.weshine.dao.BaseDao;
import com.weshine.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK>{

    @Autowired
    private BaseDao<T, PK> baseDao;

    @Override
    public T get(PK id) {
        if(id == null){
            return null;
        }
        return baseDao.get(id);
    }

    @Override
    public T getBy(String field, String value) {
        return baseDao.getBy(field,value);
    }
}
