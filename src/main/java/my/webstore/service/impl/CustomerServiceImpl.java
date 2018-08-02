package my.webstore.service.impl;

import my.webstore.domain.Customer;
import my.webstore.service.CustomerService;
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
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<Customer> getAllCustomers() {
        Map<String, Object> params = new HashMap<>();
        List<Customer> result =
                jdbcTemplate.query("SELECT * FROM customers", params, new CustomerMapper());
        return result;
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
