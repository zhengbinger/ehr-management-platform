package com.sensetime.ehr.emp.entity;

import com.sensetime.ehr.emp.common.base.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_menu")
public class SysMenu extends BaseEntity {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    /**
     * 父级菜单
     */
    @Column(name = "menu_parent")
    private Long menuParent;

    /**
     * 菜单状态
     */
    @Column(name = "status")
    private Boolean status;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建人
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 创建人
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取菜单名称
     *
     * @return menu_name - 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置菜单名称
     *
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 获取父级菜单
     *
     * @return menu_parent - 父级菜单
     */
    public Long getMenuParent() {
        return menuParent;
    }

    /**
     * 设置父级菜单
     *
     * @param menuParent 父级菜单
     */
    public void setMenuParent(Long menuParent) {
        this.menuParent = menuParent;
    }

    /**
     * 获取菜单状态
     *
     * @return status - 菜单状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置菜单状态
     *
     * @param status 菜单状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 获取创建人
     *
     * @return create_time - 创建人
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建人
     *
     * @param createTime 创建人
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return update_by - 创建人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置创建人
     *
     * @param updateBy 创建人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 获取创建人
     *
     * @return update_time - 创建人
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置创建人
     *
     * @param updateTime 创建人
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}