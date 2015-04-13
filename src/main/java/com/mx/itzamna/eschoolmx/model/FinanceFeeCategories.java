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
 * FinanceFeeCategories generated by hbm2java
 */
@Entity
@Table(name="finance_fee_categories"
    ,catalog="villaeducativa"
)
public class FinanceFeeCategories  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String description;
     private Integer batchId;
     private boolean isDeleted;
     private boolean isMaster;
     private Date createdAt;
     private Date updatedAt;

    public FinanceFeeCategories() {
    }

	
    public FinanceFeeCategories(boolean isDeleted, boolean isMaster) {
        this.isDeleted = isDeleted;
        this.isMaster = isMaster;
    }
    public FinanceFeeCategories(String name, String description, Integer batchId, boolean isDeleted, boolean isMaster, Date createdAt, Date updatedAt) {
       this.name = name;
       this.description = description;
       this.batchId = batchId;
       this.isDeleted = isDeleted;
       this.isMaster = isMaster;
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

    
    @Column(name="description", length=65535)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="batch_id")
    public Integer getBatchId() {
        return this.batchId;
    }
    
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    
    @Column(name="is_deleted", nullable=false)
    public boolean isIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    
    @Column(name="is_master", nullable=false)
    public boolean isIsMaster() {
        return this.isMaster;
    }
    
    public void setIsMaster(boolean isMaster) {
        this.isMaster = isMaster;
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


