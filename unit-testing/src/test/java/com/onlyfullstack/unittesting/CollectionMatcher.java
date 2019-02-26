package com.onlyfullstack.unittesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.hasValue;
import static org.junit.Assert.assertThat;

/**
 * TODO: Javadoc
 */
public final class CollectionMatcher {

    @Test
    public void empty_collection_example() {
        List<String> list = new ArrayList<>();
        assertThat(list, empty());
    }

    @Test
    public void hasSize_example() {
        List<String> list = Arrays.asList("only", "fullstack");

        assertThat(list, hasSize(2));
        assertThat(list, hasItem("only"));
    }

    @Test
    public void contains_containsInAnyOrder_example() {
        List<String> list = Arrays.asList("only", "fullstack", "blog");

        assertThat(list, contains("only", "fullstack", "blog"));
        assertThat(list, containsInAnyOrder("fullstack", "blog", "only"));
    }

    @Test
    public void hasKey_hasValue_hasEntry_example() {
        Map<String, String> map = new HashMap<>();
        map.put("only", "fullstack");

        assertThat(map, hasKey("only"));
        assertThat(map, hasValue("fullstack"));
        assertThat(map, hasEntry("only", "fullstack"));
    }
}