package com.cashier.model;

public class MenuItem {
  // default variable
  private int max;
  public int index;
  public static String[] nameItem;
  public static int[] priceItem;

  // Constructor
  public MenuItem(int storage) {
    this.max = storage;
    nameItem = new String[max];
    priceItem = new int[max];
    this.index = 0;
  }

  // Add new Item
  public void addItem(String name, int price) {
    if (index < max) {
      nameItem[index] = name;
      priceItem[index] = price;
      index++;
    } else if (index == max + 1) {
      System.out.println("Menu sudah penuh!");
    }
  }

  public void listMenu() {
    // Drinks Menu
    addItem("air putih", 3_000);
    addItem("es teh", 4_000);
    addItem("kopi hitam", 5_000);
    addItem("kopi susu", 6_000);
    addItem("hot chocolate", 7_000);
    addItem("es cappucino", 5_000);
    addItem("es jeruk", 5_000);
    addItem("susu jahe", 8_000);
    // Foods Menu
    addItem("kentang goreng", 9_000);
    addItem("roti bakar", 12_000);
    addItem("pisang goreng", 8_000);
    addItem("indomie goreng", 6_000);
    addItem("indomie rebus", 6_000);
    addItem("sosis goreng", 7_000);
    addItem("pancong", 13_000);
  }
}