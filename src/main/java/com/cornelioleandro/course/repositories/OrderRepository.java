package com.cornelioleandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cornelioleandro.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
