/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.domain.restaurant;

import com.ada.ulrShortener.api.restaurant.Adress;
import com.ada.ulrShortener.api.restaurant.Restaurant;
import com.ada.ulrShortener.domain.menu.DrinkItemImpl;
import com.ada.ulrShortener.domain.menu.FoodItemImpl;
import com.ada.ulrShortener.domain.menu.MenuItemImpl;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class RestaurantImpl implements Restaurant {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Embedded
  private AdressImpl adress;
  @Column
  private String name;


  @OneToMany
  @JoinColumn(name = "restaurant_id")
  private List<FoodItemImpl> foodItems;

  @OneToMany
  @JoinColumn(name = "restaurant_id")
  private List<DrinkItemImpl> drinkItems;

  @Override
  public long getId() {
    return id;
  }

  @Override
  public Adress getAddress() {
    return adress;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public List<MenuItemImpl> getMenu() {
    return Stream.concat(foodItems.stream(), drinkItems.stream())
        .collect(Collectors.toList());
  }
}
