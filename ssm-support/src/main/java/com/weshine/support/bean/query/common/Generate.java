package com.weshine.support.bean.query.common;

public interface Generate {

    GeneratedCriteria where(String propery, String condition, Object value);

    GeneratedCriteria whereOr(String propery, String condition, Object value);

    GeneratedCriteria where(Generate generate);

    GeneratedCriteria whereOr(Generate generate);


}
