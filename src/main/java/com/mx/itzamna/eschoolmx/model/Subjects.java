package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Subjects generated by hbm2java
 */
@Entity
@Table(name="subjects"
    ,catalog="villaeducativa"
)
public class Subjects  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String code;
     private Integer batchId;
     private Boolean noExams;
     private Integer maxWeeklyClasses;
     private Integer electiveGroupId;
     private Boolean isDeleted;
     private Date createdAt;
     private Date updatedAt;

    public Subjects() {
    }

    public Subjects(String name, String code, Integer batchId, Boolean noExams, Integer maxWeeklyClasses, Integer electiveGroupId, Boolean isDeleted, Date createdAt, Date updatedAt) {
       this.name = name;
       this.code = code;
       this.batchId = batchId;
       this.noExams = noExams;
       this.maxWeeklyClasses = maxWeeklyClasses;
       this.electiveGroupId = electiveGroupId;
       this.isDeleted = isDeleted;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="code")
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    
    @Column(name="batch_id")
    public Integer getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    
    @Column(name="no_exams")
    public Boolean getNoExams() {
        return this.noExams;
    }
    
    public void setNoExams(Boolean noExams) {
        this.noExams = noExams;
    }

    
    @Column(name="max_weekly_classes")
    public Integer getMaxWeeklyClasses() {
        return this.maxWeeklyClasses;
    }
    
    public void setMaxWeeklyClasses(Integer maxWeeklyClasses) {
        this.maxWeeklyClasses = maxWeeklyClasses;
    }

    
    @Column(name="elective_group_id")
    public Integer getElectiveGroupId() {
        return this.electiveGroupId;
    }
    
    public void setElectiveGroupId(Integer electiveGroupId) {
        this.electiveGroupId = electiveGroupId;
    }

    
    @Column(name="is_deleted")
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at", length=19)
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_at", length=19)
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }




}

