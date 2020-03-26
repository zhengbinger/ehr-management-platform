package com.sensetime.ehr.emp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sensetime.ehr.emp.common.base.BaseServiceImpl;
import com.sensetime.ehr.emp.common.utils.AbstractBeanUtils;
import com.sensetime.ehr.emp.common.web.PageDataList;
import com.sensetime.ehr.emp.common.web.PageRspResult;
import com.sensetime.ehr.emp.entity.SysResources;
import com.sensetime.ehr.emp.entity.SysResourcesExample;
import com.sensetime.ehr.emp.repository.SysResourcesMapper;
import com.sensetime.ehr.emp.service.SysResourcesService;
import com.sensetime.ehr.emp.web.model.SysResourcesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luoweiwen_vendor
 */
@Service
public class SysResourcesServiceImpl extends BaseServiceImpl<SysResources, Long> implements SysResourcesService {

    @Autowired
    private SysResourcesMapper sysResourcesMapper;

    @Override
    public PageRspResult<SysResourcesModel> pageable(SysResourcesModel resource, Pageable pageable) {
        PageHelper.startPage(pageable.getPageNumber(), pageable.getPageSize());
        SysResourcesExample example = new SysResourcesExample();
        SysResourcesExample.Criteria cri = example.createCriteria();
        setCriteria(resource, cri);

        //TODO 处理为，调用放进行条件设置
        cri.andUrlTypeEqualTo("banner");
        cri.andStatusEqualTo("active");
        example.setOrderByClause("show_order");
        List<SysResources> sysResources = sysResourcesMapper.selectByExample(example);
        PageInfo<SysResources> pageInfo = new PageInfo<>(sysResources);
        List<SysResourcesModel> models = null;
        try {
            models = AbstractBeanUtils.copyProperties(sysResources, SysResourcesModel.class);
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        PageRspResult<SysResourcesModel> pageResult = new PageRspResult<>();
        PageDataList<SysResourcesModel> pageDataList = new PageDataList<>();
        pageDataList.setCurPage(pageInfo.getPageNum());
        pageDataList.setData(models);
        pageDataList.setPageSize(pageInfo.getSize());
        pageDataList.setTotalSize(pageInfo.getTotal());
        pageResult.setDetail(pageDataList);
        return pageResult;
    }

    @Override
    public List<SysResources> listByIds(List<Long> resourceIds) {
        SysResourcesExample example = new SysResourcesExample();
        example.createCriteria().andIdIn(resourceIds);
        return sysResourcesMapper.selectByExample(example);
    }

    @Override
    public List<SysResources> listBanners() {
        SysResourcesExample example = new SysResourcesExample();
        example.createCriteria().andUrlTypeEqualTo("banner").andStatusEqualTo("active");
        example.setOrderByClause("show_order");
        return sysResourcesMapper.selectByExample(example);
    }

    private void setCriteria(SysResourcesModel resource, SysResourcesExample.Criteria cri) {

    }


}
