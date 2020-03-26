package com.sensetime.ehr.emp.common.base;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 服务实现基类
 *
 * @param <T>  实体类类对象名
 * @param <PK> 主键类型
 * @author zhengbing_vendor
 */

public abstract class BaseServiceImpl<T extends BaseEntity, PK> implements BaseService<T, PK> {

    @Autowired
    private Mapper<T> mapper;

    @Override
    public T selectByKey(PK id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public T selectOne(T t) {
        return mapper.selectOne(t);
    }

    @Override
    public int save(T t) {
        return mapper.insert(t);
    }

    @Override
    public int delete(PK id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateAll(T t) {
        return mapper.updateByPrimaryKey(t);
    }

    @Override
    public int updateNotNull(T t) {
        return mapper.updateByPrimaryKeySelective(t);
    }

    @Override
    public List<T> selectPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return mapper.selectAll();
    }

    @Override
    public List<T> selectPage(int pageNum, int pageSize, T entity) {
        PageHelper.startPage(pageNum, pageSize);
        return mapper.select(entity);
    }
}
