package com.example.order.service;

import com.example.order.model.Order;
import java.util.List;

public interface OrderService {
  List<Order> findAllUsers();

  Order findUserById(long id);
}