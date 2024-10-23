package com.example.onlinebidding.controller;

import com.example.onlinebidding.model.Bid;
import com.example.onlinebidding.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bids")
public class BidController {
    @Autowired
    private BidService bidService;

    @PostMapping
    public Bid placeBid(@RequestBody Bid bid) {
        return bidService.placeBid(bid);
    }
}
