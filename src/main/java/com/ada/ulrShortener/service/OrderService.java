package com.ada.ulrShortener.service;

import com.ada.ulrShortener.api.order.Order;
import com.ada.ulrShortener.api.order.OrderRequest;
import com.ada.ulrShortener.api.order.OrderResponse;
import java.util.concurrent.CompletableFuture;

public interface OrderService {

  CompletableFuture<OrderResponse> placeOrder(OrderRequest url);

  Order findOrder(String url);
}
