/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.domain.order;

import com.ada.ulrShortener.api.menu.MenuItem;
import com.ada.ulrShortener.api.order.OrderRequest;
import com.ada.ulrShortener.api.restaurant.Restaurant;
import com.ada.ulrShortener.domain.restaurant.RestaurantImpl;
import java.util.Map;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//@Entity
@Embeddable
public class OrderRequestImpl implements OrderRequest {



//  @OneToMany(targetEntity=RestaurantImpl.class, mappedBy="restaurnt", fetch= FetchType.EAGER)
//  @JoinColumn(name = "restaurant", referencedColumnName = "restaurant")
  @OneToOne(targetEntity = RestaurantImpl.class)
  private RestaurantImpl restaurant;

  public Map<MenuItem, Integer> getOrderDetails() {
    return null;
  }

  public Restaurant getRestaurant() {
    return (Restaurant) restaurant;
  }
}
