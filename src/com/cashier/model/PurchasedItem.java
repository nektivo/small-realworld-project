package com.cashier.model;

public class PurchasedItem {
  // default variable
  public String name;
  public int pricePerItem;
  public int quantity;
  public int total;

  // constructor
  public PurchasedItem(String name, int pricePerItem, int quantity) {
    this.name = name;
    this.pricePerItem = pricePerItem;
    this.quantity = quantity;
    this.total = pricePerItem * quantity;
  }
}
