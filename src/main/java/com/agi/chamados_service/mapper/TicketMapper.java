package com.agi.chamados_service.mapper;

import com.agi.chamados_service.dto.CreateTicketRequest;
import com.agi.chamados_service.dto.CreateTicketResponse;
import com.agi.chamados_service.dto.TicketEvent;
import com.agi.chamados_service.entity.Assigned;
import com.agi.chamados_service.entity.Ticket;
import com.agi.chamados_service.entity.User;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TicketMapper {

    public CreateTicketResponse toResponse(Ticket ticket){
        return new CreateTicketResponse(
                ticket.getId(),
                ticket.getTitle(),
                ticket.getDescription(),
                ticket.getStatus(),
                ticket.getPriority(),
                ticket.getCreatedAt(),
                new User(
                        ticket.getUser().getName(),
                        ticket.getUser().getEmail()
                ),
                new Assigned(
                        ticket.getAssignedTo().getName()
                ),
                ticket.getComments()
        );
    }

    public Ticket toEntity(CreateTicketRequest request){
        Ticket ticket = new Ticket();

        ticket.setId(request.id());
        ticket.setTitle(request.title());
        ticket.setDescription(request.description());
        ticket.setStatus(request.status());
        ticket.setPriority(request.priority());
        ticket.setUser(request.user());
        ticket.setAssignedTo(request.assignedTo());
        ticket.setComments(request.comments());

        return ticket;
    }

    public TicketEvent toEvent(Ticket ticket){
        TicketEvent event = new TicketEvent();

        event.setId(ticket.getId());
        event.setCratedAt(ticket.getCreatedAt());
        event.setUser(ticket.getUser());
        event.setStatus(ticket.getStatus());
        event.setTitle(ticket.getTitle());
        event.setComments(ticket.getComments());
        event.setDescription(ticket.getDescription());
        event.setPriority(ticket.getPriority());

        return event;
    }
}
