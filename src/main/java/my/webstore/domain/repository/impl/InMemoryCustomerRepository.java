package my.webstore.domain.repository.impl;

import my.webstore.domain.Customer;
import my.webstore.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Customer> getAllCustomers() {
        Map<String, Object> params = new HashMap<>();
        List<Customer> result =
                jdbcTemplate.query("SELECT * FROM customers", params, new CustomerMapper());
        return result;
    }

    @Override
    public void updatePurchase(String customerId, int noOfOrdersMade) {
        String SQL = "UPDATE CUSTOMERS SET NO_OF_ORDERS_MADE =:noOfOrdersMade WHERE ID =:id";
        Map<String, Object> params = new HashMap<>();
        params.put("noOfOrdersMade", noOfOrdersMade);
        params.put("id", customerId);
        jdbcTemplate.update(SQL, params);
    }

    private static final class CustomerMapper implements RowMapper<Customer> {
        @Override
        public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
            Customer customer = new Customer();
            customer.setCustomerId(rs.getString("ID"));
            customer.setName(rs.getString("NAME"));
            customer.setAddress(rs.getString("ADDRESS"));
            customer.setNoOfOrdersMade(rs.getInt("NO_OF_ORDERS_MADE"));
            return customer;
        }
    }
}
