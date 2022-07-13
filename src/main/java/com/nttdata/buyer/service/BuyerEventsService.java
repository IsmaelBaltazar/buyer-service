package com.nttdata.buyer.service;

import com.nttdata.buyer.event.BuyerCreatedEvent;
import com.nttdata.buyer.event.Event;
import com.nttdata.buyer.event.EventType;
import com.nttdata.buyer.model.document.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class BuyerEventsService {

    @Autowired
    private KafkaTemplate<String, Event<?>> producer;
    private String topicCustomer="BuyerTopic";

    public void publish(Buyer buyer) {
        BuyerCreatedEvent created = new BuyerCreatedEvent();
        created.setData(buyer);
        created.setId(UUID.randomUUID().toString());
        created.setType(EventType.CREATED);
        created.setDate(new Date());
        this.producer.send(topicCustomer, created);
    }
}
