package com.weshine.query;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserQuery extends BaseQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Timestamp addTime;

    private Timestamp updateTime;

    private String nickName;

    private String userName;

    private String email;

    private String mobile;

    private Integer sex;

    private Boolean enabled;
}
