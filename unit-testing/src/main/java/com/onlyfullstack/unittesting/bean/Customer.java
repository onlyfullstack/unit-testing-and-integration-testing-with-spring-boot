package com.onlyfullstack.unittesting.bean;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public final class Customer {

        private Integer id;

        private String name;

        private String address;

    public Customer(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
        public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

        @Override
        public int hashCode()
        {
            return HashCodeBuilder.reflectionHashCode(this);
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

}