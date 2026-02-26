package com.cashier.service;

import com.cashier.model.PurchasedItem;
import com.cashier.ui.Console;

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
    return 0;
  }

  public static double getDiscount(double total, double discount) {
    double result = total * discount;
    System.out.println("You get a discount " + discount + "% : Rp " + result);
    return result;
  }

  public static void calculatePayment(double total) {
    boolean valid = true;
    do {
      System.out.print("Enter the amount : ");
      double pay = Console.input.nextDouble();
      Console.input.nextLine();

      if (pay < total) {
        System.out.println("Insufficient funds");
      } else {
        double discount = applyDiscount(total);
        double change = pay - (total - discount);
        System.out.println("Change: " + change);
        valid = false;
      }
    } while (valid);
  }
}