package com.ada.ulrShortener.repositories;

import com.ada.ulrShortener.api.menu.MenuItem;
import com.ada.ulrShortener.domain.menu.MenuItemImpl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mbart on 28.02.2016.
 */

public interface RestaurantRepository extends JpaRepository<MenuItemImpl, String> {
}
