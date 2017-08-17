package com.weshine.support.bean.query.common;


import java.util.ArrayList;
import java.util.List;

public class GeneratedCriteria implements Generate {

    private List<Criteria> criteriaList;

    private StringBuilder query;

    public GeneratedCriteria() {
        criteriaList = new ArrayList<Criteria>();
    }

    @Override
    public GeneratedCriteria where(String propery, String condition, Object value) {
        Criteria criteria = new Criteria(propery,condition,value,true);
        criteriaList.add(criteria);
        query.append(Criterion.assembly(criteriaList));
        criteriaList.clear();
        return this;
    }

    @Override
    public GeneratedCriteria whereOr(String propery, String condition, Object value) {
        Criteria criteria = new Criteria(propery,condition,value,false);
        criteriaList.add(criteria);
        query.append(Criterion.assembly(criteriaList));
        criteriaList.clear();
        return this;
    }

    @Override
    public GeneratedCriteria where(Generate generate) {
        return this;
    }

    @Override
    public GeneratedCriteria whereOr(Generate generate) {
        return this;
    }

}
