package com.ada.ulrShortener.repositories;

import com.ada.ulrShortener.api.menu.MenuItemType;
import com.ada.ulrShortener.domain.menu.MenuItemImpl;
import com.ada.ulrShortener.domain.restaurant.RestaurantImpl;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mbart on 28.02.2016.
 */

public interface RestaurantRepository extends JpaRepository<RestaurantImpl, Long> {

//  @Query(value = "select m from MenuItemImpl WHERE m.type = type")
//  public List<MenuItemImpl> findMenuItemImplByType(MenuItemType type);
}
