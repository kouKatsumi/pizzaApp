package com.ada.ulrShortener.web;

import com.ada.ulrShortener.api.order.Order;
import com.ada.ulrShortener.api.order.OrderRequest;
import com.ada.ulrShortener.api.order.OrderResponse;
import com.ada.ulrShortener.service.OrderService;
import java.net.MalformedURLException;
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
@RequestMapping(value = "/orders", produces = "application/json;charset=UTF-8")
class OrderController {

  private final OrderService service;


  @Autowired
  public OrderController(OrderService service) {
    this.service = service;
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  @ResponseBody
  public Order findOne(@PathVariable("id") String id) {
//    return new ModelAndView("redirect:" + service.findUrl(url).getUrl());
    return service.findOrder(id);
  }

  @RequestMapping(method = RequestMethod.POST)
  @ResponseStatus(HttpStatus.CREATED)
  @ResponseBody
  public OrderResponse create(@RequestBody OrderRequest resource)
      throws MalformedURLException, ExecutionException, InterruptedException {
//    return urlCreator.createFullUrl(service.urlToShorten(resource).get().getId());
    return service.placeOrder(resource).get();
  }

}
