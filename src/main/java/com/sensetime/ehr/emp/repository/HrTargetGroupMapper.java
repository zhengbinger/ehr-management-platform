package com.sensetime.ehr.emp.repository;

import com.sensetime.ehr.emp.common.base.BaseMapper;
import com.sensetime.ehr.emp.entity.HrTargetGroup;
import com.sensetime.ehr.emp.entity.HrTargetGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HrTargetGroupMapper extends BaseMapper<HrTargetGroup> {
    long countByExample(HrTargetGroupExample example);

    int deleteByExample(HrTargetGroupExample example);

    List<HrTargetGroup> selectByExample(HrTargetGroupExample example);

    int updateByExampleSelective(@Param("record") HrTargetGroup record, @Param("example") HrTargetGroupExample example);

    int updateByExample(@Param("record") HrTargetGroup record, @Param("example") HrTargetGroupExample example);
}