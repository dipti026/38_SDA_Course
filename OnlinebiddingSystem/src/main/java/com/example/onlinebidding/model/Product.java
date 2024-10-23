package com.example.onlinebidding.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(double startPrice) {
		this.startPrice = startPrice;
	}

	public LocalDateTime getAuctionEndTime() {
		return auctionEndTime;
	}

	public void setAuctionEndTime(LocalDateTime auctionEndTime) {
		this.auctionEndTime = auctionEndTime;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	private String name;
    private String description;
    private double startPrice;
    private LocalDateTime auctionEndTime;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

}
