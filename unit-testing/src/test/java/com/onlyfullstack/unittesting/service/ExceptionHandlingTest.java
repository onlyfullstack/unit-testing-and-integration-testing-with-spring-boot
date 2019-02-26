package com.onlyfullstack.unittesting.service;

import org.assertj.core.api.Assertions;
import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.fail;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * This class contains the different ways to assert certain exception in Junit.
 */
public class ExceptionHandlingTest {

    ExceptionHandling exceptionHandling = new ExceptionHandling();

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void convertIntoUpperCase_withValidInput() {
        assertThat("ABC", CoreMatchers.is(exceptionHandling.convertIntoUpperCase("abc")));
    }

    @Test
    public void convertIntoUpperCase_withInvalidInput_tryCatchIdiom() {
        try {
            exceptionHandling.convertIntoUpperCase("");
            fail("It should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assertions.assertThat(e)
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("Empty value is passed.");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertIntoUpperCase_withInvalidInput_testExpected() {
        exceptionHandling.convertIntoUpperCase("");
    }

    @Test
    public void convertIntoUpperCase_withInvalidInput_ExpectedExceptionRule() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Empty value is passed.");
        exceptionHandling.convertIntoUpperCase("");
    }

}