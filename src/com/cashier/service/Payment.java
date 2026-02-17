package com.cashier.service;

import com.cashier.model.PurchasedItem;

public class Payment {

  public static double calculateTotal(Basket basket) {
    double total = 0;
    for (PurchasedItem p : basket.getItems()) {
      total += p.getTotal();
    }
    return total;
  }

  public static double applyDiscount(double total) {
    if (total >= 200_000)
      return total * 0.9;
    if (total >= 100_000)
      return total * 0.95;
    return total;
  }
}
