
/**
 * UTSKasir
 */

import java.util.Scanner;

// Hikmah Aldrin Abdillah
// 2341720049 (GANJIL)
// TI 1F
// NO 14
// UTS Kasir Toko

public class UTSKasir {
  public static void main(String[] args) {
    Scanner inputSc = new Scanner(System.in);

    String namaBarang, jenisBarang;
    int jumlahBarang = 0;
    double hargaBayar, totalBayar;
    boolean isKantong;

    while (true) {
      jumlahBarang++;

      System.out.print("Jenis Barang : ");
      jenisBarang = inputSc.next();
      System.out.print("Nama Barang : ");
      inputSc.nextLine();
      namaBarang = inputSc.nextLine();
      System.out.print("Masukkan harga per barang : ");
      hargaBayar = inputSc.nextInt();
      totalBayar = jumlahBarang * hargaBayar;

      if (jenisBarang.equalsIgnoreCase("minuman") && jumlahBarang == 3) {
        System.out.println("Anda mendapatkan potongan sebesar 5%");
        totalBayar = totalBayar - (totalBayar * 0.05);
        break;
      }
    }

    System.out.println("apakah ingin beli kantong plastik ?");
    System.out.println("ketikkan true / false");
    isKantong = inputSc.nextBoolean();

    if (isKantong == true) {
      totalBayar += 200;
    }
    if (totalBayar >= 1000000) {
      System.out.println("terkena ppn sebanyak 7%");
      totalBayar = totalBayar - (totalBayar * 0.07);
    }
    System.out.println("================================");
    System.out.println("Total : " + totalBayar);

  }

}