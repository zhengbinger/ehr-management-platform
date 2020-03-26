package com.sensetime.ehr.emp.entity;

import com.sensetime.ehr.emp.common.base.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user_admin")
public class SysUserAdmin extends BaseEntity {
    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_id")
    private String employeeId;

    /**
     * 登录账号名称
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 登录账号密码
     */
    @Column(name = "login_password")
    private String loginPassword;

    /**
     * 登录账号关联邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 用户状态（0:失效/1:正常）
     */
    @Column(name = "status")
    private Boolean status;

    /**
     * 上次修改密码时间
     */
    @Column(name = "last_modify_password_time")
    private Date lastModifyPasswordTime;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新人
     */
    @Column(name = "updated_by")
    private String updatedBy;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 删除时间
     */
    @Column(name = "delete_date")
    private Date deleteDate;

    /**
     * 删除标记
     */
    @Column(name = "delete_flag")
    private Boolean deleteFlag;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return employee_id
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    /**
     * 获取登录账号名称
     *
     * @return login_name - 登录账号名称
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录账号名称
     *
     * @param loginName 登录账号名称
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * 获取登录账号密码
     *
     * @return login_password - 登录账号密码
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * 设置登录账号密码
     *
     * @param loginPassword 登录账号密码
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    /**
     * 获取登录账号关联邮箱
     *
     * @return email - 登录账号关联邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置登录账号关联邮箱
     *
     * @param email 登录账号关联邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取用户状态（0:失效/1:正常）
     *
     * @return status - 用户状态（0:失效/1:正常）
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置用户状态（0:失效/1:正常）
     *
     * @param status 用户状态（0:失效/1:正常）
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取上次修改密码时间
     *
     * @return last_modify_password_time - 上次修改密码时间
     */
    public Date getLastModifyPasswordTime() {
        return lastModifyPasswordTime;
    }

    /**
     * 设置上次修改密码时间
     *
     * @param lastModifyPasswordTime 上次修改密码时间
     */
    public void setLastModifyPasswordTime(Date lastModifyPasswordTime) {
        this.lastModifyPasswordTime = lastModifyPasswordTime;
    }

    /**
     * 获取创建人
     *
     * @return created_by - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新人
     *
     * @return updated_by - 更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置更新人
     *
     * @param updatedBy 更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取删除时间
     *
     * @return delete_date - 删除时间
     */
    public Date getDeleteDate() {
        return deleteDate;
    }

    /**
     * 设置删除时间
     *
     * @param deleteDate 删除时间
     */
    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    /**
     * 获取删除标记
     *
     * @return delete_flag - 删除标记
     */
    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置删除标记
     *
     * @param deleteFlag 删除标记
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}