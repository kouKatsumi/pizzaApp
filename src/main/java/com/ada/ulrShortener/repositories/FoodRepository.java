package com.ada.ulrShortener.repositories;

import com.ada.ulrShortener.api.menu.MenuItem;
import com.ada.ulrShortener.domain.menu.FoodItemImpl;
import com.ada.ulrShortener.domain.menu.MenuItemImpl;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FoodRepository extends JpaRepository<FoodItemImpl, String> {
}
