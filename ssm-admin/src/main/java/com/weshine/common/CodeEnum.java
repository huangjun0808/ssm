package com.weshine.common;

/**
 * 枚举类@
 * JSON返回状态码
 * @author huangjun
 * &date 2017/11/1
 */
public enum CodeEnum {

    SUCCESS("请求成功",1),

    FAIL("请求失败",-1),

    EMPTY("数据为空",10005);

    private String name;
    private Integer index;

    CodeEnum(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public static String getName(int index) {
        for (CodeEnum c : CodeEnum.values()) {
            if (c.getIndex()==index) {
                return c.name;
            }
        }
        return null;
    }

    public Integer getIndex() {
        return index;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Code{");
        sb.append("name='").append(name).append('\'');
        sb.append(", index=").append(index);
        sb.append('}');
        return sb.toString();
    }

}


