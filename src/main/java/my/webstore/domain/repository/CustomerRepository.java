package my.webstore.domain.repository;

import my.webstore.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> getAllCustomers();

    void updatePurchase(String customerId, int noOfOrdersMade);
}
