package my.webstore.domain.repository;

public interface CustomerRepository {

    void updatePurchase(String customerId, int noOfOrdersMade);
}
