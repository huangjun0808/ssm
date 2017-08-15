package com.weshine.support.bean;

import java.io.Serializable;

/**
 * json对象子类 不带数据
 */
public class JSONBeanNoData extends JSONBean implements Serializable {

    private static final long serialVersionUID = 1L;

    public JSONBeanNoData() {
    }

    public JSONBeanNoData(Integer status, String message) {
        super(status, message);
    }


}
