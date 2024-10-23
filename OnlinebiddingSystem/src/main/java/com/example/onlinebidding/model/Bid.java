package com.example.onlinebidding.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bids")
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getBidTime() {
		return bidTime;
	}

	public void setBidTime(LocalDateTime bidTime) {
		this.bidTime = bidTime;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getBidder() {
		return bidder;
	}

	public void setBidder(User bidder) {
		this.bidder = bidder;
	}

	private double amount;
    private LocalDateTime bidTime = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "bidder_id")
    private User bidder;

}
