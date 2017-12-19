/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.service;

import com.ada.ulrShortener.api.menu.MenuItem;
import com.ada.ulrShortener.api.menu.MenuItemType;
import com.ada.ulrShortener.api.order.Order;
import com.ada.ulrShortener.api.order.OrderRequest;
import com.ada.ulrShortener.api.order.OrderResponse;
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
  public List<MenuItem> getMenu(Long id) {
    return restaurantRepository.findOne(id).getMenu();
  }

  @Override
  public List<MenuItem> getMenuItemsByType(final MenuItemType type) {
//    return restaurantRepository.findMenuItemImplByType(type).stream().map(i -> (MenuItem)i).collect(
//        Collectors.toList());
    return null;
  }
}
