package com.cashier.ui;

import java.util.Scanner;
import com.cashier.service.*;
import com.cashier.model.*;

public class Console {
  private static Scanner input = new Scanner(System.in);

  public static void start(MenuService menuService, Basket basket) {
    while (true) {
      displayMenu(menuService);
      System.out.print("Choice The Menu (write '0' to finish): ");
      int choice = input.nextInt();

      if (choice == 0)
        break;
      if (choice < 1 || choice > menuService.getMenu().size()) {
        System.out.println("Invalid Menu!");
        continue;
      }

      System.out.print("Quantity : ");
      int qty = input.nextInt();
      if (qty <= 0) {
        System.out.println("Quantity Must More Than 0");
        continue;
      }

      basket.addItem(menuService.getItem(choice - 1), qty);
      System.out.println("Successfully added!");
    }

    printReceipt(basket);
  }

  private static void displayMenu(MenuService menuService) {
    System.out.println("\n--- WARKOP 76 ---");
    int i = 1;
    for (MenuItem item : menuService.getMenu()) {
      System.out.printf("%d. %-15s Rp %d\n", i++, item.getName(), item.getPrice());
    }
  }

  private static void printReceipt(Basket basket) {
    if (basket.isEmpty()) {
      System.out.println("No items purchased");
      return;
    }

    double total = Payment.calculateTotal(basket);
    double finalTotal = Payment.applyDiscount(total);

    System.out.println("\n--- RECEIPT ---");
    for (PurchasedItem p : basket.getItems()) {
      System.out.println(p.getQuantity() + " x " + p.getName() + " = Rp " + p.getTotal());
    }

    System.out.println("Total: Rp " + total);
    System.out.println("Payment : Rp " + finalTotal);
    System.out.println("Thank You!");
  }
}
