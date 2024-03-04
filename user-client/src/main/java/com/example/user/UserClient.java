package com.example.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service")
public interface UserClient {
  @GetMapping("/users/{id}")
  User findUserById(@PathVariable("id") Long id);
}
