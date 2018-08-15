package my.webstore.domain.repository;

import my.webstore.domain.Order;

public interface OrderRepository {
    long saveOrder(Order order);
}
