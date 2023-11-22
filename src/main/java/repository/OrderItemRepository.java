package com.EShoapEaze.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EShoapEaze.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
