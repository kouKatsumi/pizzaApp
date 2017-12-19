/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.api.menu;

import java.util.List;

public interface FoodItem extends MenuItem {

  public List<Ingredient> getIngredients();
}
