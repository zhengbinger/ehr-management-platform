package com.sensetime.ehr.emp.service;

import com.sensetime.ehr.emp.common.base.BaseService;
import com.sensetime.ehr.emp.common.web.PageRspResult;
import com.sensetime.ehr.emp.entity.SysMenu;
import com.sensetime.ehr.emp.web.model.SysMenuModel;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author luoweiwen_vendor
 */
public interface SysMenuService extends BaseService<SysMenu, Long> {


    /**
     * 分页查询菜单
     *
     * @param sysMenuModel - 菜单model
     * @param pageable 分页对象
     * @return PageRspResult<SysMenuModel>
     */
    PageRspResult<SysMenuModel> pageable(SysMenuModel sysMenuModel, Pageable pageable);
}
