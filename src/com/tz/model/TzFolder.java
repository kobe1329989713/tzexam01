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
@Table(name = "tz_folder", schema = "tzexam", catalog = "")
public class TzFolder {
    private int id;
    private String name;
    private Integer subjectId;
    private Integer userId;
    private Integer status;
    private Integer isDelete;
    private Timestamp createTime;
    private String description;

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
    @Column(name = "subject_id")
    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
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
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TzFolder tzFolder = (TzFolder) o;

        if (id != tzFolder.id) return false;
        if (name != null ? !name.equals(tzFolder.name) : tzFolder.name != null) return false;
        if (subjectId != null ? !subjectId.equals(tzFolder.subjectId) : tzFolder.subjectId != null) return false;
        if (userId != null ? !userId.equals(tzFolder.userId) : tzFolder.userId != null) return false;
        if (status != null ? !status.equals(tzFolder.status) : tzFolder.status != null) return false;
        if (isDelete != null ? !isDelete.equals(tzFolder.isDelete) : tzFolder.isDelete != null) return false;
        if (createTime != null ? !createTime.equals(tzFolder.createTime) : tzFolder.createTime != null) return false;
        if (description != null ? !description.equals(tzFolder.description) : tzFolder.description != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (subjectId != null ? subjectId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (isDelete != null ? isDelete.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
