package com.onlyfullstack.unittesting.service;

import org.apache.commons.lang3.StringUtils;

/**
 * This class contains the business logic to throw an exception
 */
public final class ExceptionHandling {

    public String convertIntoUpperCase(String input) {
        if (StringUtils.isEmpty(input)) {
            throw new IllegalArgumentException("Empty value is passed.");
        }
        return input.toUpperCase();
    }
}