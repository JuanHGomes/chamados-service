package com.agi.chamados_service.entity;

import com.agi.chamados_service.enumerate.PriorityEnum;
import com.agi.chamados_service.enumerate.StatusEnum;
import org.hibernate.annotations.Comments;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Chamado {

    private String id;
    private String title;
    private String description;
    private StatusEnum status;
    private PriorityEnum priority;
    private LocalDateTime createdAt;
    private String userName;
    private String userEmail;
    private String assignedToName;
    private List<Comments> comments = new ArrayList<>();

    public Chamado() {
    }

    public Chamado(String id, String title, String description, StatusEnum status,
                   PriorityEnum priority, LocalDateTime createdAt, String userName,
                   String userEmail, String assignedToName) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.createdAt = createdAt;
        this.userName = userName;
        this.userEmail = userEmail;
        this.assignedToName = assignedToName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public PriorityEnum getPriority() {
        return priority;
    }

    public void setPriority(PriorityEnum priority) {
        this.priority = priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getAssignedToName() {
        return assignedToName;
    }

    public void setAssignedToName(String assignedToName) {
        this.assignedToName = assignedToName;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }
}