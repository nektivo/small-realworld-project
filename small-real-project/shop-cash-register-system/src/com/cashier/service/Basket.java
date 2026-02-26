package com.cashier.service;

import java.util.ArrayList;
import com.cashier.model.PurchasedItem;
import com.cashier.model.MenuItem;

public class Basket {
  private ArrayList<PurchasedItem> cart = new ArrayList<>();

  public void addItem(MenuItem item, int qty) {
    cart.add(new PurchasedItem(item, qty));
  }

  public ArrayList<PurchasedItem> getItems() {
    return cart;
  }

  public boolean isEmpty() {
    return cart.isEmpty();
  }

  public static void buildLine() {
    for (int i = 0; i < 30; i++) {
      System.out.print("-");
    }
    System.out.println();
  }
}
