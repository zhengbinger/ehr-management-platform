package com.sensetime.ehr.emp.service;

import com.sensetime.ehr.emp.entity.SysUserAdmin;

/**
 * @author zhengbing_vendor
 * @date 2020/3/24
 **/
public interface SysUserAdminService {

    SysUserAdmin loadUserByUsername(String username);

}
