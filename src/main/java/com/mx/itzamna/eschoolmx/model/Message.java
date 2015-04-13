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
 * Message generated by hbm2java
 */
@Entity
@Table(name="message"
    ,catalog="villaeducativa"
)
public class Message  implements java.io.Serializable {


     private Integer msgId;
     private String subject;
     private String msgContent;
     private String msgUploads;
     private int userId;
     private Date msgTime;
     private Date msgDate;
     private int isRead;
     private int senderId;
     private int isDeleted;
     private Integer isTask;

    public Message() {
    }

	
    public Message(String subject, String msgContent, String msgUploads, int userId, Date msgTime, Date msgDate, int isRead, int senderId, int isDeleted) {
        this.subject = subject;
        this.msgContent = msgContent;
        this.msgUploads = msgUploads;
        this.userId = userId;
        this.msgTime = msgTime;
        this.msgDate = msgDate;
        this.isRead = isRead;
        this.senderId = senderId;
        this.isDeleted = isDeleted;
    }
    public Message(String subject, String msgContent, String msgUploads, int userId, Date msgTime, Date msgDate, int isRead, int senderId, int isDeleted, Integer isTask) {
       this.subject = subject;
       this.msgContent = msgContent;
       this.msgUploads = msgUploads;
       this.userId = userId;
       this.msgTime = msgTime;
       this.msgDate = msgDate;
       this.isRead = isRead;
       this.senderId = senderId;
       this.isDeleted = isDeleted;
       this.isTask = isTask;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="msg_id", unique=true, nullable=false)
    public Integer getMsgId() {
        return this.msgId;
    }
    
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    
    @Column(name="subject", nullable=false, length=120)
    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    
    @Column(name="msg_content", nullable=false, length=65535)
    public String getMsgContent() {
        return this.msgContent;
    }
    
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    
    @Column(name="msg_uploads", nullable=false, length=120)
    public String getMsgUploads() {
        return this.msgUploads;
    }
    
    public void setMsgUploads(String msgUploads) {
        this.msgUploads = msgUploads;
    }

    
    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Temporal(TemporalType.TIME)
    @Column(name="msg_time", nullable=false, length=8)
    public Date getMsgTime() {
        return this.msgTime;
    }
    
    public void setMsgTime(Date msgTime) {
        this.msgTime = msgTime;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="msg_date", nullable=false, length=10)
    public Date getMsgDate() {
        return this.msgDate;
    }
    
    public void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }

    
    @Column(name="is_read", nullable=false)
    public int getIsRead() {
        return this.isRead;
    }
    
    public void setIsRead(int isRead) {
        this.isRead = isRead;
    }

    
    @Column(name="sender_id", nullable=false)
    public int getSenderId() {
        return this.senderId;
    }
    
    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    
    @Column(name="is_deleted", nullable=false)
    public int getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    
    @Column(name="is_task")
    public Integer getIsTask() {
        return this.isTask;
    }
    
    public void setIsTask(Integer isTask) {
        this.isTask = isTask;
    }




}

