package com.sensetime.ehr.emp.entity;

import com.sensetime.ehr.emp.common.base.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_resources")
public class SysResources extends BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "url")
    private String url;

    @Column(name = "name")
    private String name;

    @Column(name = "icon")
    private String icon;

    @Column(name = "url_type")
    private String urlType;

    @Column(name = "show_order")
    private Integer showOrder;

    @Column(name = "status")
    private String status;

    @Column(name = "parent")
    private Long parent;

    @Column(name = "level")
    private Integer level;

    @Column(name = "module")
    private Integer module;

    @Column(name = "en_name")
    private String enName;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "delete_date")
    private Date deleteDate;

    @Column(name = "del_flag")
    private Boolean delFlag;

    @Column(name = "platform")
    private String platform;

    @Column(name = "show_name")
    private String showName;

    @Column(name = "parent_name")
    private String parentName;

    @Column(name = "show_panel")
    private Boolean showPanel;

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
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * @return url_type
     */
    public String getUrlType() {
        return urlType;
    }

    /**
     * @param urlType
     */
    public void setUrlType(String urlType) {
        this.urlType = urlType == null ? null : urlType.trim();
    }

    /**
     * @return show_order
     */
    public Integer getShowOrder() {
        return showOrder;
    }

    /**
     * @param showOrder
     */
    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
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
     * @return parent
     */
    public Long getParent() {
        return parent;
    }

    /**
     * @param parent
     */
    public void setParent(Long parent) {
        this.parent = parent;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * @return module
     */
    public Integer getModule() {
        return module;
    }

    /**
     * @param module
     */
    public void setModule(Integer module) {
        this.module = module;
    }

    /**
     * @return en_name
     */
    public String getEnName() {
        return enName;
    }

    /**
     * @param enName
     */
    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
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
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @param platform
     */
    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    /**
     * @return show_name
     */
    public String getShowName() {
        return showName;
    }

    /**
     * @param showName
     */
    public void setShowName(String showName) {
        this.showName = showName == null ? null : showName.trim();
    }

    /**
     * @return parent_name
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * @param parentName
     */
    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    /**
     * @return show_panel
     */
    public Boolean getShowPanel() {
        return showPanel;
    }

    /**
     * @param showPanel
     */
    public void setShowPanel(Boolean showPanel) {
        this.showPanel = showPanel;
    }
}