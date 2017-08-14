package com.weshine.common;

import java.io.Serializable;

public class JSONBeanNoData extends JSONBean implements Serializable {

    private static final long serialVersionUID = 1L;

    public JSONBeanNoData() {
    }

    public JSONBeanNoData(Integer status, String message) {
        super(status, message);
    }


}
