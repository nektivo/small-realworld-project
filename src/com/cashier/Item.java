package com.cashier;

public class Item {
  private int max;
  public int index;
  public String[] namaItem;
  public int[] hargaItem;

  // constructor
  public Item(int storage) {
    this.max = storage;
    this.namaItem = new String[max];
    this.hargaItem = new int[max];
    this.index = 0;
  }

  public void tampilkanMenu(String[] nama, int[] harga) {
    System.out.println("Selamat Datang Di Warkop 76");
    System.out.println("\nNo.  Nama Menu        Harga    ");
    System.out.println("----------------------------");
    for (int i = 0; i < nama.length; i++) {
      if (namaItem[i] != null) {
        System.out.printf("%-3d. %-15s %6d\n", (i + 1), namaItem[i], hargaItem[i]);
      } else {
        int sisaSlot = max - index;
        System.out.println("----------------------------");
        System.out.println("Sisa slot menu : " + sisaSlot);
        return;
      }
    }
  }

  public void tambahItem(String nama, int harga) {
    if (index < max) {
      this.namaItem[index] = nama;
      this.hargaItem[index] = harga;
      index++;
    } else if (index == max + 1) {
      System.out.println("Menu sudah penuh!");
    }
  }

  public void listMenu() {
    // menu minuman
    tambahItem("air putih", 3_000);
    tambahItem("es teh", 4_000);
    tambahItem("kopi hitam", 5_000);
    tambahItem("kopi susu", 6_000);
    tambahItem("hot chocolate", 7_000);
    tambahItem("es cappucino", 5_000);
    tambahItem("es jeruk", 5_000);
    tambahItem("susu jahe", 8_000);
    // menu makanan
    tambahItem("kentang goreng", 9_000);
    tambahItem("roti bakar", 12_000);
    tambahItem("pisang goreng", 8_000);
    tambahItem("indomie goreng", 6_000);
    tambahItem("indomie rebus", 6_000);
    tambahItem("sosis goreng", 7_000);
    tambahItem("pancong", 13_000);
  }
}