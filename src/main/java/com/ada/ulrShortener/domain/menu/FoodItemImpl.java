/**
 * Copyright (C) 2017 Spotify AB
 */
package com.ada.ulrShortener.domain.menu;

import com.ada.ulrShortener.api.menu.FoodItem;
import com.ada.ulrShortener.api.menu.Ingredient;
import com.ada.ulrShortener.api.menu.MenuItemType;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.hibernate.annotations.CollectionType;

@Entity
public class FoodItemImpl implements FoodItem {

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

//  @CollectionType(parameters = LIST)
  @ManyToMany
//  @ElementCollection
  private List<IngredientImpl> ingredients;

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

  @Override
  public List<Ingredient> getIngredients() {
    //TODO: That seems really stupid, needs to double check how to use interfaces in Spring
    return ingredients.stream().map(i -> (Ingredient)i).collect(Collectors.toList());
  }
}
