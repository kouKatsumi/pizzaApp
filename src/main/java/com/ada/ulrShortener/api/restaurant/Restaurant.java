/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.api.restaurant;

import com.ada.ulrShortener.api.menu.MenuItem;
import java.util.List;

public interface Restaurant {
  public long getId();
  public Adress getAddress();
  public String getName();
  public List<MenuItem> getMenu();


}
