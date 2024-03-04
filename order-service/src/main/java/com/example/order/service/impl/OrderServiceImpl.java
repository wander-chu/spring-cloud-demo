package com.example.order.service.impl;

import com.example.order.mapper.OrderMapper;
import com.example.order.model.Order;
import com.example.order.model.User;
import com.example.order.service.OrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {
  @Autowired
  private OrderMapper orderMapper;
  @Autowired
  private RestTemplate restTemplate;

  @Override
  public List<Order> findAllUsers() {
    return orderMapper.selectAll();
  }

  @Override
  public Order findUserById(long id) {
    Order order = orderMapper.selectByPrimaryKey(id);
    if (order != null) {
      String url = "http://user-service/users/" + order.getUserId();
      order.setUser(restTemplate.getForObject(url, User.class));
    }
    return order;
  }
}