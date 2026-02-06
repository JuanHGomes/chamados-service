package com.agi.chamados_service.service;

import com.agi.chamados_service.dto.CreateTicketRequest;
import com.agi.chamados_service.dto.CreateTicketResponse;
import com.agi.chamados_service.dto.TicketEvent;
import com.agi.chamados_service.entity.Ticket;
import com.agi.chamados_service.mapper.TicketMapper;
import com.agi.chamados_service.messaging.TicketProducer;
import com.agi.chamados_service.repository.TicketRepository;
import org.apache.qpid.proton.amqp.transport.End;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    private final TicketMapper ticketMapper;
    private final TicketRepository ticketRepository;
    private final TicketProducer producer;

    public TicketService(TicketMapper ticketMapper, TicketRepository ticketRepository, TicketProducer producer) {
        this.ticketMapper = ticketMapper;
        this.ticketRepository = ticketRepository;
        this.producer = producer;
    }

    public CreateTicketResponse createTicket(CreateTicketRequest request){
        Ticket entity = ticketMapper.toEntity(request);
        TicketEvent event = ticketMapper.toEvent(entity);

        entity.criaRegistroAgora();
        ticketRepository.save(entity);

        producer.publish(event);
        return ticketMapper.toResponse(entity);
    }
}
