package com.weshine.support.bean.query;

public class UserQuery extends BaseQuery {

    private Integer id;

    private String nickName;

    private String userName;

    private String email;

    private String mobile;

    private Integer sex;

    private Boolean enabled;

    public UserQuery() {
    }

    public UserQuery(Integer pageNum) {
        super(pageNum);
    }

    public UserQuery(Integer pageNum, Integer pageSize) {
        super(pageNum, pageSize);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
