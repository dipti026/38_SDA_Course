package com.example.onlinebidding.service;

import com.example.onlinebidding.model.Bid;
import com.example.onlinebidding.repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidService {
    @Autowired
    private BidRepository bidRepository;

    public Bid placeBid(Bid bid) {
        
        return bidRepository.save(bid);
    }
}
