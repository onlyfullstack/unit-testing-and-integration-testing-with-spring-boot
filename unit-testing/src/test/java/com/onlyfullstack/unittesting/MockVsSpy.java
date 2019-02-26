package com.onlyfullstack.unittesting;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

/**
 * This class identifies the differences in between Mock and Spy
 */
@RunWith(MockitoJUnitRunner.class)
public final class MockVsSpy {

    /*
     We dont need to instantiate the mock List as the @Mock will create and instantiate the list for us
     */
    @Mock
    private List<String> mockedList;

    /*
    We need to instantiate the list object as the @Spy will use the real objects method if we dont mock them
     */
    @Spy
    private List<String> spyList = new ArrayList();

    @Test
    public void testMockList_checkDefaultBehaviour_whenMethodIsNotMocked() {
        /*If we dont mock the methods of @Mock object and try to call them
        then it will not do anything.*/

        mockedList.add("test"); // add the String into list which will not do anything
        assertNull(mockedList.get(0)); // As the String was not added into the list it will return null value
    }

    @Test
    public void testSpyList_checkDefaultBehaviour_whenMethodIsNotMocked() {
        /* add method is not mocked so the spyList will execute
        * the default behavoir of the add method and it will add a new String into list*/
        spyList.add("test");
        assertEquals("test", spyList.get(0));
    }

    @Test
    public void testMockList_whenMethodIsMocked() {
        /*If we dont mock the methods of @Mock object and try to call them
        then it will not do anything.*/
        when(mockedList.size()).thenReturn(10);
        mockedList.add("One");
        assertNull(mockedList.get(0)); // Again the execution of add and get methods will not have any impact on mocked object

        assertEquals(10, mockedList.size()); // As the String was not added into the list it will return null value
    }

    @Test
    public void testSpyList_whenMethodIsMocked() {
        /* add method is not mocked so the spyList will execute
         * the default behaviour of the add method and it will add a new String into list*/
        when(spyList.size()).thenReturn(10);
        spyList.add("One");
        assertEquals("One", spyList.get(0));

        assertEquals(10, spyList.size()); // size method will return 10 as we have mocked its implementation
    }

}