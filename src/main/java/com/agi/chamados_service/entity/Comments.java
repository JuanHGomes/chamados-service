package com.agi.chamados_service.entity;

import java.time.LocalDateTime;

public class Comments {

    private String author;
    private String message;
    private LocalDateTime createdAt;

    public Comments() {
    }

    public Comments(String author, String message, LocalDateTime createdAt) {
        this.author = author;
        this.message = message;
        this.createdAt = createdAt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}