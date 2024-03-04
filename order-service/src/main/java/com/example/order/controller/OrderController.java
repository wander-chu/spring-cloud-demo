package com.example.order.controller;

import com.example.order.model.Order;
import com.example.order.service.OrderService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {
  @Autowired
  private OrderService orderService;

  @GetMapping
  public List<Order> findAllUsers() {
    return orderService.findAllUsers();
  }

  @GetMapping("/{id}")
  public Order findUserById(@PathVariable("id") Long id) {
    return orderService.findUserById(id);
  }
}
