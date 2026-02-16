package com.cashier;

public class Basket {
  int keranjang;
  int jumlahItem;
  double total;
  // Call Class Of Item
  private Item menu;

  public Basket(Item basket) {
    this.menu = basket;
  }

  public void input() {
    var check = true;
    while (check) {
      System.out.println("Continue shopping?");
      System.out.print("Input item name or 'done': ");

      String text = Main.inputUser.nextLine();

      if (text.equalsIgnoreCase("done")) {
        check = false;
        System.out.println("Thank you for shopping!");
      } else {
        // Proses input item
        System.out.print("Enter quantity: ");

        try {
          int jumlah = Main.inputUser.nextInt();
          Main.inputUser.nextLine();

          // Validasi jumlah
          if (jumlah > 0) {
            menu.addItem(text, jumlah);
            System.out.println(jumlah + " X " + text + " successfully added to cart");
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
}
// tentukan jumlah item
// tampilkan semua pembelian
// hitung total pembelian
// jenis pembayaran cash/qris
// cukup atau tidak, hitung kembalian
// tetapkan diskon jika > 10000 5% / 200000 10%