package com.onlyfullstack.unittesting;

import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.assertThat;

/**
 * This class contains the Number matchers
 */
public final class NumberMatcher {

    @Test
    public void greaterThan_greaterThanOrEqualTo_example() {
        assertThat(1, greaterThan(0));
        assertThat(4, greaterThanOrEqualTo(4));
    }

    @Test
    public void lessThan_lessThanOrEqualTo_example() {
        assertThat(1, lessThan(6));
        assertThat(4, lessThanOrEqualTo(4));
    }
}