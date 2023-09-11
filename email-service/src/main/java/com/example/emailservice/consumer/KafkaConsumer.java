package com.example.emailservice.consumer;

import com.example.basedomains.dto.OrderEventDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "${order_topic}", groupId = "email_group")
    public void consume (OrderEventDto orderEventDto) {
        LOGGER.info("Consuming order event {}", orderEventDto);

    }

}
