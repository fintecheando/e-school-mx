package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ClassTimings generated by hbm2java
 */
@Entity
@Table(name="class_timings"
    ,catalog="villaeducativa"
)
public class ClassTimings  implements java.io.Serializable {


     private Integer id;
     private Integer batchId;
     private String name;
     private String startTime;
     private String endTime;
     private Boolean isBreak;

    public ClassTimings() {
    }

    public ClassTimings(Integer batchId, String name, String startTime, String endTime, Boolean isBreak) {
       this.batchId = batchId;
       this.name = name;
       this.startTime = startTime;
       this.endTime = endTime;
       this.isBreak = isBreak;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="batch_id")
    public Integer getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    
    @Column(name="name")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="start_time", length=120)
    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    
    @Column(name="end_time", length=120)
    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    
    @Column(name="is_break")
    public Boolean getIsBreak() {
        return this.isBreak;
    }
    
    public void setIsBreak(Boolean isBreak) {
        this.isBreak = isBreak;
    }




}


