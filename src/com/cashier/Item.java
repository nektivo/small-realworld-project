package com.cashier;

public class Item {
  final int max = 14;
  String[] namaItem = new String[max];
  int[] hargaItem = new int[max];

  void daftarMenu() {
    // menu minuman
    namaItem[0] = "air putih";
    hargaItem[0] = 3_000;
    namaItem[1] = "es teh";
    hargaItem[1] = 4_000;
    namaItem[2] = "kopi hitam";
    hargaItem[2] = 5_000;
    namaItem[3] = "kopi susu";
    hargaItem[3] = 6_000;
    namaItem[4] = "hot chocolate";
    hargaItem[4] = 7_000;
    namaItem[5] = "es cappucino";
    hargaItem[5] = 5_000;
    namaItem[6] = "es jeruk";
    hargaItem[6] = 5_000;
    namaItem[7] = "susu jahe";
    hargaItem[7] = 8_000;

    // menu makanan
    namaItem[8] = "kentang goreng";
    hargaItem[8] = 9_000;
    namaItem[9] = "roti bakar";
    hargaItem[9] = 12_000;
    namaItem[10] = "pisang goreng";
    hargaItem[10] = 8_000;
    namaItem[11] = "indomie goreng";
    hargaItem[11] = 6_000;
    namaItem[12] = "indomie rebus";
    hargaItem[12] = 6_000;
    namaItem[13] = "sosis goreng";
    hargaItem[13] = 7_000;
    namaItem[14] = "pancong";
    hargaItem[14] = 13_000;
  }
}
