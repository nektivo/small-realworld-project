package com.cashier;

public class Basket {
  public int[] keranjang;
  // Call Class Of Item
  private Item menu;
  public Payment payment;

  public Basket(Item basket) {
    this.menu = basket;
    this.keranjang = new int[menu.index];
  }

  public void input() {
    var check = true;
    while (check) {
      System.out.println("\nContinue shopping?");
      System.out.print("Input item number or '0 to finish': ");

      int choiceMenu = Main.inputUser.nextInt();

      if (choiceMenu - 1 < 0) {
        check = false;
        System.out.println("\nThank you for shopping!");
        Payment.allItem();
      } else {
        // Proses input item
        System.out.print("Enter the amount : ");

        try {
          int quantity = Main.inputUser.nextInt();
          Main.inputUser.nextLine();
          buyItem(choiceMenu - 1, quantity);

          // Validasi quantity
          if (quantity > 0) {
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

  public void buyItem(int choice, int quantity) {
    if (menu != null && menu.index >= 0 && menu.index < menu.nameItem.length) {
      String item = menu.nameItem[choice];
      int total = menu.priceItem[choice] * quantity;
      System.out.println(quantity + " x " + item + " = Rp " + total);
      Payment.addPurchasedItem(choice, quantity);
    }
  }
}
