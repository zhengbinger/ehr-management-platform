package com.sensetime.ehr.emp.repository;

import com.sensetime.ehr.emp.common.base.BaseMapper;
import com.sensetime.ehr.emp.entity.sysRole;
import com.sensetime.ehr.emp.entity.sysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sysRoleMapper extends BaseMapper<sysRole> {
    long countByExample(sysRoleExample example);

    int deleteByExample(sysRoleExample example);

    List<sysRole> selectByExample(sysRoleExample example);

    int updateByExampleSelective(@Param("record") sysRole record, @Param("example") sysRoleExample example);

    int updateByExample(@Param("record") sysRole record, @Param("example") sysRoleExample example);
}