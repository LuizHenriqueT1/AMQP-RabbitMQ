package com.example.springamqp.components;

import com.example.springamqp.dtos.OrderDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedListener {

    @RabbitListener(queues = "orders.v1.order-created-generate-cashback")
    public  void onOrderCreated(OrderDTO orderDTO) {
        System.out.println("Id recebido " + orderDTO.getId());
        System.out.println("Valor recebido" + orderDTO.getValue());
    }
}
