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
 * MonthlyPayslips generated by hbm2java
 */
@Entity
@Table(name="monthly_payslips"
    ,catalog="villaeducativa"
)
public class MonthlyPayslips  implements java.io.Serializable {


     private Integer id;
     private Date salaryDate;
     private Integer employeeId;
     private Integer payrollCategoryId;
     private String amount;
     private boolean isApproved;
     private Integer approverId;
     private boolean isRejected;
     private Integer rejectorId;
     private String reason;

    public MonthlyPayslips() {
    }

	
    public MonthlyPayslips(boolean isApproved, boolean isRejected) {
        this.isApproved = isApproved;
        this.isRejected = isRejected;
    }
    public MonthlyPayslips(Date salaryDate, Integer employeeId, Integer payrollCategoryId, String amount, boolean isApproved, Integer approverId, boolean isRejected, Integer rejectorId, String reason) {
       this.salaryDate = salaryDate;
       this.employeeId = employeeId;
       this.payrollCategoryId = payrollCategoryId;
       this.amount = amount;
       this.isApproved = isApproved;
       this.approverId = approverId;
       this.isRejected = isRejected;
       this.rejectorId = rejectorId;
       this.reason = reason;
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
    @Column(name="salary_date", length=10)
    public Date getSalaryDate() {
        return this.salaryDate;
    }
    
    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    
    @Column(name="employee_id")
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    
    @Column(name="payroll_category_id")
    public Integer getPayrollCategoryId() {
        return this.payrollCategoryId;
    }
    
    public void setPayrollCategoryId(Integer payrollCategoryId) {
        this.payrollCategoryId = payrollCategoryId;
    }

    
    @Column(name="amount")
    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }

    
    @Column(name="is_approved", nullable=false)
    public boolean isIsApproved() {
        return this.isApproved;
    }
    
    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    
    @Column(name="approver_id")
    public Integer getApproverId() {
        return this.approverId;
    }
    
    public void setApproverId(Integer approverId) {
        this.approverId = approverId;
    }

    
    @Column(name="is_rejected", nullable=false)
    public boolean isIsRejected() {
        return this.isRejected;
    }
    
    public void setIsRejected(boolean isRejected) {
        this.isRejected = isRejected;
    }

    
    @Column(name="rejector_id")
    public Integer getRejectorId() {
        return this.rejectorId;
    }
    
    public void setRejectorId(Integer rejectorId) {
        this.rejectorId = rejectorId;
    }

    
    @Column(name="reason")
    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }




}

