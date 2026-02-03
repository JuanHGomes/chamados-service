package com.agi.chamados_service.dto;

import com.agi.chamados_service.entity.Comments;
import com.agi.chamados_service.entity.User;
import com.agi.chamados_service.enumerate.StatusEnum;

import java.time.LocalDateTime;

public class TicketEvent {
    private String id;
    private String title;
    private String description;
    private StatusEnum status;
    private StatusEnum priority;
    private LocalDateTime cratedAt;
    private User user;
    private Comments comments;

}
