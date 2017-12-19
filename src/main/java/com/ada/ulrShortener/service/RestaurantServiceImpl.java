/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.service;

import com.ada.ulrShortener.api.menu.MenuItem;
import com.ada.ulrShortener.api.menu.MenuItemType;
import com.ada.ulrShortener.api.order.Order;
import com.ada.ulrShortener.api.order.OrderRequest;
import com.ada.ulrShortener.api.order.OrderResponse;
import com.ada.ulrShortener.api.restaurant.Restaurant;
import com.ada.ulrShortener.domain.menu.MenuItemImpl;
import com.ada.ulrShortener.domain.restaurant.RestaurantImpl;
import com.ada.ulrShortener.repositories.RestaurantRepository;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class RestaurantServiceImpl implements RestaurantService {

  private final RestaurantRepository restaurantRepository;

  @Autowired
  private RestaurantServiceImpl(final RestaurantRepository restaurantRepository) {
    this.restaurantRepository = restaurantRepository;
  }

  @Override
  public Restaurant getDetails(Long id){
    return restaurantRepository.findOne(id);
  }

  @Override
  public List<MenuItemImpl> getMenu(Long id) {
    return restaurantRepository.findOne(id).getMenu();
  }

  @Override
  public List<MenuItemImpl> getMenuItemsByType(final MenuItemType type) {
//    return restaurantRepository.findMenuItemImplByType(type).stream().map(i -> (MenuItem)i).collect(
//        Collectors.toList());
    return null;
  }

  @Override
  public List<RestaurantImpl> getRestaurants() {
    return restaurantRepository.findAll();
  }
}
