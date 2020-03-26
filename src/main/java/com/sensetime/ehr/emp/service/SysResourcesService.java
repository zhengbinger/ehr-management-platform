package com.sensetime.ehr.emp.service;

import com.sensetime.ehr.emp.common.base.BaseService;
import com.sensetime.ehr.emp.common.web.PageRspResult;
import com.sensetime.ehr.emp.entity.SysResources;
import com.sensetime.ehr.emp.web.model.SysResourcesModel;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author luoweiwen_vendor
 */
public interface SysResourcesService extends BaseService<SysResources, Long> {

    /**
     * 分页查询
     *
     * @param resource SysResouecesModel
     * @param pageable Pageable
     * @return PageRspResult<SysResouecesModel>
     */
    PageRspResult<SysResourcesModel> pageable(SysResourcesModel resource, Pageable pageable);

    /**
     * 根据id查询集合
     *
     * @param resourceIds List<Long>
     * @return List<SysResources>
     */
    List<SysResources> listByIds(List<Long> resourceIds);

    /**
     * 列出所有激活状态的banner
     *
     * @return
     */
    List<SysResources> listBanners();
}
