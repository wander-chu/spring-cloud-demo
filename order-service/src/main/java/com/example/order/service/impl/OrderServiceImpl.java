package com.example.order.service.impl;

import com.example.order.mapper.OrderMapper;
import com.example.order.model.Order;
import com.example.order.service.OrderService;
import com.example.user.UserClient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
  @Autowired
  private OrderMapper orderMapper;
  @Autowired
  private UserClient userClient;

  @Override
  public List<Order> findAllUsers() {
    return orderMapper.selectAll();
  }

  @Override
  public Order findUserById(long id) {
    Order order = orderMapper.selectByPrimaryKey(id);
    if (order != null) {
      order.setUser(userClient.findUserById(order.getUserId()));
    }
    return order;
  }
}