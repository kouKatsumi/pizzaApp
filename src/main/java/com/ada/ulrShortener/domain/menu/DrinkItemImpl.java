/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.domain.menu;

import com.ada.ulrShortener.api.menu.DrinkItem;
import com.ada.ulrShortener.api.menu.MenuItemType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DrinkItemImpl implements DrinkItem {

  @Column
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column
  private String name;

  @Column
  private float price;

  @Enumerated(EnumType.STRING)
  private MenuItemType type;



  @Override
  public String getName() {
    return name;
  }

  //TODO: Think about separating price from item
  @Override
  public float getPrice() {
    return price;
  }

  @Override
  public MenuItemType getType() {
    return null;
  }

  @Override
  public long getId() {
    return id;
  }

  @Override
  public Long getVolume() {
    return null;
  }
}
