/*
 * Copyright (c) 2019 Mastercard. All rights reserved.
 */

package com.onlyfullstack.unittesting;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

/**
 * TODO: Javadoc
 */
public final class MatcherExample {

    @Test
    public void compare2Strings_with_is_matcher() {
        String name = "Saurabh";
        String newName = "Saurabh";
        assertThat(name, is(newName));
    }

    @Test
    public void compare2Strings_notEquals_with_not_Matcher() {
        String name = "Saurabh";
        String newName = "OnlyFullstack";
        assertThat(name, not(newName));
    }

    @Test
    public void startsWith_example() {
        String name = "OnlyFullstack";
        String newName = "Only";
        assertThat(name, startsWith(newName));
    }

    @Test
    public void endsWith_example() {
        String name = "OnlyFullstack";
        String newName = "Only";
        assertThat(name, endsWith(newName));
    }

    @Test
    public void containsString_example() {
        String name = "OnlyFullstack";
        String newName = "Full";
        assertThat(name, containsString(newName));
    }

    @Test
    public void notNullValue_example() {
        String name = "OnlyFullstack";
        assertThat(name, notNullValue());
    }

    @Test
    public void sameInstance_instanceOf_example() {
        String name = "OnlyFullstack";
        assertThat(name, sameInstance(name));
        assertThat(name, instanceOf(String.class));
    }
}