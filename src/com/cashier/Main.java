package com.cashier;

import java.util.Scanner;

public class Main {
    static Scanner inputUser = new Scanner(System.in);

    public static void main(String[] args) {
        Item menu = new Item(100);
        Basket user = new Basket(menu);
        Payment.menu = menu;

        menu.listMenu();
        menu.displayMenu(menu.nameItem, menu.priceItem);
        user.input();

    }
}
