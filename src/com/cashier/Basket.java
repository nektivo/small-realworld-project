package com.cashier;

public class Basket {
  // Call Class Of Item
  private Item menu;

  public Basket(Item basket) {
    this.menu = basket;
  }

  public void input() {
    var check = true;
    while (check) {
      System.out.println("Continue shopping?");
      System.out.print("Input item number or '0 to finish': ");

      int choiceMenu = Main.inputUser.nextInt();

      if (choiceMenu - 1 < 0) {
        check = false;
        System.out.println("Thank you for shopping!");
      } else {
        // Proses input item
        System.out.print("Input your quantity : ");

        try {
          int jumlah = Main.inputUser.nextInt();
          Main.inputUser.nextLine();
          buyItem(choiceMenu - 1, jumlah);

          // Validasi jumlah
          if (jumlah > 0) {
            System.out.println("successfully added to cart");
          } else {
            System.out.println("Quantity must be positive!");
          }
        } catch (Exception e) {
          System.out.println("Invalid input! Please enter a number");
          Main.inputUser.nextLine();
        }
      }
    }
  }

  public void buyItem(int choice, int jumlah) {
    if (menu != null && menu.index >= 0 && menu.index < menu.nameItem.length) {
      String item = menu.nameItem[choice];
      int total = menu.priceItem[choice] * jumlah;
      System.out.println(jumlah + " x " + item + " = Rp " + total);
    }
  }
}

// tampilkan semua pembelian
// hitung total pembelian
// jenis pembayaran cash/qris
// cukup atau tidak, hitung kembalian
// tetapkan diskon jika > 10000 5% / 200000 10%