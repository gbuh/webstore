package my.webstore.domain.repository;

import my.webstore.domain.Product;

import java.util.List;
import java.util.Map;

public interface ProductRepository {

    List<Product> getAllProducts();

    Product getProductById(String productId);

    List<Product> getProductByCategory(String category);

    List<Product> getProductsByFilter(Map<String, List<String>> filterParams);

    void updateStock(String productId, long noOfUnits);
}
