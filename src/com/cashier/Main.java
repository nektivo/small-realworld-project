package com.cashier;

import com.cashier.model.MenuItem;
import com.cashier.ui.Console;

public class Main {
    public static void main(String[] args) {
        MenuItem menu = new MenuItem(100);

        menu.listMenu();
        Console.displayMenu(MenuItem.nameItem, MenuItem.priceItem);
        Console.input();
    }
}
