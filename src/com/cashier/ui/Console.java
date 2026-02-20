package com.cashier.ui;

import java.util.Scanner;
import com.cashier.service.*;
import com.cashier.model.*;

public class Console {
  public static Scanner input = new Scanner(System.in);

  public static void start(MenuService menuService, Basket basket) {
    while (true) {
      displayMenu(menuService);
      System.out.print("Choice The Menu (write '0' to finish): ");
      int choice = input.nextInt();
      input.nextLine();

      if (choice == 0)
        break;
      if (choice < 1 || choice > menuService.getMenu().size()) {
        System.out.println("Invalid Menu!");
        continue;
      }

      System.out.print("Quantity : ");
      int qty = input.nextInt();
      input.nextLine();
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
    System.out.println("\n--------- WARKOP 76 ---------");
    System.out.println("No. Menu Nama     Harga     ");
    Basket.buildLine();
    int i = 1;
    for (MenuItem item : menuService.getMenu()) {
      if (i == 1) {
        System.out.println("\nDrinks Menu");
        Basket.buildLine();
      }
      if (i == 9) {
        System.out.println("\nFoods Menu");
        Basket.buildLine();
      }
      System.out.printf("%d. %-14s Rp %6d\n", i++, item.getName(), item.getPrice());
    }
  }

  public static void paymentType(double total) {
    boolean check = true;
    while (check) {
      System.out.print("Payment Type (Cash / Qris): ");
      String inputPay = input.nextLine();
      if (inputPay.equalsIgnoreCase("qris")) {
        new QrisFrame().setVisible(true);
        check = false;
      } else if (inputPay.equalsIgnoreCase("cash")) {
        Payment.calculatePayment(total);
        check = false;
      } else {
        System.out.println("Choose a valid payment method");
      }
    }
  }

  private static void printReceipt(Basket basket) {
    if (basket.isEmpty()) {
      System.out.println("No items purchased");
      return;
    }

    System.out.println("\n---------- RECEIPT ----------");
    double total = Payment.calculateTotal(basket);

    for (PurchasedItem p : basket.getItems()) {
      System.out.println(p.getQuantity() + " x " + p.getName() + " = Rp " + p.getTotal());
    }
    Basket.buildLine();

    System.out.println("Total: Rp " + total);
    paymentType(total);
    Basket.buildLine();
    System.out.println("\nThank You For Shopping!");
  }
}
