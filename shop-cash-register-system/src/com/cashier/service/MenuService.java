package com.cashier.service;

import java.util.ArrayList;
import com.cashier.model.MenuItem;

public class MenuService {
  private ArrayList<MenuItem> menu = new ArrayList<>();

  public MenuService() {
    menu.add(new MenuItem("air putih", 3000));
    menu.add(new MenuItem("es teh", 4000));
    menu.add(new MenuItem("kopi hitam", 5000));
    menu.add(new MenuItem("kopi susu", 6000));
    menu.add(new MenuItem("hot chocolate", 7000));
    menu.add(new MenuItem("es cappucino", 5000));
    menu.add(new MenuItem("es jeruk", 5000));
    menu.add(new MenuItem("susu jahe", 8000));
    menu.add(new MenuItem("kentang goreng", 9000));
    menu.add(new MenuItem("Sosis goreng", 8000));
    menu.add(new MenuItem("Indomie goreng", 6000));
    menu.add(new MenuItem("Indomie rebus", 6000));
    menu.add(new MenuItem("Pancong", 13000));
    menu.add(new MenuItem("Nasi Goreng", 13000));
  }

  public ArrayList<MenuItem> getMenu() {
    return menu;
  }

  public MenuItem getItem(int index) {
    return menu.get(index);
  }
}
