package com.weshine.support.bean.query.sql;


import java.util.ArrayList;
import java.util.List;

public class Generate {

    protected List<Criterion> criterionList;

    protected List<Criteria> criteriaList;

    public Generate() {
        this.criteriaList = new ArrayList<Criteria>();
        this.criterionList = new ArrayList<Criterion>();
    }

    public Generate where(String propery, String condition, String value){
        Criteria criteria = new Criteria(propery, condition, value , true);
        if(criteriaList==null){
            this.criteriaList = new ArrayList<Criteria>();
        }
        criteriaList.add(criteria);
        return this;
    }

    public Generate whereOr(String propery, String condition, String value){
        Criteria criteria = new Criteria(propery, condition, value , false);
        criteriaList.add(criteria);
        return this;
    }

    public Generate where(Criterion criterion){
        criterion.setAnd(true);
        criterionList.add(criterion);
        return this;
    }

    public Generate whereOr(Criterion criterion){
        criterion.setAnd(false);
        criterionList.add(criterion);
        return this;
    }

}
