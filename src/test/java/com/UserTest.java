package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    User temp = new User();

    @Test
    public void getName() {
        temp.setName("Steve");
        assertEquals("Steve", temp.getName());
    }

    @Test
    public void setName() {
        temp.setName("Steve");
        assertEquals("Steve", temp.getName());
    }
}