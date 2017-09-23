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
@Table(name = "tz_log", schema = "tzexam", catalog = "")
public class TzLog {
    private int id;
    private String message;
    private Integer userId;
    private Integer examId;
    private Integer subjectId;
    private Integer folderId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String ip;
    private String ipAddress;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
    @Column(name = "exam_id")
    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
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
    @Column(name = "folder_id")
    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
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
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "ip_address")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TzLog tzLog = (TzLog) o;

        if (id != tzLog.id) return false;
        if (message != null ? !message.equals(tzLog.message) : tzLog.message != null) return false;
        if (userId != null ? !userId.equals(tzLog.userId) : tzLog.userId != null) return false;
        if (examId != null ? !examId.equals(tzLog.examId) : tzLog.examId != null) return false;
        if (subjectId != null ? !subjectId.equals(tzLog.subjectId) : tzLog.subjectId != null) return false;
        if (folderId != null ? !folderId.equals(tzLog.folderId) : tzLog.folderId != null) return false;
        if (createTime != null ? !createTime.equals(tzLog.createTime) : tzLog.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(tzLog.updateTime) : tzLog.updateTime != null) return false;
        if (ip != null ? !ip.equals(tzLog.ip) : tzLog.ip != null) return false;
        if (ipAddress != null ? !ipAddress.equals(tzLog.ipAddress) : tzLog.ipAddress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (examId != null ? examId.hashCode() : 0);
        result = 31 * result + (subjectId != null ? subjectId.hashCode() : 0);
        result = 31 * result + (folderId != null ? folderId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        return result;
    }
}
