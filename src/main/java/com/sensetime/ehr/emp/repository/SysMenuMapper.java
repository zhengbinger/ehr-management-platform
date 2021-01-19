package com.sensetime.ehr.emp.repository;

import com.sensetime.ehr.emp.common.base.BaseMapper;
import com.sensetime.ehr.emp.entity.SysMenu;
import com.sensetime.ehr.emp.entity.SysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper extends BaseMapper<SysMenu> {
    long countByExample(SysMenuExample example);

    int deleteByExample(SysMenuExample example);

    List<SysMenu> selectByExample(SysMenuExample example);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);
}