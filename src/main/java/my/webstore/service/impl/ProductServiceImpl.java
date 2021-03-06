package my.webstore.service.impl;

import my.webstore.domain.Product;
import my.webstore.domain.repository.ProductRepository;
import my.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public Product getProductById(String productId) {
        return productRepository.getProductById(productId);
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.getProductsByCategory(category);
    }

    @Override
    public List<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
        return productRepository.getProductsByFilter(filterParams);
    }

    @Override
    public void updateAllStock() {
        List<Product> allProducts = productRepository.getAllProducts();
        for (Product product : allProducts) {
            if (product.getUnitsInStock() < 500) {
                productRepository.updateStock(product.getProductId(),
                        product.getUnitsInStock() + 500);
            }
        }
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }
}
