package com.sensetime.ehr.emp.repository;

import com.sensetime.ehr.emp.common.base.BaseMapper;
import com.sensetime.ehr.emp.entity.HrManagers;
import com.sensetime.ehr.emp.entity.HrManagersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HrManagersMapper extends BaseMapper<HrManagers> {
    long countByExample(HrManagersExample example);

    int deleteByExample(HrManagersExample example);

    List<HrManagers> selectByExample(HrManagersExample example);

    int updateByExampleSelective(@Param("record") HrManagers record, @Param("example") HrManagersExample example);

    int updateByExample(@Param("record") HrManagers record, @Param("example") HrManagersExample example);
}