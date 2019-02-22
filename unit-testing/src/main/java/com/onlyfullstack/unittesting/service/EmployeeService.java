/*
 * Copyright (c) 2019 Mastercard. All rights reserved.
 */

package com.onlyfullstack.unittesting.service;

import java.util.Collections;
import java.util.Map;

import com.onlyfullstack.unittesting.bean.Employee;

public final class EmployeeService {

    private Map<Integer, Employee> employeeMap = Collections.singletonMap(1, new Employee());

    public boolean isValidEmployee(Employee employee) {
        boolean isValid = false;
        if(employee != null) {
            if(employee.getId() != null && employee.getName() !=null) {
                isValid = true;
            }
        }
        return isValid;
    }

    public Double calculateTax(Employee employee) {
        Double tax = 0.0;
        if(employee!=null && employee.getSalary() >0) {
            if(employee.getSalary() < 500000) {
                tax = employee.getSalary() * 0.05;
            } else if(employee.getSalary() > 500000 && employee.getSalary() < 1000000) {
                tax = employee.getSalary() * 0.1;
            } else {
                tax = employee.getSalary() * 0.2;
            }
        }
        return tax;
    }

    public Employee getEmployeeFromId(Integer id) {
        return employeeMap.get(id);
    }
}