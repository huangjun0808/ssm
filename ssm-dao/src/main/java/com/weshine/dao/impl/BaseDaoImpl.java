package com.weshine.dao.impl;

import com.weshine.dao.BaseDao;
import com.weshine.model.Base;

import java.io.Serializable;

public class BaseDaoImpl<T extends Base, PK extends Serializable> implements BaseDao<T, PK> {

    public T get(PK id) {
        return null;
    }
}
