/*
 * Copyright (c) 2019 Mastercard. All rights reserved.
 */

package com.onlyfullstack.unittesting.service;

import com.onlyfullstack.unittesting.bean.Employee;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * This class contains Unit Test cases of {@link EmployeeService}
 */
public class EmployeeServiceTest {

    private EmployeeService employeeService = new EmployeeService();

    private Employee employee = null;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Executing Before Class");
    }

    @Before
    public void before() {
        System.out.println("Executing Before");
        employee = new Employee();
        employee.setName("Saurabh");
        employee.setId(1);
        employee.setSalary(1000000.0);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Executing After Class");
    }

    @After
    public void after() {
        System.out.println("Executing After");
    }

    @Test
    public void isValidEmployee_withNullEmployee() {
        System.out.println("Entered in isValidEmployee_withNullEmployee");
        assertEquals(new Double(0.0), employeeService.calculateTax(null));
        System.out.println("Exited from isValidEmployee_withNullEmployee");
    }

    @Test
    public void isValidEmployee_withNegativeSalary() {
        System.out.println("Entered in isValidEmployee_withNegativeSalary");
        employee.setSalary(-2.0);
        assertEquals(new Double(0.0), employeeService.calculateTax(null));
        System.out.println("Exited from isValidEmployee_withNegativeSalary");
    }

    @Test
    public void assertEquals_example() {
        Employee employeeNew = new Employee();
        employee.setSalary(1000000.0);
        assertEquals("EMPLOYEE OBJECT", employee, employeeNew);
    }

    @Test
    public void assertTrue_assertFalse_example() {

        assertTrue("VALID EMPLOYEE OBJECT", employeeService.isValidEmployee(employee));
        assertFalse("INVALID EMPLOYEE OBJECT", employeeService.isValidEmployee(null));
    }

    @Test
    public void assertNull_assertNotNull_example() {

        assertNotNull(employeeService.getEmployeeFromId(1)); // in EmployeeService we have a map with
                                                                                                     // single entry of key as 1 so here we will get employee object
        assertNull(employeeService.getEmployeeFromId(2)); // We will get null as response
    }

    @Test
    public void assertSame_assertNoSame_example() {

        assertSame(employeeService.getEmployeeFromId(1), employeeService.getEmployeeFromId(1));
        assertNotSame(employee, employeeService.getEmployeeFromId(1)); // We will get null as response
    }

    @Test
    public void assertThat_example() {

        assertThat(employeeService.getEmployeeFromId(1), is(employeeService.getEmployeeFromId(1)));
        assertThat(employeeService.getEmployeeFromId(1), is(CoreMatchers.notNullValue()));

    }

}