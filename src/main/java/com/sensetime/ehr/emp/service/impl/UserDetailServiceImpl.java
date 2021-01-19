package com.sensetime.ehr.emp.service.impl;

import com.sensetime.ehr.emp.entity.SysUser;
import com.sensetime.ehr.emp.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author zhengbing_vendor
 * @date 2020/3/24
 **/
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println(passwordEncoder.encode("123456"));

        SysUser user = sysUserService.loadUserByUsername(username);
        // 判断用户是否存在
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return new User(user.getLoginAccount(), user.getLoginPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
