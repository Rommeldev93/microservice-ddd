package com.food.ordering.system.order.service.domain.ports.output.messa.publish.restappro;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestRequeMessPub extends DomainEventPublisher<OrderPaidEvent> {
}
