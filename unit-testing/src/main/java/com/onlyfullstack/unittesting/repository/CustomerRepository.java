package com.onlyfullstack.unittesting.repository;

import java.util.HashMap;
import java.util.Map;

import com.onlyfullstack.unittesting.bean.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepository {

    private static Map<Integer, Customer> customerMap = new HashMap<>();

    {
        customerMap.put(1, new Customer(1, "ABC", "Pune"));
        customerMap.put(2, new Customer(2, "XYZ", "Pune"));
        customerMap.put(3, new Customer(3, "PQR", "Pune"));
        customerMap.put(4, new Customer(4, "MNO", "Pune"));
    }

    public boolean saveCusomer(Customer customer) {
        customerMap.put(customer.getId(), customer);
        return true;
    }

    public Customer getCustomer(Integer customerId) {
        return customerMap.get(customerId);
    }

    public void updateCustomer(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }
}