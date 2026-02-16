package com.cashier;

public class Item {
  // default variable
  private int max;
  public int index;
  public String[] nameItem;
  public int[] priceItem;

  // Constructor of Item
  public Item(int storage) {
    this.max = storage;
    this.nameItem = new String[max];
    this.priceItem = new int[max];
    this.index = 0;
  }

  // Display Menu
  public void displayMenu(String[] name, int[] price) {
    System.out.println("   WELCOME TO WARKOP 76      ");
    System.out.println("\nNo.  Name Menu        Price    ");
    System.out.println("----------------------------");

    for (int i = 0; i < name.length; i++) {
      // Check if the array item name is null (empty)
      if (nameItem[i] != null) {
        if (nameItem[i] == nameItem[0]) {
          System.out.printf("\n%5s \n", "Drinks Menu");
        }
        if (nameItem[i] == nameItem[8]) {
          System.out.printf("\n%5s \n", "Foods Menu");
        }
        System.out.printf("%-3d. %-15s %6d\n", (i + 1), nameItem[i], priceItem[i]);
      } else {

        // Calculate how many slots are left
        System.out.println("----------------------------");
        return;
      }
    }
  }

  // Add new Item
  public void addItem(String name, int price) {
    if (index < max) {
      this.nameItem[index] = name;
      this.priceItem[index] = price;
      index++;

      // Check whether the index exceeds the maximum value
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