package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Registration generated by hbm2java
 */
@Entity
@Table(name="registration"
    ,catalog="villaeducativa"
)
public class Registration  implements java.io.Serializable {


     private Integer id;
     private String studentId;
     private String foodPreference;
     private String desc;
     private String status;

    public Registration() {
    }

    public Registration(String studentId, String foodPreference, String desc, String status) {
       this.studentId = studentId;
       this.foodPreference = foodPreference;
       this.desc = desc;
       this.status = status;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="student_id", length=120)
    public String getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    
    @Column(name="food_preference", length=120)
    public String getFoodPreference() {
        return this.foodPreference;
    }
    
    public void setFoodPreference(String foodPreference) {
        this.foodPreference = foodPreference;
    }

    
    @Column(name="desc", length=120)
    public String getDesc() {
        return this.desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }

    
    @Column(name="status", length=120)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}

