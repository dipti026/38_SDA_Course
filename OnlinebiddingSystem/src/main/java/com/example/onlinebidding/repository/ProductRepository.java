package com.example.onlinebidding.repository;

import com.example.onlinebidding.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // You can define additional query methods if needed
}
