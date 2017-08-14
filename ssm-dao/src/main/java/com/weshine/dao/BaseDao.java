package com.weshine.dao;

import com.weshine.model.Base;

import java.io.Serializable;

public abstract interface BaseDao<T extends Base, PK extends Serializable> {

    /**
     * 通过主键获取某个记录
     * @param id 主键
     * @return PO
     */
    public T get(PK id);

}
