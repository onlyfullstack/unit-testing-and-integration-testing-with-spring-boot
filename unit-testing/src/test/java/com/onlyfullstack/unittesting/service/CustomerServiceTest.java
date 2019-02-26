package com.onlyfullstack.unittesting.service;

import com.onlyfullstack.unittesting.bean.Customer;
import com.onlyfullstack.unittesting.repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

/**
 * This class contains usage of Mockito
 */
@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

    @Mock
    CustomerRepository repository;

    @InjectMocks
    CustomerService customerService;

    @Test
    public void saveCustomer_withValidCustomer_when_thenReturn() {
        Customer customer = new Customer(6, "QQQ", "Mumbai");
        when(repository.saveCusomer(any())).thenReturn(true);
        Boolean save = customerService.saveCustomer(customer);
        assertThat(true, is(save));
        verify(repository, times(1)).saveCusomer(eq(customer));
    }

    @Test(expected = IllegalStateException.class)
    public void saveCustomer_withValidCustomer_when_thenThrow() {
        Customer customer = new Customer(6, "QQQ", "Mumbai");
        when(repository.saveCusomer(any())).thenThrow(new IllegalStateException());
        customerService.saveCustomer(customer);
        verifyNoMoreInteractions();
    }

    @Test
    public void updateCustomer_doAnswer_when() {
        Customer customer = new Customer(6, "QQQ", "Mumbai");
        doAnswer((arguments) -> {
            System.out.println("Inside doAnswer block");
            assertEquals(customer, arguments.getArgument(0));
            return null;
        }).when(repository).updateCustomer(any(Customer.class));
        customerService.updateCustomer(customer);
    }

    @Test(expected = Exception.class)
    public void updateCustomer_doNothing_when() {
        Customer customer = new Customer(6, "QQQ", "Mumbai");
        doThrow(new Exception("Database connection issue")).when(repository).updateCustomer(any(Customer.class));
        customerService.updateCustomer(customer);
    }
}