package com.cashier.service;

import com.cashier.model.PurchasedItem;

public class MenuService {
  // default variable
  private int max;
  public static int index;
  public static String[] nameItem;
  public static int[] priceItem;

  // Constructor of Item
  public MenuService(int storage) {
    this.max = storage;
    nameItem = new String[max];
    priceItem = new int[max];
    index = 0;
  }

  public static void allItem() {
    if (!Payment.purchasedItems.isEmpty()) {
      double result = 0;
      System.out.println("Daftar item yang telah dibeli:");
      for (PurchasedItem i : Payment.purchasedItems) {
        System.out.println(i.quantity + " x " + i.name + " = Rp " + i.total);
        result += i.total;
      }
      Payment.getDiskon(result);
    } else {
      System.out.println("You haven't added any items yet");

      // Check whether the index exceeds the maximum value
    }
  }

}
