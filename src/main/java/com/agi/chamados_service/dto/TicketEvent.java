package com.agi.chamados_service.dto;

import com.agi.chamados_service.entity.Comments;
import com.agi.chamados_service.entity.User;
import com.agi.chamados_service.enumerate.PriorityEnum;
import com.agi.chamados_service.enumerate.StatusEnum;

import java.time.LocalDateTime;
import java.util.List;

public class TicketEvent {
    private String id;
    private String title;
    private String description;
    private StatusEnum status;
    private PriorityEnum priority;
    private LocalDateTime cratedAt;
    private User user;
    private List<Comments> comments;

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

    public LocalDateTime getCratedAt() {
        return cratedAt;
    }

    public void setCratedAt(LocalDateTime cratedAt) {
        this.cratedAt = cratedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }
}
