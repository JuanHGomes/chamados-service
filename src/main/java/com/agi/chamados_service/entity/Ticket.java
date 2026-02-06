package com.agi.chamados_service.entity;

import com.agi.chamados_service.enumerate.PriorityEnum;
import com.agi.chamados_service.enumerate.StatusEnum;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "CHAMADO")
public class Ticket {

    private String id;
    private String title;
    private String description;
    private StatusEnum status;
    private PriorityEnum priority;
    private LocalDateTime createdAt;
    private User user;
    private Assigned assignedTo;
    private List<Comments> comments = new ArrayList<>();

    public Ticket() {
    }

    public Ticket(String id, String title, String description, StatusEnum status,
                  PriorityEnum priority, LocalDateTime createdAt, User user,
                  Assigned assignedTo) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.createdAt = createdAt;
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

    public void criaRegistroAgora() {
        this.createdAt = LocalDateTime.now();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Assigned getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Assigned assigned) {
        this.assignedTo = assigned;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }
}