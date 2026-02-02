package com.agi.chamados_service.entity;

import com.agi.chamados_service.enumerate.PriorityEnum;
import com.agi.chamados_service.enumerate.StatusEnum;

import java.time.LocalDateTime;

@Entity
public class Chamado {

    private String id;
    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @Enumerated(EnumType.STRING)
    private PriorityEnum priority;

    private LocalDateTime createdAt;

    private Usuario user;

    private Atribuido assignedTo;

    public Chamado(String id, String title, String description, StatusEnum status,
                   PriorityEnum priority, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.createdAt = createdAt;
    }
}