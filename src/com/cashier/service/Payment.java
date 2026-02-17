package com.cashier.service;

import java.util.ArrayList;
import com.cashier.model.MenuItem;
import com.cashier.model.PurchasedItem;
import com.cashier.ui.Console;

public class Payment {
  public static ArrayList<PurchasedItem> purchasedItems = new ArrayList<>();

  public static void addPurchasedItem(int index, int quantity) {
    String name = MenuItem.nameItem[index];
    int price = MenuItem.priceItem[index];
    purchasedItems.add(new PurchasedItem(name, price, quantity));
  }

  public static void getDiskon(double total) {
    if (total >= 200_000) {
      diskon(total, 0.1);
      Console.jenisPembayaran(total);
    } else if (total >= 100_000) {
      diskon(total, 0.05);
      Console.jenisPembayaran(total);
    } else {
      System.out.println("Total harga : " + total);
      Console.jenisPembayaran(total);
    }
  }

  public static void diskon(double amount, double discount) {
    double diskon = amount * discount;
    double totalbayar = amount - diskon;
    System.out.println("\nTotal Harga : " + amount);
    System.out.println("Anda mendapat potongan harga " + discount + "% : " + (amount - diskon));
    System.out.println("Total pembayaran : " + totalbayar);
  }
}