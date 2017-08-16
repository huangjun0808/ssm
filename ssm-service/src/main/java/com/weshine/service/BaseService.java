package com.weshine.service;

import java.io.Serializable;

public interface BaseService<T,PK extends Serializable> {

    T get(PK id);

    T getBy(String field, String value);

    void insert(T entity);

    void update(T entity);

    void delete(PK id);

}
