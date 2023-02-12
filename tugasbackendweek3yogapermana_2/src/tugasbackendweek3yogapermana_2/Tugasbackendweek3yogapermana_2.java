package tugasbackendweek3yogapermana_2;

import java.util.Scanner;


public class Tugasbackendweek3yogapermana_2 {
    public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      System.out.println("1. Luas Lingkaran");
      System.out.println("2. Volume Balok");
      System.out.print("Masukkan pilihan operasi: ");
      
      int pilihan = sc.nextInt();
      
      switch (pilihan) {
      
          case 1:
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = sc.nextDouble();
            double luas = 3.14 * jariJari * jariJari;
            System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah " + luas);
            break;
         
          case 2:
            System.out.print("Masukkan panjang balok: ");
            double panjang = sc.nextDouble();
            System.out.print("Masukkan lebar balok: ");
            double lebar = sc.nextDouble();
            System.out.print("Masukkan tinggi balok: ");
            double tinggi = sc.nextDouble();
            double volume = panjang * lebar * tinggi;
            System.out.println("Volume balok dengan panjang " + panjang + ", lebar " + lebar + " dan tinggi " + tinggi + " adalah " + volume);
            break;
         default:
            System.out.println("Pilihan tidak valid");
            break;
      }
      sc.close();
   }
}
    

    

