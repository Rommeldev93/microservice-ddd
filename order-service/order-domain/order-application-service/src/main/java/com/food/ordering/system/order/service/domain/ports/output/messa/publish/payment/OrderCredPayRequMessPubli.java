package com.food.ordering.system.order.service.domain.ports.output.messa.publish.payment;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.event.OrderCreatedEvent;

public interface OrderCredPayRequMessPubli extends DomainEventPublisher<OrderCreatedEvent> {
}
