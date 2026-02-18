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
      return getDiscount(total, 0.1);
    if (total >= 100_000)
      return getDiscount(total, 0.05);
    return total;
  }

  public static double getDiscount(double total, double discount) {
    double result = total * discount;
    double finalResult = total - result;
    System.out.println("You get a discount " + discount + "% : Rp " + result);
    return finalResult;
  }
}
