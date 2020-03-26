package com.sensetime.ehr.emp.repository;

import com.sensetime.ehr.emp.common.base.BaseMapper;
import com.sensetime.ehr.emp.entity.SysResources;
import com.sensetime.ehr.emp.entity.SysResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysResourcesMapper extends BaseMapper<SysResources> {
    long countByExample(SysResourcesExample example);

    int deleteByExample(SysResourcesExample example);

    List<SysResources> selectByExample(SysResourcesExample example);

    int updateByExampleSelective(@Param("record") SysResources record, @Param("example") SysResourcesExample example);

    int updateByExample(@Param("record") SysResources record, @Param("example") SysResourcesExample example);
}