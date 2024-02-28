package com.example.user.service;

import com.example.user.model.User;
import java.util.List;

public interface UserService {
  List<User> findAllUsers();

  User findUserById(long id);

  void save(User user);

  void edit(User user);

  void delete(long id);
}