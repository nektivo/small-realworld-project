package com.cashier.service;

import javax.swing.*;
import java.awt.*;

public class QrisFrame extends JFrame {

  public QrisFrame() {
    setTitle("QRIS Payment");
    setSize(400, 400);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    ImageIcon icon = new ImageIcon("src/com/cashier/resource/qris.jpg");
    Image img = icon.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(img);

    JLabel label = new JLabel(scaledIcon);
    label.setHorizontalAlignment(JLabel.CENTER);

    add(label);
  }
}