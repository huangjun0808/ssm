package com.weshine.service;

import java.util.List;

/**
 * 类@
 *
 * @author huangjun
 * &date 2017/11/1
 */
public interface BaseService<T> {

    /**
     * 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
     * @param key
     * @return T
     */
    T selectByPrimaryKey(Object key);

    /**
     * 根据实体中的属性值进行查询，查询条件使用等号
     * @param record
     * @return List
     */
    List<T> select(T record);

    /**
     * 查询全部结果，select(null)方法能达到同样的效果
     * @return List
     */
    List<T> selectAll();

    /**
     * 根据实体中的属性进行查询，只能有一个返回值，有多个结果是抛出异常，查询条件使用等号
     * @param record
     * @return T
     */
    T selectOne(T record);

    /**
     * 根据实体中的属性查询总数，查询条件使用等号
     * @param record
     * @return int
     */
    int selectCount(T record);

    /**
     * 保存一个实体，null的属性也会保存，不会使用数据库默认值
     * @param record
     * @return int
     */
    int insert(T record);

    /**
     * 保存一个实体，null的属性不会保存，会使用数据库默认值
     * @param record
     * @return int
     */
    int insertSelective(T record);

    /**
     * 根据主键更新实体全部字段，null值会被更新
     * @param record
     * @return int
     */
    int updateByPrimaryKey(T record);

    /**
     * 根据主键更新属性不为null的值
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * 根据实体属性作为条件进行删除，查询条件使用等号
     * @param record
     * @return int
     */
    int delete(T record);

    /**
     * 根据主键字段进行删除，方法参数必须包含完整的主键属性
     * @param key
     * @return int
     */
    int deleteByPrimaryKey(Object key);
}
