package com.agi.chamados_service.dto;

import com.agi.chamados_service.entity.Assigned;
import com.agi.chamados_service.entity.Comments;
import com.agi.chamados_service.entity.User;
import com.agi.chamados_service.enumerate.PriorityEnum;
import com.agi.chamados_service.enumerate.StatusEnum;

import java.time.LocalDateTime;
import java.util.List;

public record CreateTicketResponse(
        String id,
        String title,
        String description,
        StatusEnum status,
        PriorityEnum priority,
        LocalDateTime createdAt,
        User user,
        Assigned assignedTo,
        List<Comments> comments
){}
