package com.agi.chamados_service.service;

import com.agi.chamados_service.dto.CreateTicketRequest;
import com.agi.chamados_service.dto.CreateTicketResponse;
import com.agi.chamados_service.entity.Ticket;
import com.agi.chamados_service.mapper.TicketMapper;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    private final TicketMapper ticketMapper;

    public TicketService(TicketMapper ticketMapper) {
        this.ticketMapper = ticketMapper;
    }

    public CreateTicketResponse createTicket(CreateTicketRequest request){
        Ticket entity = ticketMapper.toEntity(request);
        //Lógica para persistir no bd
        //Lógica para enviar mensagem ao tópico
        return ticketMapper.toResponse(entity);
    }
}
