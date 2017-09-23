package com.tz.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * <B>作者：</B>kobe<BR>
 * <B>时间：</B>2017/09/23/ 21:42 星期六<BR>
 * <p>
 * <B>系统名称：</B>tzexam01<BR>
 * <B>概要说明：</B>tzexam01<BR>
 */
@Entity
@Table(name = "tz_subject", schema = "tzexam", catalog = "")
public class TzSubject {
    private int id;
    private String name;
    private String description;
    private Timestamp createTime;
    private Integer isDelete;
    private Integer status;
    private Timestamp updateTime;
    private Integer userId;
    private Integer upUserId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "is_delete")
    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "up_user_id")
    public Integer getUpUserId() {
        return upUserId;
    }

    public void setUpUserId(Integer upUserId) {
        this.upUserId = upUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TzSubject tzSubject = (TzSubject) o;

        if (id != tzSubject.id) return false;
        if (name != null ? !name.equals(tzSubject.name) : tzSubject.name != null) return false;
        if (description != null ? !description.equals(tzSubject.description) : tzSubject.description != null)
            return false;
        if (createTime != null ? !createTime.equals(tzSubject.createTime) : tzSubject.createTime != null) return false;
        if (isDelete != null ? !isDelete.equals(tzSubject.isDelete) : tzSubject.isDelete != null) return false;
        if (status != null ? !status.equals(tzSubject.status) : tzSubject.status != null) return false;
        if (updateTime != null ? !updateTime.equals(tzSubject.updateTime) : tzSubject.updateTime != null) return false;
        if (userId != null ? !userId.equals(tzSubject.userId) : tzSubject.userId != null) return false;
        if (upUserId != null ? !upUserId.equals(tzSubject.upUserId) : tzSubject.upUserId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (isDelete != null ? isDelete.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (upUserId != null ? upUserId.hashCode() : 0);
        return result;
    }
}
