package com.sensetime.ehr.emp.web.model;

import com.sensetime.ehr.emp.common.base.BaseModel;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 系统配置信息
 *
 * @author zhengbing_vendor
 * @date 2020/3/25
 **/
@Data
@ApiModel(value = "系统配置信息")
public class SysConfigModel implements Serializable, BaseModel {
    private static final long serialVersionUID = 7537014688223378662L;
}
