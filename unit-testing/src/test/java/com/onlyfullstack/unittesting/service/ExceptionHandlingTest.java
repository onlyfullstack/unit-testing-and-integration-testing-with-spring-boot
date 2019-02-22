/*
 * Copyright (c) 2019 Mastercard. All rights reserved.
 */

package com.onlyfullstack.unittesting.service;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * TODO: Javadoc
 */
public class ExceptionHandlingTest {

    ExceptionHandling exceptionHandling = new ExceptionHandling();

    @Test
    public void convertIntoUpperCase_withValidInput() {
        assertThat("ABC", CoreMatchers.is(exceptionHandling.convertIntoUpperCase("abc")));
    }

    @Test
    public void convertIntoUpperCase_withInvalidInput_tryCatchIdem() {
        assertThat("ABC", CoreMatchers.is(exceptionHandling.convertIntoUpperCase("")));
    }
}