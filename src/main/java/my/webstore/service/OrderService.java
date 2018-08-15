package my.webstore.service;

import my.webstore.domain.Order;

public interface OrderService {
    Long saveOrder(Order order);
}
