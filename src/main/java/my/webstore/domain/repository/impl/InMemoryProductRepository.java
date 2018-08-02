package my.webstore.domain.repository.impl;

import my.webstore.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryProductRepository implements ProductRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public void updateStock(String productId, long noOfUnits) {
        String SQL = "UPDATE PRODUCTS SET UNITS_IN_STOCK =:unitsInStock WHERE ID =:id";
        Map<String, Object> params = new HashMap<>();
        params.put("unitsInStock", noOfUnits);
        params.put("id", productId);
        jdbcTemplate.update(SQL, params);
    }
}
