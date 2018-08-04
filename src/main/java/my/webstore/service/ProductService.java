package my.webstore.service;

import my.webstore.domain.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(String productId);

    List<Product> getProductByCategory(String category);

    List<Product> getProductsByFilter(Map<String, List<String>> filterParams);

    void updateAllStock();

    void addProduct(Product product);

}
