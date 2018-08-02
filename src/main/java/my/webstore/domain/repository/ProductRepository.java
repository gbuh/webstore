package my.webstore.domain.repository;

public interface ProductRepository {

    void updateStock(String productId, long noOfUnits);
}
