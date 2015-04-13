package com.mx.itzamna.eschoolmx.model;
// Generated 12/04/2015 11:30:10 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Author generated by hbm2java
 */
@Entity
@Table(name="author"
    ,catalog="villaeducativa"
)
public class Author  implements java.io.Serializable {


     private Integer authId;
     private String authorName;
     private String desc;

    public Author() {
    }

    public Author(String authorName, String desc) {
       this.authorName = authorName;
       this.desc = desc;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="auth_id", unique=true, nullable=false)
    public Integer getAuthId() {
        return this.authId;
    }
    
    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    
    @Column(name="author_name", length=120)
    public String getAuthorName() {
        return this.authorName;
    }
    
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    
    @Column(name="desc", length=120)
    public String getDesc() {
        return this.desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }




}


