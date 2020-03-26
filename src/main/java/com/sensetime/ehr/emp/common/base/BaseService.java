package com.sensetime.ehr.emp.common.base;

import java.util.List;

/**
 * 服务接口基类
 *
 * @param <T>
 * @param <PK>
 */
public interface BaseService<T, PK> {

    T selectByKey(PK id);

    T selectOne(T entity);

    int save(T entity);

    int delete(PK id);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectPage(int pageNum, int pageSize);

    List<T> selectPage(int pageNum, int pageSize, T entity);
}