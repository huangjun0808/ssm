package com.weshine.support.bean.query.sql;



public abstract class Criterion extends Generate {

    private Boolean and;

    public Criterion() {
        super();
        this.query();
    }

    public Boolean getAnd() {
        return and;
    }

    public void setAnd(Boolean and) {
        this.and = and;
    }

    public abstract void query();

}
