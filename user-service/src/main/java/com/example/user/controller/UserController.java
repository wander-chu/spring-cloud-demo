package com.example.user.controller;

import com.example.user.model.User;
import com.example.user.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping
  public List<User> findAllUsers() {
    return userService.findAllUsers();
  }

  @GetMapping("/{id}")
  public User findUserById(@PathVariable("id") Long id) {
    return userService.findUserById(id);
  }
}
