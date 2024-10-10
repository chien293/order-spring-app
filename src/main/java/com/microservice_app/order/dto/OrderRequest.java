package com.microservice_app.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class OrderRequest {
    String orderNumber;
    String skuCode;
    BigDecimal price;
    Integer quantiy;
}
