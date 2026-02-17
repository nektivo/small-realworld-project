package com.cashier;

import java.util.ArrayList;

class PurchasedItem {
  String name;
  int pricePerItem;
  int quantity;
  int total;

  public PurchasedItem(String name, int pricePerItem, int quantity) {
    this.name = name;
    this.pricePerItem = pricePerItem;
    this.quantity = quantity;
    this.total = pricePerItem * quantity;
  }
}

public class Payment {
  public static Item menu;
  private static ArrayList<PurchasedItem> purchasedItems = new ArrayList<>();

  public static void addPurchasedItem(int index, int quantity) {
    String name = menu.nameItem[index];
    int price = menu.priceItem[index];
    purchasedItems.add(new PurchasedItem(name, price, quantity));
  }

  public static void allItem() {
    if (!purchasedItems.isEmpty()) {
      int result = 0;
      System.out.println("Daftar item yang telah dibeli:");
      for (PurchasedItem i : purchasedItems) {
        System.out.println(i.quantity + " x " + i.name + " = Rp " + i.total);
        result += i.total;
      }
      System.out.println("Total harga : " + result);
    } else {
      System.out.println("You haven't added any items yet");
    }
  }
}

// jenis pembayaran cash/qris
// cukup atau tidak, hitung kembalian
// tetapkan diskon jika > 10000 5% / 200000 10%