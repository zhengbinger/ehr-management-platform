package com.sensetime.ehr.emp.repository;

import com.sensetime.ehr.emp.common.base.BaseMapper;
import com.sensetime.ehr.emp.entity.SysUser;
import com.sensetime.ehr.emp.entity.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper extends BaseMapper<SysUser> {

    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);
}