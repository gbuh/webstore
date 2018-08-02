package my.webstore.service;

import my.webstore.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    void updateAllStock();
}
