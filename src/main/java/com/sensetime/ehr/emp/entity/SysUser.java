package com.sensetime.ehr.emp.entity;

import com.sensetime.ehr.emp.common.base.BaseEntity;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser extends BaseEntity {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 登陆账号
     */
    @Column(name = "login_account")
    private String loginAccount;

    /**
     * 登陆密码
     */
    @Column(name = "login_password")
    private String loginPassword;

    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 账号状态
     */
    @Column(name = "status")
    private Boolean status;

    /**
     * 最后修改密码时间
     */
    @Column(name = "last_modify_password_time")
    private Date lastModifyPasswordTime;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新人
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 更新时间
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
     * 获取登陆账号
     *
     * @return login_account - 登陆账号
     */
    public String getLoginAccount() {
        return loginAccount;
    }

    /**
     * 设置登陆账号
     *
     * @param loginAccount 登陆账号
     */
    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount == null ? null : loginAccount.trim();
    }

    /**
     * 获取登陆密码
     *
     * @return login_password - 登陆密码
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * 设置登陆密码
     *
     * @param loginPassword 登陆密码
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取账号状态
     *
     * @return status - 账号状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置账号状态
     *
     * @param status 账号状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取最后修改密码时间
     *
     * @return last_modify_password_time - 最后修改密码时间
     */
    public Date getLastModifyPasswordTime() {
        return lastModifyPasswordTime;
    }

    /**
     * 设置最后修改密码时间
     *
     * @param lastModifyPasswordTime 最后修改密码时间
     */
    public void setLastModifyPasswordTime(Date lastModifyPasswordTime) {
        this.lastModifyPasswordTime = lastModifyPasswordTime;
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
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新人
     *
     * @return update_by - 更新人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新人
     *
     * @param updateBy 更新人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}