package com.agi.entity;

import com.agi.dto.PriorityEnum;
import com.agi.dto.StatusEnum;
import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Chamado {

    private String id;
    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @Enumerated(EnumType.STRING)
    private PrioridadeEnum priority;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    private Usuario user;

    private Atribuido assignedTo;

    public Chamado(String id, String title, String description, StatusEnum status,
                   PrioridtyEnum priority, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.createdAt = createdAt;
    }
}