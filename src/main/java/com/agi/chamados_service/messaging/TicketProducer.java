package com.agi.chamados_service.messaging;

import com.agi.chamados_service.dto.TicketEvent;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class TicketProducer {
    private final StreamBridge streamBridge;

    public TicketProducer(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public void publish(TicketEvent event){
        streamBridge.send("order-out-0", event);
    }
}

