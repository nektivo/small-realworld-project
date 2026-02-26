package com.cashier.model;

public class PurchasedItem {
  private MenuItem item;
  private int quantity;

  public PurchasedItem(MenuItem item, int quantity) {
    this.item = item;
    this.quantity = quantity;
  }

  public int getTotal() {
    return item.getPrice() * quantity;
  }

  public String getName() {
    return item.getName();
  }

  public int getQuantity() {
    return quantity;
  }
}
