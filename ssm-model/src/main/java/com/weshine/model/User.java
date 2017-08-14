package com.weshine.model;

import com.weshine.annotation.FieldName;
import com.weshine.annotation.TableName;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@TableName(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @FieldName(name = "name")
    private String name1;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



//    public static void main(String[] args) {
//        Field[] fields = User.class.getDeclaredFields();
//        Method[] methods = User.class.getMethods();
//        for (Field field:fields){
//            boolean hasAnnotation = field.isAnnotationPresent(FieldName.class);
//            if(hasAnnotation){
//                FieldName annotation = field.getAnnotation(FieldName.class);
//                System.out.println("Field = " + field.getName() + "   name="+annotation.name() );
//            }
//        }
//        for (Method method:methods){
//            System.out.println("Method="+method.getName());
//        }
//    }
}
