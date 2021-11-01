/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author JohnnyMC
 */
public class BlogCommentDTO implements Serializable {
    private int commentID;
    private int blogID;
    private Date dateTime;
    private String content;
    private int ownerID;

    public BlogCommentDTO() {
    }

    public BlogCommentDTO(int commentID, int blogID, Date dateTime, String content, int ownerID) {
        this.commentID = commentID;
        this.blogID = blogID;
        this.dateTime = dateTime;
        this.content = content;
        this.ownerID = ownerID;
    }

    public BlogCommentDTO(int blogID, Date dateTime, String content, int ownerID) {
        this.blogID = blogID;
        this.dateTime = dateTime;
        this.content = content;
        this.ownerID = ownerID;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public int getBlogID() {
        return blogID;
    }

    public void setBlogID(int blogID) {
        this.blogID = blogID;
    }

    public Date getDate() {
        return dateTime;
    }

    public void setDate(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }
    
    
}
