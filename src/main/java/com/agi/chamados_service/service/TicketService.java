package com.agi.chamados_service.service;

import com.agi.chamados_service.dto.CreateTicketRequest;
import com.agi.chamados_service.dto.CreateTicketResponse;
import com.agi.chamados_service.entity.Ticket;
import com.agi.chamados_service.mapper.TicketMapper;
import com.agi.chamados_service.repository.TicketRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    private final TicketMapper ticketMapper;
    private final TicketRepository ticketRepository;

    public TicketService(TicketMapper ticketMapper, TicketRepository ticketRepository) {
        this.ticketMapper = ticketMapper;
        this.ticketRepository = ticketRepository;
    }

    public CreateTicketResponse createTicket(CreateTicketRequest request){
        Ticket entity = ticketMapper.toEntity(request);

        entity.criaRegistroAgora();
        ticketRepository.save(entity);

        //Lógica para enviar mensagem ao tópico
        return ticketMapper.toResponse(entity);
    }
}
