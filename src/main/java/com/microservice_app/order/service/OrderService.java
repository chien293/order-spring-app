package com.microservice_app.order.service;

import com.microservice_app.order.dto.OrderRequest;
import com.microservice_app.order.model.Order;
import com.microservice_app.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
        Order order = Order.builder()
                .orderNumber(orderRequest.getOrderNumber())
                .skuCode(orderRequest.getSkuCode())
                .price(orderRequest.getPrice())
                .quantity(orderRequest.getQuantiy())
                .build();

        orderRepository.save(order);

    }
}
