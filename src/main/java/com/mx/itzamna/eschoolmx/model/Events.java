package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Events generated by hbm2java
 */
@Entity
@Table(name="events"
    ,catalog="villaeducativa"
)
public class Events  implements java.io.Serializable {


     private Integer id;
     private int userId;
     private String title;
     private String desc;
     private int type;
     private short allDay;
     private Integer start;
     private Integer end;
     private boolean editable;
     private String placeholder;
     private int code;

    public Events() {
    }

	
    public Events(int userId, String desc, int type, short allDay, boolean editable, int code) {
        this.userId = userId;
        this.desc = desc;
        this.type = type;
        this.allDay = allDay;
        this.editable = editable;
        this.code = code;
    }
    public Events(int userId, String title, String desc, int type, short allDay, Integer start, Integer end, boolean editable, String placeholder, int code) {
       this.userId = userId;
       this.title = title;
       this.desc = desc;
       this.type = type;
       this.allDay = allDay;
       this.start = start;
       this.end = end;
       this.editable = editable;
       this.placeholder = placeholder;
       this.code = code;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    
    @Column(name="title", length=1000)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="desc", nullable=false, length=65535)
    public String getDesc() {
        return this.desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }

    
    @Column(name="type", nullable=false)
    public int getType() {
        return this.type;
    }
    
    public void setType(int type) {
        this.type = type;
    }

    
    @Column(name="allDay", nullable=false)
    public short getAllDay() {
        return this.allDay;
    }
    
    public void setAllDay(short allDay) {
        this.allDay = allDay;
    }

    
    @Column(name="start")
    public Integer getStart() {
        return this.start;
    }
    
    public void setStart(Integer start) {
        this.start = start;
    }

    
    @Column(name="end")
    public Integer getEnd() {
        return this.end;
    }
    
    public void setEnd(Integer end) {
        this.end = end;
    }

    
    @Column(name="editable", nullable=false)
    public boolean isEditable() {
        return this.editable;
    }
    
    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    
    @Column(name="placeholder", length=120)
    public String getPlaceholder() {
        return this.placeholder;
    }
    
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    
    @Column(name="code", nullable=false)
    public int getCode() {
        return this.code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }




}

