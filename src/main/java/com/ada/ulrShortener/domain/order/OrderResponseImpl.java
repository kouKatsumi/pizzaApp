/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.domain.order;

import com.ada.ulrShortener.api.order.OrderResponse;
import com.ada.ulrShortener.api.order.OrderStatus;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

//@Entity
@Embeddable
public class OrderResponseImpl extends OrderRequestImpl{

  @Column
  private long price;


  public long getPrice() {
    return price;
  }

  //TODO: Change to new Java time
  public Date getOrderTime() {
    return null;
  }

  public Date getEtimatedDeliveryTime() {
    return null;
  }

  public OrderStatus getOrderStatus() {
    return null;
  }
}
