package my.webstore.service.impl;

import my.webstore.domain.Product;
import my.webstore.domain.repository.ProductRepository;
import my.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public void updateAllStock() {
        List<Product> allProducts = getAllProducts();
        for (Product product : allProducts) {
            if (product.getUnitsInStock() < 500) {
                productRepository.updateStock(product.getProductId(),
                        product.getUnitsInStock() + 500);
            }
        }
    }

    @Override
    public List<Product> getAllProducts() {
        Map<String, Object> params = new HashMap<>();
        List<Product> result =
                jdbcTemplate.query("SELECT * FROM products", params, new ProductMapper());
        return result;
    }

    private static final class ProductMapper implements RowMapper<Product> {

        @Override
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product product = new Product();
            product.setProductId(rs.getString("ID"));
            product.setName(rs.getString("NAME"));
            product.setDescription(rs.getString("DESCRIPTION"));
            product.setManufacturer(rs.getString("MANUFACTURER"));
            product.setCategory(rs.getString("CATEGORY"));
            product.setCondition(rs.getString("CONDITION"));
            product.setUnitsInStock(rs.getLong("UNITS_IN_STOCK"));
            product.setUnitsInOrder(rs.getLong("UNITS_IN_ORDER"));
            product.setDiscontinued(rs.getBoolean("DISCONTINUED"));
            return product;
        }
    }
}
