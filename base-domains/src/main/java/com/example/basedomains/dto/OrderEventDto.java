package com.example.basedomains.dto;

import com.example.basedomains.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class OrderEventDto {
    private String message;
    private String status;
    private Order order;
}
