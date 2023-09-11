package com.example.stockservice.consumer;

import com.example.basedomains.dto.OrderEventDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "stock-group")
    public void listen(OrderEventDto orderEventDto) {

        LOGGER.info("Consuming order event {}", orderEventDto);
    }

}
