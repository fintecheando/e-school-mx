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
 * FileUploads generated by hbm2java
 */
@Entity
@Table(name="file_uploads"
    ,catalog="villaeducativa"
)
public class FileUploads  implements java.io.Serializable {


     private Integer id;
     private String title;
     private int category;
     private String placeholder;
     private Integer course;
     private Integer batch;
     private String file;
     private String fileType;
     private int createdBy;
     private Date createdAt;

    public FileUploads() {
    }

	
    public FileUploads(String title, int category, String file, String fileType, int createdBy, Date createdAt) {
        this.title = title;
        this.category = category;
        this.file = file;
        this.fileType = fileType;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
    }
    public FileUploads(String title, int category, String placeholder, Integer course, Integer batch, String file, String fileType, int createdBy, Date createdAt) {
       this.title = title;
       this.category = category;
       this.placeholder = placeholder;
       this.course = course;
       this.batch = batch;
       this.file = file;
       this.fileType = fileType;
       this.createdBy = createdBy;
       this.createdAt = createdAt;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="title", nullable=false, length=100)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="category", nullable=false)
    public int getCategory() {
        return this.category;
    }
    
    public void setCategory(int category) {
        this.category = category;
    }

    
    @Column(name="placeholder", length=50)
    public String getPlaceholder() {
        return this.placeholder;
    }
    
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    
    @Column(name="course")
    public Integer getCourse() {
        return this.course;
    }
    
    public void setCourse(Integer course) {
        this.course = course;
    }

    
    @Column(name="batch")
    public Integer getBatch() {
        return this.batch;
    }
    
    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    
    @Column(name="file", nullable=false, length=200)
    public String getFile() {
        return this.file;
    }
    
    public void setFile(String file) {
        this.file = file;
    }

    
    @Column(name="file_type", nullable=false, length=50)
    public String getFileType() {
        return this.fileType;
    }
    
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    
    @Column(name="created_by", nullable=false)
    public int getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at", nullable=false, length=19)
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }




}


