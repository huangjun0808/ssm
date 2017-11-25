package com.weshine.model.enums;

/**
 * 枚举类@
 *
 * @author huangjun
 * &date 2017/11/23
 */
public enum RoleEnum {

    ADMIN("ADMIN","超级管理员"),

    ADMIN_MANAGER("ADMIN_MANAGER","管理员"),

    ADMIN_OPERATOR("ADMIN_OPERATOR","操作员");

    private String role;

    private String roleName;

    RoleEnum(String role, String roleName) {
        this.role = role;
        this.roleName = roleName;
    }

    public String getRole() {
        return role;
    }

    public String getRoleName() {
        return roleName;
    }

    public static String getRoleName(String role){
        for (RoleEnum r:RoleEnum.values()) {
            if(r.getRole().equals(role)){
                return r.getRoleName();
            }
        }
        return null;
    }
}
