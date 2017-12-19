/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.api.order;

import java.util.Date;

public interface OrderResponse {

  public long getOrderId();

  public long getPrice();

  //TODO: Change to new Java time
  public Date getOrderTime();

  public Date getEtimatedDeliveryTime();

  public OrderStatus getOrderStatus();
}
