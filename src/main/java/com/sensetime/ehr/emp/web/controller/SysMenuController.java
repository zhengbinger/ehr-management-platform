package com.sensetime.ehr.emp.web.controller;

import com.sensetime.ehr.emp.common.base.BaseController;
import com.sensetime.ehr.emp.common.web.PageDataList;
import com.sensetime.ehr.emp.common.web.PageRspResult;
import com.sensetime.ehr.emp.common.web.RspResult;
import com.sensetime.ehr.emp.common.web.RspStatus;
import com.sensetime.ehr.emp.entity.SysMenu;
import com.sensetime.ehr.emp.service.SysMenuService;
import com.sensetime.ehr.emp.web.model.SysMenuModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 资源管理
 *
 * @author zhengbing_vendor
 * @date 2020/3/24
 **/
@RestController
@RequestMapping("/menu")
@Api(value = "", tags = "系统资源相关接口，提供菜单，banner等相关的管理")
public class SysMenuController implements BaseController<SysMenuModel, Long> {

    @Autowired
    private SysMenuService sysMenuService;

    @Override
    @ApiOperation(value = "分页查询")
    public PageRspResult<SysMenuModel> list(@RequestBody SysMenuModel sysMenuModel, Pageable pageable) {
        PageRspResult<SysMenuModel> pageResult = sysMenuService.pageable(sysMenuModel, pageable);
        if (null == pageResult) {
            pageResult = new PageRspResult<>();
            PageDataList<SysMenuModel> pageDataList = new PageDataList<>();
            pageDataList.setCurPage(0);
            pageDataList.setPageSize(10);
            pageDataList.setTotalSize(0L);
            pageResult.setDetail(pageDataList);
        }
        pageResult.setResult(RspStatus.Result.SUCCESS);
        return pageResult;
    }

    @Override
    @ApiOperation(value = "根据主键获取资源明细")
    public RspResult<SysMenuModel> findById(Long id) {
        RspResult<SysMenuModel> result = new RspResult<>();
        SysMenu resoueces = sysMenuService.selectByKey(id);
        SysMenuModel model = new SysMenuModel();
        if (null != resoueces) {
            BeanUtils.copyProperties(resoueces, model);
            result.setDetail(model);
        } else {
            result.setErrMsg("无数据");
        }
        return result;
    }

    @Override
    @ApiOperation(value = "新增资源信息")
    public RspResult<SysMenuModel> save(SysMenuModel sysMenuModel) {
        RspResult<SysMenuModel> result = new RspResult<>();

        if (null != sysMenuModel) {
            SysMenu resource = new SysMenu();
            BeanUtils.copyProperties(sysMenuModel, resource);
            sysMenuService.save(resource);
            result.setResult(RspStatus.Result.SUCCESS);
        } else {
            result.setResult(RspStatus.Result.FAIL);
            result.setErrMsg("请求参数不正确，请检查");
        }
        return result;
    }

    @Override
    public RspResult<Boolean> deleteByKey(Long id) {
        RspResult<Boolean> result = new RspResult<>();
        sysMenuService.delete(id);
        result.setDetail(true);
        return result;
    }

    @Override
    public RspResult<SysMenuModel> modify(SysMenuModel sysMenuModel) {
        RspResult<SysMenuModel> result = new RspResult<>();
        if (null != sysMenuModel) {
            SysMenu resource = new SysMenu();
            BeanUtils.copyProperties(sysMenuModel, resource);
            sysMenuService.updateNotNull(resource);
            result.setResult(RspStatus.Result.SUCCESS);
        } else {
            result.setResult(RspStatus.Result.FAIL);
            result.setErrMsg("请求参数不正确，请检查");
        }
        return result;
    }
}
