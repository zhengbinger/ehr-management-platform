package com.sensetime.ehr.emp.repository;

import com.sensetime.ehr.emp.common.base.BaseMapper;
import com.sensetime.ehr.emp.entity.SysUserAdmin;
import com.sensetime.ehr.emp.entity.SysUserAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserAdminMapper extends BaseMapper<SysUserAdmin> {
    long countByExample(SysUserAdminExample example);

    int deleteByExample(SysUserAdminExample example);

    List<SysUserAdmin> selectByExample(SysUserAdminExample example);

    int updateByExampleSelective(@Param("record") SysUserAdmin record, @Param("example") SysUserAdminExample example);

    int updateByExample(@Param("record") SysUserAdmin record, @Param("example") SysUserAdminExample example);
}