package com.example.onlinebidding.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testSetAndGetUsername() {
        User user = new User();
        user.setUsername("testUser");
        assertEquals("testUser", user.getUsername());
    }
}
