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
@Table(name = "tz_exam_desc", schema = "tzexam", catalog = "")
public class TzExamDesc {
    private int id;
    private Integer teacherId;
    private Integer userId;
    private Integer examId;
    private Integer subjectId;
    private Timestamp createTime;
    private String teacherContent;
    private String studentContent;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "teacher_id")
    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "teacher_content")
    public String getTeacherContent() {
        return teacherContent;
    }

    public void setTeacherContent(String teacherContent) {
        this.teacherContent = teacherContent;
    }

    @Basic
    @Column(name = "student_content")
    public String getStudentContent() {
        return studentContent;
    }

    public void setStudentContent(String studentContent) {
        this.studentContent = studentContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TzExamDesc that = (TzExamDesc) o;

        if (id != that.id) return false;
        if (teacherId != null ? !teacherId.equals(that.teacherId) : that.teacherId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (examId != null ? !examId.equals(that.examId) : that.examId != null) return false;
        if (subjectId != null ? !subjectId.equals(that.subjectId) : that.subjectId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (teacherContent != null ? !teacherContent.equals(that.teacherContent) : that.teacherContent != null)
            return false;
        if (studentContent != null ? !studentContent.equals(that.studentContent) : that.studentContent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (teacherId != null ? teacherId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (examId != null ? examId.hashCode() : 0);
        result = 31 * result + (subjectId != null ? subjectId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (teacherContent != null ? teacherContent.hashCode() : 0);
        result = 31 * result + (studentContent != null ? studentContent.hashCode() : 0);
        return result;
    }
}
