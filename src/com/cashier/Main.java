package com.cashier;

import java.util.Scanner;

public class Main {
    static Scanner inputUser = new Scanner(System.in);

    public static void main(String[] args) {
        Item menu = new Item(14);
        System.out.println("Selamat Datang Di Warkop 76");
        menu.tampilkanMenu(menu.namaItem, menu.hargaItem);
    }
}
