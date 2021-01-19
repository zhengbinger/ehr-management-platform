package com.sensetime.ehr.emp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sensetime.ehr.emp.common.base.BaseServiceImpl;
import com.sensetime.ehr.emp.common.utils.AbstractBeanUtils;
import com.sensetime.ehr.emp.common.web.PageDataList;
import com.sensetime.ehr.emp.common.web.PageRspResult;
import com.sensetime.ehr.emp.entity.SysMenu;
import com.sensetime.ehr.emp.entity.SysMenuExample;
import com.sensetime.ehr.emp.repository.SysMenuMapper;
import com.sensetime.ehr.emp.service.SysMenuService;
import com.sensetime.ehr.emp.web.model.SysMenuModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luoweiwen_vendor
 */
@Service
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenu, Long> implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public PageRspResult<SysMenuModel> pageable(SysMenuModel sysMenuModel, Pageable pageable) {
        return null;
    }
}
