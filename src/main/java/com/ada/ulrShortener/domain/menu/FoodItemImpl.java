/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.domain.menu;

import com.ada.ulrShortener.api.menu.FoodItem;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class FoodItemImpl extends MenuItemImpl implements FoodItem {

//  @Column
//  @Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
//  private long id;

//  @Column
//  private String name;

//  @Column
//  private float price;

//  @Enumerated(EnumType.STRING)
//  private MenuItemType type;

  //  @CollectionType(parameters = LIST)
  @ManyToMany
//  @ElementCollection
  private List<IngredientImpl> ingredients;

//  @Override
//  public String getName() {
//    return name;
//  }
//
//  @Override
//  public float getPrice() {
//    return price;
//  }
//
//  @Override
//  public MenuItemType getType() {
//    return type;
//  }
//
//  @Override
//  public long getId() {
//    return id;
//  }

  @Override
  public List<IngredientImpl> getIngredients() {
    return ingredients;
  }
}
