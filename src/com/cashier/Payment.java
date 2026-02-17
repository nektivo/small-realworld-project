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
      double result = 0;
      System.out.println("Daftar item yang telah dibeli:");
      for (PurchasedItem i : purchasedItems) {
        System.out.println(i.quantity + " x " + i.name + " = Rp " + i.total);
        result += i.total;
      }
      getDiskon(result);
    } else {
      System.out.println("You haven't added any items yet");
    }
  }

  public static void diskon(double amount, double discount) {
    double diskon = amount * discount;
    double totalbayar = amount - diskon;
    System.out.println("\nTotal Harga : " + amount);
    System.out.println("Anda mendapat potongan harga " + discount + "% : " + (amount - diskon));
    System.out.println("Total pembayaran : " + totalbayar);

  }

  public static void getDiskon(double total) {
    if (total >= 200_000) {
      diskon(total, 0.1);
      jenisPembayaran(total);
    } else if (total >= 100_000) {
      diskon(total, 0.05);
      jenisPembayaran(total);
    } else {
      System.out.println("Total harga : " + total);
      jenisPembayaran(total);
    }
  }

  public static void jenisPembayaran(double amount) {
    boolean check = true;
    Main.inputUser.nextLine();
    while (check) {
      System.out.print("\nPilih Jenis Pembayaran (Cash/Qris): ");
      String inputChoice = Main.inputUser.nextLine();

      if (inputChoice.equalsIgnoreCase("cash")) {
        System.out.print("Masukkan nominal pembayaran : ");
        int inputAmount = Main.inputUser.nextInt();
        Main.inputUser.nextLine();

        if (inputAmount < amount) {
          System.out.println("Saldo tidak cukup!");
        } else {

          if (inputAmount > amount) {
            double kembalian = inputAmount - amount;
            System.out.println("Saldo kembali : " + kembalian);
          }
          System.out.println("Pembayaran Berhasil");
          System.out.println("\nThank you for shopping!");
          check = false;
        }
      } else if (inputChoice.equalsIgnoreCase("qris")) {
        // menampilkan foto qris
        System.out.println("Pembayaran melalui QRIS diproses.");
        System.out.println("Pembayaran Berhasil");
        System.out.println("\nThank you for shopping!");
        check = false;
      } else {
        System.out.println("Pilihan tidak valid. Silakan masukkan Cash atau Qris.");
      }
    }
  }
}