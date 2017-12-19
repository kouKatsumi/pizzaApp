/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.api.menu;

public enum MenuItemType {
  DRINK,
  PIZZA,
  ADDITIONAL;

  @Override
  public String toString() {
    return super.toString().toLowerCase();
  }
}
