package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EmployeesSubjects generated by hbm2java
 */
@Entity
@Table(name="employees_subjects"
    ,catalog="villaeducativa"
)
public class EmployeesSubjects  implements java.io.Serializable {


     private Integer id;
     private Integer employeeId;
     private Integer subjectId;

    public EmployeesSubjects() {
    }

    public EmployeesSubjects(Integer employeeId, Integer subjectId) {
       this.employeeId = employeeId;
       this.subjectId = subjectId;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="employee_id")
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    
    @Column(name="subject_id")
    public Integer getSubjectId() {
        return this.subjectId;
    }
    
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }




}


