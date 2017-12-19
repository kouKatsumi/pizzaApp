/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.service;

import com.ada.ulrShortener.api.menu.MenuItem;
import com.ada.ulrShortener.api.menu.MenuItemType;
import com.ada.ulrShortener.api.restaurant.Restaurant;
import java.util.List;

public interface RestaurantService {

  Restaurant getDetails(Long id);

  public List<MenuItem> getMenu(Long id);
  public List<MenuItem> getMenuItemsByType(MenuItemType type);
}
