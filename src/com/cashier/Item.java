package com.cashier;

public class Item {
  // default variable
  private int max;
  public int index;
  public String[] namaItem;
  public int[] hargaItem;

  // Constructor of Item
  public Item(int storage) {
    this.max = storage;
    this.namaItem = new String[max];
    this.hargaItem = new int[max];
    this.index = 0;
  }

  // Display Menu
  public void tampilkanMenu(String[] nama, int[] harga) {
    System.out.println("Selamat Datang Di Warkop 76");
    System.out.println("\nNo.  Nama Menu        Harga    ");
    System.out.println("----------------------------");

    for (int i = 0; i < nama.length; i++) {
      // Check if the array item name is null (empty)
      if (namaItem[i] != null) {
        if (namaItem[i] == namaItem[0]) {
          System.out.println("--- Drinks Menu");
        }
        if (namaItem[i] == namaItem[8]) {
          System.out.println("--- Foods Menu");
        }
        System.out.printf("%-3d. %-15s %6d\n", (i + 1), namaItem[i], hargaItem[i]);
      } else {

        // Calculate how many slots are left
        System.out.println("----------------------------");
        return;
      }
    }
  }

  // Add new Item
  public void tambahItem(String nama, int harga) {
    if (index < max) {
      this.namaItem[index] = nama;
      this.hargaItem[index] = harga;
      index++;

      // Check whether the index exceeds the maximum value
    } else if (index == max + 1) {
      System.out.println("Menu sudah penuh!");
    }
  }

  public void listMenu() {
    // Drinks Menu
    tambahItem("air putih", 3_000);
    tambahItem("es teh", 4_000);
    tambahItem("kopi hitam", 5_000);
    tambahItem("kopi susu", 6_000);
    tambahItem("hot chocolate", 7_000);
    tambahItem("es cappucino", 5_000);
    tambahItem("es jeruk", 5_000);
    tambahItem("susu jahe", 8_000);
    // Foods Menu
    tambahItem("kentang goreng", 9_000);
    tambahItem("roti bakar", 12_000);
    tambahItem("pisang goreng", 8_000);
    tambahItem("indomie goreng", 6_000);
    tambahItem("indomie rebus", 6_000);
    tambahItem("sosis goreng", 7_000);
    tambahItem("pancong", 13_000);
  }
}