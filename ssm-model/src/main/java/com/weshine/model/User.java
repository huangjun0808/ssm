package com.weshine.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.*;

/**
 * 用户模型类
 * @author huangjun
 */
@Table(name = "user")
public class User extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 用户主键ID
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;
    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Timestamp addTime;
    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Timestamp updateTime;
    /**
     * 角色
     */
    private String role;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 真实姓名
     */
    private String realname;
    /**
     * 备注
     */
    private String remark;
    /**
     * 账号是否过期
     */
    @Column(name = "account_non_expired")
    private Boolean accountNonExpired;
    /**
     * 账号是否锁定
     */
    @Column(name = "account_non_locked")
    private Boolean accountNonLocked;
    /**
     * 凭证是否过期
     */
    @Column(name = "credentials_non_expired")
    private Boolean credentialsNonExpired;

    /**
     * 是否启用
     */
    private Boolean enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getRole() {
        return role;
    }

    public Set<String> getSetRoles(){
        Set<String> set = new HashSet<>();
        Collections.addAll(set, role.split(","));
        return set;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(Boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public Boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public Boolean getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public Set<String> getUserRoles(){
        Set<String> roles = new TreeSet<>();
        for (String role : this.getRole().split(",")) {
            roles.add(role);
        }
        return roles;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (addTime != null ? !addTime.equals(user.addTime) : user.addTime != null) return false;
        if (updateTime != null ? !updateTime.equals(user.updateTime) : user.updateTime != null) return false;
        if (role != null ? !role.equals(user.role) : user.role != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (realname != null ? !realname.equals(user.realname) : user.realname != null) return false;
        if (remark != null ? !remark.equals(user.remark) : user.remark != null) return false;
        if (accountNonExpired != null ? !accountNonExpired.equals(user.accountNonExpired) : user.accountNonExpired != null)
            return false;
        if (accountNonLocked != null ? !accountNonLocked.equals(user.accountNonLocked) : user.accountNonLocked != null)
            return false;
        if (credentialsNonExpired != null ? !credentialsNonExpired.equals(user.credentialsNonExpired) : user.credentialsNonExpired != null)
            return false;
        return enabled != null ? enabled.equals(user.enabled) : user.enabled == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (addTime != null ? addTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (realname != null ? realname.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (accountNonExpired != null ? accountNonExpired.hashCode() : 0);
        result = 31 * result + (accountNonLocked != null ? accountNonLocked.hashCode() : 0);
        result = 31 * result + (credentialsNonExpired != null ? credentialsNonExpired.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", role='").append(role).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", realname='").append(realname).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", accountNonExpired=").append(accountNonExpired);
        sb.append(", accountNonLocked=").append(accountNonLocked);
        sb.append(", credentialsNonExpired=").append(credentialsNonExpired);
        sb.append(", enabled=").append(enabled);
        sb.append('}');
        return sb.toString();
    }
}
