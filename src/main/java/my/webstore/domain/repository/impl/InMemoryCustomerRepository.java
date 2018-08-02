package my.webstore.domain.repository.impl;

import my.webstore.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCustomerRepository implements CustomerRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public void updatePurchase(String customerId, int noOfOrdersMade) {
        String SQL = "UPDATE CUSTOMERS SET NO_OF_ORDERS_MADE =:noOfOrdersMade WHERE ID =:id";
        Map<String, Object> params = new HashMap<>();
        params.put("noOfOrdersMade", noOfOrdersMade);
        params.put("id", customerId);
        jdbcTemplate.update(SQL, params);
    }
}
