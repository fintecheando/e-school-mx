package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Floor generated by hbm2java
 */
@Entity
@Table(name="floor"
    ,catalog="villaeducativa"
)
public class Floor  implements java.io.Serializable {


     private Integer id;
     private String hostelId;
     private String floorNo;
     private String noOfRooms;
     private String created;

    public Floor() {
    }

    public Floor(String hostelId, String floorNo, String noOfRooms, String created) {
       this.hostelId = hostelId;
       this.floorNo = floorNo;
       this.noOfRooms = noOfRooms;
       this.created = created;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="hostel_id", length=120)
    public String getHostelId() {
        return this.hostelId;
    }
    
    public void setHostelId(String hostelId) {
        this.hostelId = hostelId;
    }

    
    @Column(name="floor_no", length=120)
    public String getFloorNo() {
        return this.floorNo;
    }
    
    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    
    @Column(name="no_of_rooms", length=120)
    public String getNoOfRooms() {
        return this.noOfRooms;
    }
    
    public void setNoOfRooms(String noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    
    @Column(name="created", length=120)
    public String getCreated() {
        return this.created;
    }
    
    public void setCreated(String created) {
        this.created = created;
    }




}


