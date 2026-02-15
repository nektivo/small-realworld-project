package com.cashier;

public class Item {
  private int max;
  public String[] namaItem;
  public int[] hargaItem;

  // constructor
  public Item(int storage) {
    this.max = storage;
    this.namaItem = new String[max];
    this.hargaItem = new int[max];
  }

  public void tampilkanMenu(String[] nama, int[] harga) {
    for (int i = 0; i <= nama.length; i++) {
      if (nama[i] != null) {
        System.out.println((i + 1) + ". " + nama[i] + harga[i]);
      }
    }
  }

  public void tambahItem(int nomer, String nama, int harga) {
    if (nomer >= 0 && nomer < max) {
      this.namaItem[nomer] = nama;
      this.hargaItem[nomer] = harga;
    }
  }

  public void listMenu() {
    // menu minuman
    tambahItem(0, "air putih", 3_000);
    tambahItem(1, "es teh", 4_000);
    tambahItem(2, "kopi hitam", 5_000);
    tambahItem(3, "kopi susu", 6_000);
    tambahItem(4, "hot chocolate", 7_000);
    tambahItem(5, "es cappucino", 5_000);
    tambahItem(6, "es jeruk", 5_000);
    tambahItem(7, "susu jahe", 8_000);
    // menu makanan
    tambahItem(8, "kentang goreng", 9_000);
    tambahItem(9, "roti bakar", 12_000);
    tambahItem(10, "pisang goreng", 8_000);
    tambahItem(11, "indomie goreng", 6_000);
    tambahItem(12, "indomie rebus", 6_000);
    tambahItem(13, "sosis goreng", 7_000);
    tambahItem(14, "pancong", 13_000);
  }
}