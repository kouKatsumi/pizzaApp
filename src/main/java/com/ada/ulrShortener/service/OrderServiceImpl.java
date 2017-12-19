///**
// * Copyright (C) 2017 Spotify AB
// */
//package com.ada.ulrShortener.service;
//
//import com.ada.ulrShortener.api.order.Order;
//import com.ada.ulrShortener.api.order.OrderRequest;
//import com.ada.ulrShortener.api.order.OrderResponse;
//import com.ada.ulrShortener.repositories.FoodRepository;
//import com.ada.ulrShortener.repositories.OrderRepository;
//import com.ada.ulrShortener.repositories.RestaurantRepository;
//import java.util.concurrent.CompletableFuture;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Transactional
//@Service
//public class OrderServiceImpl implements OrderService {
//
//  private final FoodRepository foodRepository;
//  private final RestaurantRepository restaurantRepository;
//  private final OrderRepository orderRepository;
//
//  @Autowired
//  private OrderServiceImpl(final FoodRepository foodRepository,
//                           final RestaurantRepository restaurantRepository,
//                           final OrderRepository orderRequestRepository) {
//    this.foodRepository = foodRepository;
//    this.restaurantRepository = restaurantRepository;
//    this.orderRepository = orderRequestRepository;
//  }
//
//  @Override
//  public CompletableFuture<OrderResponse> placeOrder(final OrderRequest url) {
//    //TODO: Validation
//    return null;
//  }
//
//  @Override
//  public Order findOrder(final String url) {
//    return null;
//  }
//}
