package com.weshine.support.bean.query.common;


import java.util.List;

public class Criterion {


    public static String assembly(List<Criteria> criteriaList){
        StringBuilder result = new StringBuilder();
        if(criteriaList.size()==1){
            for (Criteria criteria:criteriaList){
                String and = criteria.getAnd() ? "and" : "or";
                result.append(and).append(" ……");
            }
        }else{
            for(int i=0;i<criteriaList.size();i++){
                String and = criteriaList.get(i).getAnd() ? "and" : "or";
                result.append(and);
                if(i==0){
                    result.append("(");
                }
                result.append(" ……");
            }
            result.append(")");
        }
        return result.toString();
    }


}
