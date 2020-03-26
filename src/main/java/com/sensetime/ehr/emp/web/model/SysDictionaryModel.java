package com.sensetime.ehr.emp.web.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.sensetime.ehr.emp.common.base.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 数据字典model
 *
 * @author zhengbing_vendor
 * @date 2020/3/24
 **/

@Data
@ApiModel(value = "数据字典")
public class SysDictionaryModel implements Serializable, BaseModel {

    private static final long serialVersionUID = -8598602011592580683L;
    @ApiModelProperty(value = "唯一id", name = "id")
    @JSONField(name = "id")
    private Long id;

    @ApiModelProperty(value = "状态", name = "status")
    @JSONField(name = "status")
    private String status;

    @ApiModelProperty(value = "数据来源[O(自研)|S(SF)]", name = "data_source")
    @JSONField(name = "data_source")
    private String dataSource;

    @ApiModelProperty(value = "英文名称", name = "en_us")
    @JSONField(name = "en_us")
    private String enUs;

    @ApiModelProperty(value = "optionId", name = "optionId")
    @JSONField(name = "option_id")
    private Integer optionId;

    @ApiModelProperty(value = "parentOptionId", name = "parentOptionId")
    @JSONField(name = "parent_optionId")
    private Integer parentOptionId;

    @ApiModelProperty(value = "字典类型", name = "type")
    @JSONField(name = "type")
    private String type;

    @ApiModelProperty(value = "字典子类型", name = "sub_type")
    @JSONField(name = "sub_type")
    private String subType;

    @ApiModelProperty(value = "字典key值", name = "key")
    @JSONField(name = "key")
    private String key;

    @ApiModelProperty(value = "external_code", name = "external_code")
    @JSONField(name = "external_code")
    private String externalCode;

    @ApiModelProperty(value = "字典值", name = "value")
    @JSONField(name = "value")
    private String value;

    @ApiModelProperty(value = "字典中文名称", name = "zh_cn")
    @JSONField(name = "zh_cn")
    private String zhCn;

    @ApiModelProperty(value = "字典备注", name = "remark")
    @JSONField(name = "remark")
    private String remark;

}
