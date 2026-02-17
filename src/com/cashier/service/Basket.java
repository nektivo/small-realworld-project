package com.cashier.service;

import com.cashier.model.MenuItem;

public class Basket {
  // default variable
  public int[] keranjang;

  // Call Class
  public static MenuItem menu;

  public Basket(MenuItem basket) {
    menu = basket;
    this.keranjang = new int[MenuService.index];
  }

  public static void buyItem(int choice, int quantity) {
    if (menu != null && MenuService.index >= 0 && MenuService.index < MenuItem.nameItem.length) {
      String item = MenuItem.nameItem[choice];
      int total = MenuItem.priceItem[choice] * quantity;
      System.out.println(quantity + " x " + item + " = Rp " + total);
      Payment.addPurchasedItem(choice, quantity);
    }
  }
}
