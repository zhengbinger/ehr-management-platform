package com.sensetime.ehr.emp.web.controller;

import com.sensetime.ehr.emp.common.base.BaseController;
import com.sensetime.ehr.emp.common.web.PageRspResult;
import com.sensetime.ehr.emp.common.web.RspResult;
import com.sensetime.ehr.emp.common.web.RspStatus;
import com.sensetime.ehr.emp.entity.SysDictionary;
import com.sensetime.ehr.emp.service.SysDictionaryService;
import com.sensetime.ehr.emp.web.model.SysDictionaryModel;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DictionaryCotroller
 *
 * @author zhengbing_vendor
 * @date 2020/3/24
 **/
@RequestMapping("/dictionary")
@RestController
@Api(value = "", tags = "数据字典相关接口")
public class SysDictionaryController implements BaseController<SysDictionaryModel, Long> {

    @Autowired
    private SysDictionaryService dictionaryService;

    @Override
    public PageRspResult<SysDictionaryModel> list(SysDictionaryModel sysDictionaryModel, Pageable pageable) {
        return null;
    }

    @Override
    public RspResult<SysDictionaryModel> findById(Long id) {
        return null;
    }

    @Override
    public RspResult<SysDictionaryModel> save(SysDictionaryModel sysDictionaryModel) {
        RspResult<SysDictionaryModel> result = new RspResult<>();
        SysDictionary dictionary = new SysDictionary();
        if (null != sysDictionaryModel) {
            BeanUtils.copyProperties(sysDictionaryModel, dictionary);
            dictionaryService.save(dictionary);
            result.setDetail(sysDictionaryModel);
            result.setResult(RspStatus.Result.SUCCESS);
        } else {
            result.setResult(RspStatus.Result.FAIL);
            result.setErrMsg("请求参数不正确，请检查");
        }
        return result;
    }

    @Override
    public RspResult<Boolean> deleteByKey(Long id) {
        return null;
    }

    @Override
    public RspResult<SysDictionaryModel> modify(SysDictionaryModel sysDictionaryModel) {
        return null;
    }
}
