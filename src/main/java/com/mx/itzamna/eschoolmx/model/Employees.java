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
 * Employees generated by hbm2java
 */
@Entity
@Table(name="employees"
    ,catalog="villaeducativa"
)
public class Employees  implements java.io.Serializable {


     private Integer id;
     private int uid;
     private Integer employeeCategoryId;
     private String employeeNumber;
     private Date joiningDate;
     private String firstName;
     private String middleName;
     private String lastName;
     private String gender;
     private String jobTitle;
     private Integer employeePositionId;
     private Integer employeeDepartmentId;
     private Integer reportingManagerId;
     private Integer employeeGradeId;
     private String qualification;
     private String experienceDetail;
     private Integer experienceYear;
     private Integer experienceMonth;
     private Boolean status;
     private String statusDescription;
     private Date dateOfBirth;
     private String maritalStatus;
     private Integer childrenCount;
     private String fatherName;
     private String motherName;
     private String husbandName;
     private String bloodGroup;
     private Integer nationalityId;
     private String homeAddressLine1;
     private String homeAddressLine2;
     private String homeCity;
     private String homeState;
     private Integer homeCountryId;
     private String homePinCode;
     private String officeAddressLine1;
     private String officeAddressLine2;
     private String officeCity;
     private String officeState;
     private Integer officeCountryId;
     private String officePinCode;
     private String officePhone1;
     private String officePhone2;
     private String mobilePhone;
     private String homePhone;
     private String email;
     private String fax;
     private String photoFileName;
     private String photoContentType;
     private byte[] photoData;
     private Date createdAt;
     private Date updatedAt;
     private Integer photoFileSize;
     private Integer userId;
     private Byte isDeleted;

