package com.cdk.bhavana;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * test for request class.
 */
public class RequestTest {

    /**
     * subject under test.
     */
    public Request request;

    /**
     * count variable.
     */
    private final Integer count = 10;

    /**
     * setUp method.
     */
    @Before
    public void setUp() {
        request = new Request();
    }

    /**
     * when firstName is set then getter should return the same.
     */
    @Test
    public void whenFirstNameIsSetThenGetterShouldReturnTheSame() {
        assertNull(request.getFirstName());
        String firstName = RandomStringUtils.random(count);
        request.setFirstName(firstName);
        assertEquals(firstName, request.getFirstName());
    }

    /**
     * when lastName is set then getter should return the same.
     */
    @Test
    public void whenLastNameIsSetThenGetterShouldReturnTheSame() {
        assertNull(request.getLastName());
        String lastName = RandomStringUtils.random(count);
        request.setLastName(lastName);
        assertEquals(lastName, request.getLastName());
    }

}
