/*
 * Copyright (c) 2019 Mastercard. All rights reserved.
 */

package com.onlyfullstack.unittesting.service;

import org.apache.commons.lang3.StringUtils;

/**
 * TODO: Javadoc
 */
public final class ExceptionHandling {

    public String convertIntoUpperCase(String input) {
        if(StringUtils.isEmpty(input)) {
            throw new IllegalArgumentException("Empty value is passed.");
        }
        return input.toUpperCase();
    }
}