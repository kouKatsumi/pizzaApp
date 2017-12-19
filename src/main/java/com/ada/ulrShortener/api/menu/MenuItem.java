/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.api.menu;

public interface MenuItem {
  public String getName();
  public float getPrice();
  public MenuItemType getType();
  public long getId();

}
