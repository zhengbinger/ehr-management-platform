package com.sensetime.ehr.emp.web.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.sensetime.ehr.emp.common.base.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * sys_resources Model
 *
 * @author zhengbing_vendor
 * @date 2020/3/24
 **/
@Data
@ApiModel(discriminator = "系统菜单")
public class SysMenuModel implements BaseModel {

    @ApiModelProperty(value = "唯一id", name = "id")
    @JSONField(name = "id")
    private Long id;

    @ApiModelProperty(value = "资源对应路径")
    @JSONField(name = "url")
    private String url;

    @ApiModelProperty(value = "资源名称")
    @JSONField(name = "name")
    private String name;

    @ApiModelProperty(value = "资源图标")
    @JSONField(name = "icon")
    private String icon;

    @ApiModelProperty(value = "资源路径类型")
    @JSONField(name = "url_type")
    private String urlType;

    @ApiModelProperty(value = "资源显示排序字段")
    @JSONField(name = "show_order")
    private int showOrder;

    @ApiModelProperty(value = "资源状态")
    @JSONField(name = "status")
    private String status;

    @ApiModelProperty(value = "资源父级")
    @JSONField(name = "parent")
    private long parent;

    @ApiModelProperty(value = "资源级别")
    @JSONField(name = "level")
    private int level;

    @ApiModelProperty(value = "资源模块")
    @JSONField(name = "module")
    private int module;

    @ApiModelProperty(value = "资源英文名称")
    @JSONField(name = "en_name")
    private String enName;

    @ApiModelProperty(value = "资源所属平台")
    @JSONField(name = "platform")
    private String platform;

    @ApiModelProperty(value = "资源显示名称")
    @JSONField(name = "show_name")
    private String showName;

    @ApiModelProperty(value = "资源父级名称")
    @JSONField(name = "parent_name")
    private String parentName;

    @ApiModelProperty(value = "资源显示面板")
    @JSONField(name = "show_panel")
    private String showPanel;

}
