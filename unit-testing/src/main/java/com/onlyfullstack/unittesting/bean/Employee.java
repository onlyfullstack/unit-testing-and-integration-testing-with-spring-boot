/*
 * Copyright (c) 2019 Mastercard. All rights reserved.
 */

package com.onlyfullstack.unittesting.bean;

public final class Employee {

    private Integer id;

    private String name;

    private String address;

    private Double Salary;

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode()
    {
        return 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
}