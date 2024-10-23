package com.example.onlinebidding.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BidController.class)
public class BidControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testPlaceBid() throws Exception {
        mockMvc.perform(post("/api/bids")
                .contentType("application/json")
                .content("{\"productId\": 1, \"bidAmount\": 1000}"))
                .andExpect(status().isCreated());
    }
}
