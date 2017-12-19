/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.repositories;


import com.ada.ulrShortener.domain.order.OrderImpl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderImpl, String> {
}
