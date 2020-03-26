package com.sensetime.ehr.emp.common.base;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 持久化mapper基类接口
 *
 * @author zhengbing_vendor
 * @date 2020/3/26
 **/
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
