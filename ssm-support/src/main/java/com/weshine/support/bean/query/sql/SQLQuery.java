package com.weshine.support.bean.query.sql;

import java.util.List;

public class SQLQuery extends Generate {

    private String orderByClause;  //排序

    private Boolean annotation;

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public SQLQuery() {
        super();
    }

    @Override
    public String toString() {
        StringBuilder sql = new StringBuilder();
        sql.append(criteriaToStr(this.criteriaList));
        if(this.criteriaList.size()==0){
            sql.append(criterionToStr(this.criterionList,true));
        }else {
            sql.append(criterionToStr(this.criterionList,false));
        }
        if(this.orderByClause!=null && this.orderByClause.equals("")){
            sql.append("order by ");
            sql.append(orderByClause);
        }
        return sql.toString();
    }

    private String criteriaToStr(List<Criteria> criteriaList){
        StringBuilder sql = new StringBuilder();
        for (int i=0;i<criteriaList.size();i++){
            if(i != 0) {
                if (criteriaList.get(i).getAnd()) {
                    sql.append("and ");
                } else {
                    sql.append("or ");
                }
            }
            sql.append(sql(criteriaList.get(i)));
        }
        return sql.toString();
    }

    private String criterionToStr(List<Criterion> criterionList,Boolean first){
        StringBuilder sql = new StringBuilder();
        for (int i=0;i<criterionList.size();i++){
            if(!first || i!=0){
                if(criterionList.get(i).getAnd()){
                    sql.append("and ");
                }else {
                    sql.append("or ");
                }
            }
            sql.append("( ");
            sql.append(criteriaToStr(criterionList.get(i).criteriaList));
            sql.append(criterionToStr(criterionList.get(i).criterionList,false));
            sql.append(") ");
        }
        return sql.toString();
    }

    private String sql(Criteria criteria){
        StringBuilder sql = new StringBuilder();
        switch (criteria.getCondition().toLowerCase().trim()){
            case "=":
            case "eq":
                sql.append(criteria.getPropery()).append(" = ").append("\"").append(criteria.getValue()).append("\"");
                break;
            case "<>":
            case "neq":
                sql.append(criteria.getPropery()).append(" <> ").append("\"").append(criteria.getValue()).append("\"");
                break;
            case ">":
            case "gt":
                sql.append(criteria.getPropery()).append(" > ").append("\"").append(criteria.getValue()).append("\"");
                break;
            case ">=":
            case "ge":
                sql.append(criteria.getPropery()).append(" >= ").append("\"").append(criteria.getValue()).append("\"");
                break;
            case "<":
            case "lt":
                sql.append(criteria.getPropery()).append(" < ").append("\"").append(criteria.getValue()).append("\"");
                break;
            case "<=":
            case "le":
                sql.append(criteria.getPropery()).append(" <= ").append("\"").append(criteria.getValue()).append("\"");
                break;
            case "like":
                sql.append(criteria.getPropery()).append(" like ").append("\"").append("%").append(criteria.getValue()).append("%").append("\"");
                break;
            case "like left":
                sql.append(criteria.getPropery()).append(" like ").append("\"").append("%").append(criteria.getValue()).append("\"");
                break;
            case "like right":
                sql.append(criteria.getPropery()).append(" like ").append("\"").append(criteria.getValue()).append("%").append("\"");
                break;
            case "between":
                sql.append(criteria.getPropery()).append(" between ").append("(").append(criteria.getValue()).append(")");
                break;
            case "not between":
                sql.append(criteria.getPropery()).append(" not between ").append("(").append(criteria.getValue()).append(")");
                break;
            case "in":
                sql.append(criteria.getPropery()).append(" in ").append("(").append(criteria.getValue()).append(")");
                break;
            case "not in":
                sql.append(criteria.getPropery()).append(" not in ").append("(").append(criteria.getValue()).append(")");
                break;
            case "exp":
                sql.append(criteria.getPropery()).append(" ").append(criteria.getValue());
                break;
            default:
                sql.append("1=1");
                break;
        }
        sql.append(" ");
        return sql.toString();
    }

    //example
    public static void main(String[] args) {
        SQLQuery sqlQuery = new SQLQuery();
        sqlQuery.where("11","=","33").whereOr("11",">","33");
        sqlQuery.where(new Criterion() {
            @Override
            public void query() {
                this.where("11",">=","33");
                this.whereOr("11","<=","33");
            }
        });
        sqlQuery.whereOr(new Criterion() {
            @Override
            public void query() {
                this.where("scrop","exp","= scrop+1");
                this.whereOr("11","between","\"33\",\"44\"");
            }
        });
        System.out.println(sqlQuery.toString());
    }
}
