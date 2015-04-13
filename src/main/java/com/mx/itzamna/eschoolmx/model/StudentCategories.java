package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StudentCategories generated by hbm2java
 */
@Entity
@Table(name="student_categories"
    ,catalog="villaeducativa"
)
public class StudentCategories  implements java.io.Serializable {


     private Integer id;
     private String name;
     private boolean isDeleted;

    public StudentCategories() {
    }

	
    public StudentCategories(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    public StudentCategories(String name, boolean isDeleted) {
       this.name = name;
       this.isDeleted = isDeleted;
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

    
    @Column(name="is_deleted", nullable=false)
    public boolean isIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }




}


