package com.sensetime.ehr.emp.service.impl;

import com.sensetime.ehr.emp.entity.SysUser;
import com.sensetime.ehr.emp.entity.SysUserExample;
import com.sensetime.ehr.emp.repository.SysUserMapper;
import com.sensetime.ehr.emp.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhengbing_vendor
 * @date 2020/3/24
 **/
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser loadUserByUsername(String username) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andLoginAccountEqualTo(username);
        return sysUserMapper.selectOneByExample(example);

    }
}
