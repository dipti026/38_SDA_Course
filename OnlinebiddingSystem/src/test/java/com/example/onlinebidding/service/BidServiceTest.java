package com.example.onlinebidding.service;

import com.example.onlinebidding.model.Bid;
import com.example.onlinebidding.repository.BidRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class BidServiceTest {

    @Mock
    private BidRepository bidRepository;

    @InjectMocks
    private BidService bidService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testPlaceBid() {
        Bid bid = new Bid();
        bid.setProductId(1L);
        bid.setBidAmount(1000.0);

        bidService.placeBid(bid);
        verify(bidRepository).save(bid);
    }
}
