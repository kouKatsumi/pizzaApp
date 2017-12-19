/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.domain.order;

import com.ada.ulrShortener.api.menu.MenuItem;
import com.ada.ulrShortener.api.order.Order;
import com.ada.ulrShortener.api.order.OrderRequest;
import com.ada.ulrShortener.api.order.OrderResponse;
import com.ada.ulrShortener.api.order.OrderStatus;
import com.ada.ulrShortener.api.restaurant.Restaurant;
import java.util.Date;
import java.util.Map;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderImpl implements Order {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Embedded
  private OrderRequestImpl request;
  @Embedded
  private OrderResponseImpl response;

  @Override
  public Map<MenuItem, Integer> getOrderDetails() {
    return request.getOrderDetails();
  }

  @Override
  public Restaurant getRestaurant() {
    return request.getRestaurant();
  }

  @Override
  public long getOrderId() {
    return id;
  }

  @Override
  public long getPrice() {
    return response.getPrice();
  }

  @Override
  public Date getOrderTime() {
    return response.getOrderTime();
  }

  @Override
  public Date getEtimatedDeliveryTime() {
    return response.getEtimatedDeliveryTime();
  }

  @Override
  public OrderStatus getOrderStatus() {
    return response.getOrderStatus();
  }
}