    public Employees() {
    }

	
    public Employees(int uid) {
        this.uid = uid;
    }
    public Employees(int uid, Integer employeeCategoryId, String employeeNumber, Date joiningDate, String firstName, String middleName, String lastName, String gender, String jobTitle, Integer employeePositionId, Integer employeeDepartmentId, Integer reportingManagerId, Integer employeeGradeId, String qualification, String experienceDetail, Integer experienceYear, Integer experienceMonth, Boolean status, String statusDescription, Date dateOfBirth, String maritalStatus, Integer childrenCount, String fatherName, String motherName, String husbandName, String bloodGroup, Integer nationalityId, String homeAddressLine1, String homeAddressLine2, String homeCity, String homeState, Integer homeCountryId, String homePinCode, String officeAddressLine1, String officeAddressLine2, String officeCity, String officeState, Integer officeCountryId, String officePinCode, String officePhone1, String officePhone2, String mobilePhone, String homePhone, String email, String fax, String photoFileName, String photoContentType, byte[] photoData, Date createdAt, Date updatedAt, Integer photoFileSize, Integer userId, Byte isDeleted) {
       this.uid = uid;
       this.employeeCategoryId = employeeCategoryId;
       this.employeeNumber = employeeNumber;
       this.joiningDate = joiningDate;
       this.firstName = firstName;
       this.middleName = middleName;
       this.lastName = lastName;
       this.gender = gender;
       this.jobTitle = jobTitle;
       this.employeePositionId = employeePositionId;
       this.employeeDepartmentId = employeeDepartmentId;
       this.reportingManagerId = reportingManagerId;
       this.employeeGradeId = employeeGradeId;
       this.qualification = qualification;
       this.experienceDetail = experienceDetail;
       this.experienceYear = experienceYear;
       this.experienceMonth = experienceMonth;
       this.status = status;
       this.statusDescription = statusDescription;
       this.dateOfBirth = dateOfBirth;
       this.maritalStatus = maritalStatus;
       this.childrenCount = childrenCount;
       this.fatherName = fatherName;
       this.motherName = motherName;
       this.husbandName = husbandName;
       this.bloodGroup = bloodGroup;
       this.nationalityId = nationalityId;
       this.homeAddressLine1 = homeAddressLine1;
       this.homeAddressLine2 = homeAddressLine2;
       this.homeCity = homeCity;
       this.homeState = homeState;
       this.homeCountryId = homeCountryId;
       this.homePinCode = homePinCode;
       this.officeAddressLine1 = officeAddressLine1;
       this.officeAddressLine2 = officeAddressLine2;
       this.officeCity = officeCity;
       this.officeState = officeState;
       this.officeCountryId = officeCountryId;
       this.officePinCode = officePinCode;
       this.officePhone1 = officePhone1;
       this.officePhone2 = officePhone2;
       this.mobilePhone = mobilePhone;
       this.homePhone = homePhone;
       this.email = email;
       this.fax = fax;
       this.photoFileName = photoFileName;
       this.photoContentType = photoContentType;
       this.photoData = photoData;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
       this.photoFileSize = photoFileSize;
       this.userId = userId;
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

    
    @Column(name="uid", nullable=false)
    public int getUid() {
        return this.uid;
    }
    
    public void setUid(int uid) {
        this.uid = uid;
    }

    
    @Column(name="employee_category_id")
    public Integer getEmployeeCategoryId() {
        return this.employeeCategoryId;
    }
    
    public void setEmployeeCategoryId(Integer employeeCategoryId) {
        this.employeeCategoryId = employeeCategoryId;
    }

    
    @Column(name="employee_number")
    public String getEmployeeNumber() {
        return this.employeeNumber;
    }
    
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="joining_date", length=10)
    public Date getJoiningDate() {
        return this.joiningDate;
    }
    
    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    
    @Column(name="first_name")
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="middle_name")
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    
    @Column(name="last_name")
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="gender", length=10)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    @Column(name="job_title")
    public String getJobTitle() {
        return this.jobTitle;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    
    @Column(name="employee_position_id")
    public Integer getEmployeePositionId() {
        return this.employeePositionId;
    }
    
    public void setEmployeePositionId(Integer employeePositionId) {
        this.employeePositionId = employeePositionId;
    }

    
    @Column(name="employee_department_id")
    public Integer getEmployeeDepartmentId() {
        return this.employeeDepartmentId;
    }
    
    public void setEmployeeDepartmentId(Integer employeeDepartmentId) {
        this.employeeDepartmentId = employeeDepartmentId;
    }

    
    @Column(name="reporting_manager_id")
    public Integer getReportingManagerId() {
        return this.reportingManagerId;
    }
    
    public void setReportingManagerId(Integer reportingManagerId) {
        this.reportingManagerId = reportingManagerId;
    }

    
    @Column(name="employee_grade_id")
    public Integer getEmployeeGradeId() {
        return this.employeeGradeId;
    }
    
    public void setEmployeeGradeId(Integer employeeGradeId) {
        this.employeeGradeId = employeeGradeId;
    }

    
    @Column(name="qualification")
    public String getQualification() {
        return this.qualification;
    }
    
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    
    @Column(name="experience_detail", length=65535)
    public String getExperienceDetail() {
        return this.experienceDetail;
    }
    
    public void setExperienceDetail(String experienceDetail) {
        this.experienceDetail = experienceDetail;
    }

    
    @Column(name="experience_year")
    public Integer getExperienceYear() {
        return this.experienceYear;
    }
    
    public void setExperienceYear(Integer experienceYear) {
        this.experienceYear = experienceYear;
    }

    
    @Column(name="experience_month")
    public Integer getExperienceMonth() {
        return this.experienceMonth;
    }
    
    public void setExperienceMonth(Integer experienceMonth) {
        this.experienceMonth = experienceMonth;
    }

    
    @Column(name="status")
    public Boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(Boolean status) {
        this.status = status;
    }

    
    @Column(name="status_description")
    public String getStatusDescription() {
        return this.statusDescription;
    }
    
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_of_birth", length=10)
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
    @Column(name="marital_status")
    public String getMaritalStatus() {
        return this.maritalStatus;
    }
    
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    
    @Column(name="children_count")
    public Integer getChildrenCount() {
        return this.childrenCount;
    }
    
    public void setChildrenCount(Integer childrenCount) {
        this.childrenCount = childrenCount;
    }

    
    @Column(name="father_name")
    public String getFatherName() {
        return this.fatherName;
    }
    
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    
    @Column(name="mother_name")
    public String getMotherName() {
        return this.motherName;
    }
    
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    
    @Column(name="husband_name")
    public String getHusbandName() {
        return this.husbandName;
    }
    
    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }

    
    @Column(name="blood_group")
    public String getBloodGroup() {
        return this.bloodGroup;
    }
    
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    
    @Column(name="nationality_id")
    public Integer getNationalityId() {
        return this.nationalityId;
    }
    
    public void setNationalityId(Integer nationalityId) {
        this.nationalityId = nationalityId;
    }

    
    @Column(name="home_address_line1")
    public String getHomeAddressLine1() {
        return this.homeAddressLine1;
    }
    
    public void setHomeAddressLine1(String homeAddressLine1) {
        this.homeAddressLine1 = homeAddressLine1;
    }

    
    @Column(name="home_address_line2")
    public String getHomeAddressLine2() {
        return this.homeAddressLine2;
    }
    
    public void setHomeAddressLine2(String homeAddressLine2) {
        this.homeAddressLine2 = homeAddressLine2;
    }

    
    @Column(name="home_city")
    public String getHomeCity() {
        return this.homeCity;
    }
    
    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    
    @Column(name="home_state")
    public String getHomeState() {
        return this.homeState;
    }
    
    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    
    @Column(name="home_country_id")
    public Integer getHomeCountryId() {
        return this.homeCountryId;
    }
    
    public void setHomeCountryId(Integer homeCountryId) {
        this.homeCountryId = homeCountryId;
    }

    
    @Column(name="home_pin_code")
    public String getHomePinCode() {
        return this.homePinCode;
    }
    
    public void setHomePinCode(String homePinCode) {
        this.homePinCode = homePinCode;
    }

    
    @Column(name="office_address_line1")
    public String getOfficeAddressLine1() {
        return this.officeAddressLine1;
    }
    
    public void setOfficeAddressLine1(String officeAddressLine1) {
        this.officeAddressLine1 = officeAddressLine1;
    }

    
    @Column(name="office_address_line2")
    public String getOfficeAddressLine2() {
        return this.officeAddressLine2;
    }
    
    public void setOfficeAddressLine2(String officeAddressLine2) {
        this.officeAddressLine2 = officeAddressLine2;
    }

    
    @Column(name="office_city")
    public String getOfficeCity() {
        return this.officeCity;
    }
    
    public void setOfficeCity(String officeCity) {
        this.officeCity = officeCity;
    }

    
    @Column(name="office_state")
    public String getOfficeState() {
        return this.officeState;
    }
    
    public void setOfficeState(String officeState) {
        this.officeState = officeState;
    }

    
    @Column(name="office_country_id")
    public Integer getOfficeCountryId() {
        return this.officeCountryId;
    }
    
    public void setOfficeCountryId(Integer officeCountryId) {
        this.officeCountryId = officeCountryId;
    }

    
    @Column(name="office_pin_code")
    public String getOfficePinCode() {
        return this.officePinCode;
    }
    
    public void setOfficePinCode(String officePinCode) {
        this.officePinCode = officePinCode;
    }

    
    @Column(name="office_phone1")
    public String getOfficePhone1() {
        return this.officePhone1;
    }
    
    public void setOfficePhone1(String officePhone1) {
        this.officePhone1 = officePhone1;
    }

    
    @Column(name="office_phone2")
    public String getOfficePhone2() {
        return this.officePhone2;
    }
    
    public void setOfficePhone2(String officePhone2) {
        this.officePhone2 = officePhone2;
    }

    
    @Column(name="mobile_phone")
    public String getMobilePhone() {
        return this.mobilePhone;
    }
    
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    
    @Column(name="home_phone")
    public String getHomePhone() {
        return this.homePhone;
    }
    
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    
    @Column(name="email")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="fax")
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    
    @Column(name="photo_file_name")
    public String getPhotoFileName() {
        return this.photoFileName;
    }
    
    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    
    @Column(name="photo_content_type")
    public String getPhotoContentType() {
        return this.photoContentType;
    }
    
    public void setPhotoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
    }

    
    @Column(name="photo_data")
    public byte[] getPhotoData() {
        return this.photoData;
    }
    
    public void setPhotoData(byte[] photoData) {
        this.photoData = photoData;
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

    
    @Column(name="photo_file_size")
    public Integer getPhotoFileSize() {
        return this.photoFileSize;
    }
    
    public void setPhotoFileSize(Integer photoFileSize) {
        this.photoFileSize = photoFileSize;
    }

    
    @Column(name="user_id")
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    @Column(name="is_deleted")
    public Byte getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }




}

