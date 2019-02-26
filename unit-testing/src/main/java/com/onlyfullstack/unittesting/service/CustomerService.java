package com.onlyfullstack.unittesting.service;

import com.onlyfullstack.unittesting.bean.Customer;
import com.onlyfullstack.unittesting.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public final class CustomerService {

    @Autowired
    public CustomerRepository repository;

    public boolean saveCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Invalid Customer details passed.");
        }
        return repository.saveCusomer(customer);
    }

    public Customer getCustomer(Integer customerId) {
        if (customerId == null || customerId < 0) {
            throw new IllegalArgumentException("Invalid Customer details passed.");
        }
        return repository.getCustomer(customerId);
    }

    public Customer updateCustomer(Customer customer) {
        if (customer == null || customer.getId() < 0) {
            throw new IllegalArgumentException("Invalid Customer details passed.");
        }
        repository.updateCustomer(customer);
        return customer;
    }
}