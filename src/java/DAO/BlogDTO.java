/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Maru
 */
public class BlogDTO implements Serializable {

    private int blogID;
    private String title;
    private String content;
    private Date postDate;
    private String categoryID;
    private String status;
    private int mentorID;
    private Date approvedDate;
    private String tags;
    private int studentID;
    private byte[] attachment;

    public BlogDTO(int blogID, String title, String content, Date postDate, String categoryID, String status, int mentorID, Date approvedDate, String tags, int studentID, byte[] attachment) {
        this.blogID = blogID;
        this.title = title;
        this.content = content;
        this.postDate = postDate;
        this.categoryID = categoryID;
        this.status = status;
        this.mentorID = mentorID;
        this.approvedDate = approvedDate;
        this.tags = tags;
        this.studentID = studentID;
        this.attachment = attachment;
    }

    public BlogDTO(String title, String content, Date postDate, String categoryID, String status, int mentorID, Date approvedDate, String tags, int studentID, byte[] attachment) {
        this.title = title;
        this.content = content;
        this.postDate = postDate;
        this.categoryID = categoryID;
        this.status = status;
        this.mentorID = mentorID;
        this.approvedDate = approvedDate;
        this.tags = tags;
        this.studentID = studentID;
        this.attachment = attachment;
    }

    public BlogDTO(String title, String content, Date postDate, String categoryID, String status, String tags, int studentID, byte[] attachment) {
        this.title = title;
        this.content = content;
        this.postDate = postDate;
        this.categoryID = categoryID;
        this.status = status;
        this.tags = tags;
        this.studentID = studentID;
        this.attachment = attachment;
    }

    public BlogDTO(String title, String content, Date postDate, String categoryID, String tags, int studentID, byte[] attachment) {
        this.title = title;
        this.content = content;
        this.postDate = postDate;
        this.categoryID = categoryID;
        status = "PENDING";
        this.tags = tags;
        this.studentID = studentID;
        this.attachment = attachment;
    }



    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public int getBlogID() {
        return blogID;
    }

    public void setBlogID(int blogID) {
        this.blogID = blogID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMentorID() {
        return mentorID;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date date) {
        this.approvedDate = date;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public byte[] getAttachment() {
        return attachment;
    }

    public void setAttachment(byte[] attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "BlogDTO{" + "blogID=" + blogID + ", title=" + title + ", content=" + content + ", postDate=" + postDate + ", categoryID=" + categoryID + ", status=" + status + ", mentorID=" + mentorID + ", approvedDate=" + approvedDate + ", tags=" + tags + ", studentID=" + studentID + ", attachment=" + attachment + '}';
    }
    
    
}
