package my.webstore.service;

import my.webstore.domain.Product;

import java.util.List;

public interface ProductService {

    void updateAllStock();

    List<Product> getAllProducts();
}
