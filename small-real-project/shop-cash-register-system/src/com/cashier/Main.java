package com.cashier;

import com.cashier.service.*;
import com.cashier.ui.Console;

public class Main {
    public static void main(String[] args) {
        MenuService menu = new MenuService();
        Basket basket = new Basket();
        Console.start(menu, basket);
    }
}