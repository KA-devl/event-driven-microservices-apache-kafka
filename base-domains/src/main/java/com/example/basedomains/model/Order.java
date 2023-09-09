package com.example.basedomains.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Order {
    private String id;
    private String name;
    private String price;
    private String quantity;
}
