package com.cashier;

import java.util.Scanner;

public class Main {
    static Scanner inputUser = new Scanner(System.in);

    public static void main(String[] args) {
        Item menu = new Item(14);

        menu.listMenu();
        menu.tampilkanMenu(menu.namaItem, menu.hargaItem);
    }
}
