/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.domain.restaurant;

import com.ada.ulrShortener.api.menu.MenuItem;
import com.ada.ulrShortener.api.restaurant.Adress;
import com.ada.ulrShortener.api.restaurant.Restaurant;
import com.ada.ulrShortener.domain.menu.MenuItemImpl;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class RestaurantImpl implements Restaurant{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Embedded
  private AdressImpl adress;
  @Column
  private String name;

  @OneToMany
  private List<MenuItemImpl> menuItems;

  @Override
  public long getId() {
    return id;
  }

  @Override
  public Adress getAddress() {
    return adress;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public List<MenuItem> getMenu() {
    return menuItems.stream().map(i -> (MenuItem)i).collect(Collectors.toList());
  }
}
