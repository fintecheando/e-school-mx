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
 * EmployeeAttendances generated by hbm2java
 */
@Entity
@Table(name="employee_attendances"
    ,catalog="villaeducativa"
)
public class EmployeeAttendances  implements java.io.Serializable {


     private Integer id;
     private Date attendanceDate;
     private Integer employeeId;
     private Integer employeeLeaveTypeId;
     private String reason;
     private Boolean isHalfDay;

    public EmployeeAttendances() {
    }

    public EmployeeAttendances(Date attendanceDate, Integer employeeId, Integer employeeLeaveTypeId, String reason, Boolean isHalfDay) {
       this.attendanceDate = attendanceDate;
       this.employeeId = employeeId;
       this.employeeLeaveTypeId = employeeLeaveTypeId;
       this.reason = reason;
       this.isHalfDay = isHalfDay;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="attendance_date", length=10)
    public Date getAttendanceDate() {
        return this.attendanceDate;
    }
    
    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    
    @Column(name="employee_id")
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    
    @Column(name="employee_leave_type_id")
    public Integer getEmployeeLeaveTypeId() {
        return this.employeeLeaveTypeId;
    }
    
    public void setEmployeeLeaveTypeId(Integer employeeLeaveTypeId) {
        this.employeeLeaveTypeId = employeeLeaveTypeId;
    }

    
    @Column(name="reason")
    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }

    
    @Column(name="is_half_day")
    public Boolean getIsHalfDay() {
        return this.isHalfDay;
    }
    
    public void setIsHalfDay(Boolean isHalfDay) {
        this.isHalfDay = isHalfDay;
    }




}

