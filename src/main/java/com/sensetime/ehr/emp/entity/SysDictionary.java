package com.sensetime.ehr.emp.entity;

import com.sensetime.ehr.emp.common.base.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_dictionary")
public class SysDictionary extends BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status")
    private String status;

    @Column(name = "data_source")
    private String dataSource;

    @Column(name = "en_us")
    private String enUs;

    @Column(name = "option_id")
    private Integer optionId;

    @Column(name = "parent_option_id")
    private Integer parentOptionId;

    @Column(name = "type")
    private String type;

    @Column(name = "sub_type")
    private String subType;

    @Column(name = "external_code")
    private String externalCode;

    @Column(name = "value")
    private String value;

    @Column(name = "zh_cn")
    private String zhCn;

    @Column(name = "remark")
    private String remark;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "delete_date")
    private Date deleteDate;

    @Column(name = "del_flag")
    private Boolean delFlag;

    @Column(name = "key")
    private String key;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return data_source
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * @param dataSource
     */
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    /**
     * @return en_us
     */
    public String getEnUs() {
        return enUs;
    }

    /**
     * @param enUs
     */
    public void setEnUs(String enUs) {
        this.enUs = enUs == null ? null : enUs.trim();
    }

    /**
     * @return option_id
     */
    public Integer getOptionId() {
        return optionId;
    }

    /**
     * @param optionId
     */
    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    /**
     * @return parent_option_id
     */
    public Integer getParentOptionId() {
        return parentOptionId;
    }

    /**
     * @param parentOptionId
     */
    public void setParentOptionId(Integer parentOptionId) {
        this.parentOptionId = parentOptionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return sub_type
     */
    public String getSubType() {
        return subType;
    }

    /**
     * @param subType
     */
    public void setSubType(String subType) {
        this.subType = subType == null ? null : subType.trim();
    }

    /**
     * @return external_code
     */
    public String getExternalCode() {
        return externalCode;
    }

    /**
     * @param externalCode
     */
    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode == null ? null : externalCode.trim();
    }

    /**
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * @return zh_cn
     */
    public String getZhCn() {
        return zhCn;
    }

    /**
     * @param zhCn
     */
    public void setZhCn(String zhCn) {
        this.zhCn = zhCn == null ? null : zhCn.trim();
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return delete_date
     */
    public Date getDeleteDate() {
        return deleteDate;
    }

    /**
     * @param deleteDate
     */
    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    /**
     * @return del_flag
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * @param delFlag
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * @return key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }
}