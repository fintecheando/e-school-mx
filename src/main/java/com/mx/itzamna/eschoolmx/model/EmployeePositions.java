package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EmployeePositions generated by hbm2java
 */
@Entity
@Table(name="employee_positions"
    ,catalog="villaeducativa"
)
public class EmployeePositions  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Integer employeeCategoryId;
     private Boolean status;

    public EmployeePositions() {
    }

    public EmployeePositions(String name, Integer employeeCategoryId, Boolean status) {
       this.name = name;
       this.employeeCategoryId = employeeCategoryId;
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

    
    @Column(name="name")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="employee_category_id")
    public Integer getEmployeeCategoryId() {
        return this.employeeCategoryId;
    }
    
    public void setEmployeeCategoryId(Integer employeeCategoryId) {
        this.employeeCategoryId = employeeCategoryId;
    }

    
    @Column(name="status")
    public Boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(Boolean status) {
        this.status = status;
    }




}


