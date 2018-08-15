package my.webstore.service.impl;

import my.webstore.domain.Order;
import my.webstore.domain.repository.OrderRepository;
import my.webstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Long saveOrder(Order order) {
        return orderRepository.saveOrder(order);
    }
}
