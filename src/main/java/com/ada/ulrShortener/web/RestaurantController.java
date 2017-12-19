package com.ada.ulrShortener.web;

import com.ada.ulrShortener.api.menu.MenuItem;
import com.ada.ulrShortener.api.order.Order;
import com.ada.ulrShortener.api.order.OrderRequest;
import com.ada.ulrShortener.api.order.OrderResponse;
import com.ada.ulrShortener.api.restaurant.Restaurant;
import com.ada.ulrShortener.service.OrderService;
import com.ada.ulrShortener.service.RestaurantService;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping(value = "/restaurants", produces = "application/json;charset=UTF-8")
class RestaurantController {

  private final RestaurantService service;


  @Autowired
  public RestaurantController(RestaurantService service) {
    this.service = service;
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  @ResponseBody
  public Restaurant findOne(@PathVariable("id") Long id) {
    return service.getDetails(id);
  }

  @RequestMapping(value = "/{id}/menu", method = RequestMethod.GET)
  @ResponseBody
  public List<? extends MenuItem> getMenu(@PathVariable("id") Long id) {
    return service.getMenu(id);
  }

   @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public List<? extends Restaurant> findOne() {
    return service.getRestaurants();
  }


//
//  @RequestMapping(method = RequestMethod.POST)
//  @ResponseStatus(HttpStatus.CREATED)
//  @ResponseBody
//  public OrderResponse create(@RequestBody OrderRequest resource)
//      throws MalformedURLException, ExecutionException, InterruptedException {
////    return urlCreator.createFullUrl(service.urlToShorten(resource).get().getId());
////    return service.placeOrder(resource).get();
//    return null;
//  }

}
