package com.sensetime.ehr.emp.service;

import com.sensetime.ehr.emp.entity.SysUser;

/**
 * @author zhengbing_vendor
 * @date 2020/3/24
 **/
public interface SysUserService {

    SysUser loadUserByUsername(String username);

}
