package com.example.curse.resources.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
