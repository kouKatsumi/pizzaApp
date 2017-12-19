/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.domain.menu;

import com.ada.ulrShortener.api.menu.Ingredient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IngredientImpl implements Ingredient{

  //TODO: Not sure if that should be an id
  @Id
  @Column
  private String name;

  public String getName() {
    return name;
  }
}
