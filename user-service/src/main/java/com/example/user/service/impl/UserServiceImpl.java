package com.example.user.service.impl;

import com.example.user.mapper.UserMapper;
import com.example.user.model.User;
import com.example.user.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserMapper userMapper;

  @Override
  public List<User> findAllUsers() {
    return userMapper.selectAll();
  }

  @Override
  public User findUserById(long id) {
    return userMapper.selectByPrimaryKey(id);
  }

  @Override
  public void save(User user) {
    userMapper.insert(user);
  }

  @Override
  public void edit(User user) {
    userMapper.updateByPrimaryKey(user);
  }

  @Override
  public void delete(long id) {
    userMapper.deleteByPrimaryKey(id);
  }
}