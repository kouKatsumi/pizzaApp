/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.domain.menu;

import com.ada.ulrShortener.api.menu.MenuItem;
import com.ada.ulrShortener.api.menu.MenuItemType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MenuItemImpl implements MenuItem{

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

  @Override
  public float getPrice() {
    return price;
  }

  @Override
  public MenuItemType getType() {
    return type;
  }

  @Override
  public long getId() {
    return id;
  }
}
