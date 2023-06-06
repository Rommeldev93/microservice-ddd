package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.event.OrderCreatedEvent;
import com.food.ordering.system.order.service.domain.ports.output.messa.publish.payment.OrderCredPayRequMessPubli;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Component
public class OrderCreatedEventApplicationListener {
    private final OrderCredPayRequMessPubli orderCredPayRequMessPubli;

    public OrderCreatedEventApplicationListener(OrderCredPayRequMessPubli orderCredPayRequMessPubli) {
        this.orderCredPayRequMessPubli = orderCredPayRequMessPubli;
    }
    @TransactionalEventListener
    void process(OrderCreatedEvent orderCreatedEvent){

    }
}
