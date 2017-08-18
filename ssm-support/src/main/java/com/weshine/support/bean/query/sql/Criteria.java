package com.weshine.support.bean.query.sql;



/**
 * 基础查询条件
 */
public class Criteria {

    private String propery;

    private String condition;

    private String value;

    private Boolean and;

    public Criteria() {
    }

    public String getPropery() {
        return propery;
    }

    public void setPropery(String propery) {
        this.propery = propery;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getAnd() {
        return and;
    }

    public void setAnd(Boolean and) {
        this.and = and;
    }



    public Criteria(String propery, String condition, Boolean and) {
        this.propery = propery;
        this.condition = condition;
        this.and = and;
    }

    public Criteria(String propery, String condition, String value, Boolean and) {
        this.propery = propery;
        this.condition = condition;
        this.value = value;
        this.and = and;
    }
}
