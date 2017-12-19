/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.api.order;

import com.ada.ulrShortener.api.menu.MenuItem;
import com.ada.ulrShortener.api.restaurant.Restaurant;
import java.util.Map;

public interface OrderRequest {

  public Map<MenuItem, Integer> getOrderDetails();

  public Restaurant getRestaurant();
}
