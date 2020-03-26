package com.sensetime.ehr.emp.repository;

import com.sensetime.ehr.emp.common.base.BaseMapper;
import com.sensetime.ehr.emp.entity.SysDictionary;
import com.sensetime.ehr.emp.entity.SysDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictionaryMapper extends BaseMapper<SysDictionary> {
    long countByExample(SysDictionaryExample example);

    int deleteByExample(SysDictionaryExample example);

    List<SysDictionary> selectByExample(SysDictionaryExample example);

    int updateByExampleSelective(@Param("record") SysDictionary record, @Param("example") SysDictionaryExample example);

    int updateByExample(@Param("record") SysDictionary record, @Param("example") SysDictionaryExample example);
}