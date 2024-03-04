package com.example.order.model;

import java.util.Date;
import javax.persistence.Table;

@Table(name = "`order`")
public class Order extends BaseEntity {
  private Long userId;
  private Double amount;
  private Date payDatetime;
  private User user;

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Date getPayDatetime() {
    return payDatetime;
  }

  public void setPayDatetime(Date payDatetime) {
    this.payDatetime = payDatetime;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}