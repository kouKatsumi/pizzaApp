package com.ada.ulrShortener.repositories;

import com.ada.ulrShortener.domain.menu.DrinkItemImpl;
import com.ada.ulrShortener.domain.menu.FoodItemImpl;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DrinkRepository extends JpaRepository<DrinkItemImpl, String> {
}
