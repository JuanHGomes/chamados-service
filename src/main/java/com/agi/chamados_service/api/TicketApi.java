package com.agi.chamados_service.api;

import com.agi.chamados_service.dto.CreateTicketRequest;
import com.agi.chamados_service.dto.CreateTicketResponse;
import com.agi.chamados_service.mapper.TicketMapper;
import com.agi.chamados_service.service.TicketService;
import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tickets")
@RestController
public class TicketApi {

    private final TicketService ticketService;
    private static final Logger logger = LoggerFactory.getLogger(TicketApi.class);

    public TicketApi(TicketService ticketService, TicketMapper ticketMapper) {
        this.ticketService = ticketService;
    }

    @PostMapping
    @Operation(
            summary = "Criar um novo chamado",
            description = "Cria um novo chamado com as informações fornecidas no corpo da requisição."
    )
    public ResponseEntity<CreateTicketResponse> createTicket(@RequestBody CreateTicketRequest request){
        try{
            CreateTicketResponse savedTicket = ticketService.createTicket(request);
            logger.info("Iniciando chamado: id: {} - {}", request.id(), request);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedTicket);
        }catch(Exception ex){
            logger.error("Exceção lançada: {}", ex.getMessage());
            throw ex;
        }
    }
}
