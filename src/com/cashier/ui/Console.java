package com.cashier.ui;

import java.util.Scanner;
import com.cashier.service.MenuService;
import com.cashier.service.Basket;

public class Console {
  static Scanner inputUser = new Scanner(System.in);

  // Display Menu
  public static void displayMenu(String[] name, int[] price) {
    System.out.println("   WELCOME TO WARKOP 76      ");
    System.out.println("\nNo.  Name Menu        Price    ");
    System.out.println("----------------------------");

    for (int i = 0; i < name.length; i++) {
      // Check if the array item name is null (empty)
      if (MenuService.nameItem[i] != null) {
        if (i == 0) {
          System.out.printf("\n%5s \n", "Drinks Menu");
        }
        if (i == 8) {
          System.out.printf("\n%5s \n", "Foods Menu");
        }
        System.out.printf("%-3d. %-15s %6d\n", (i + 1), MenuService.nameItem[i], MenuService.priceItem[i]);
      } else {
        System.out.println("----------------------------");
        return;
      }
    }
  }

  public static void input() {
    var check = true;
    while (check)
      System.out.println("\nContinue shopping?");
    System.out.print("Input item number or '0 to finish': ");
    int choiceMenu = inputUser.nextInt();

    if (choiceMenu < MenuService.index) {

      if (choiceMenu - 1 < 0) {
        check = false;
        MenuService.allItem();
      } else {

        // Proses input item
        System.out.print("Enter the amount : ");

        try {
          int quantity = inputUser.nextInt();
          inputUser.nextLine();
          Basket.buyItem(choiceMenu - 1, quantity);

          // Validasi quantity
          if (quantity > 0) {
            System.out.println("successfully added to cart");
          } else {
            System.out.println("Quantity must be positive!");
          }
        } catch (Exception e) {
          System.out.println("Invalid input! Please enter a number");
          inputUser.nextLine();
        }
      }
    } else {
      System.out.println("Over Number");
    }
  }

  public static void jenisPembayaran(double amount) {
    boolean check = true;
    inputUser.nextLine();

    while (check) {
      System.out.print("\nPilih Jenis Pembayaran (Cash/Qris): ");
      String inputChoice = inputUser.nextLine();

      if (inputChoice.equalsIgnoreCase("cash")) {
        System.out.print("Masukkan nominal pembayaran : ");
        int inputAmount = inputUser.nextInt();
        inputUser.nextLine();

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