package com.sensetime.ehr.emp.service.impl;

import com.sensetime.ehr.emp.entity.SysUserAdmin;
import com.sensetime.ehr.emp.entity.SysUserAdminExample;
import com.sensetime.ehr.emp.repository.SysUserAdminMapper;
import com.sensetime.ehr.emp.service.SysUserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhengbing_vendor
 * @date 2020/3/24
 **/
@Service
public class SysUserAdminServiceImpl implements SysUserAdminService {

    @Autowired
    private SysUserAdminMapper sysUserAdminMapper;

    @Override
    public SysUserAdmin loadUserByUsername(String username) {
        SysUserAdminExample example = new SysUserAdminExample();
        example.createCriteria().andLoginNameEqualTo(username);
        return sysUserAdminMapper.selectOneByExample(example);

    }
}
