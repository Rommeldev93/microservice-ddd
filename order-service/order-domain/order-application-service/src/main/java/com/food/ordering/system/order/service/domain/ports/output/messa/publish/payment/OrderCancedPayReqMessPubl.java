package com.food.ordering.system.order.service.domain.ports.output.messa.publish.payment;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.event.OrderCancelledEvent;

public interface OrderCancedPayReqMessPubl extends DomainEventPublisher<OrderCancelledEvent> {
}
