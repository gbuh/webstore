package my.webstore.domain.repository;

import my.webstore.domain.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getAllProducts();

    void updateStock(String productId, long noOfUnits);
}
