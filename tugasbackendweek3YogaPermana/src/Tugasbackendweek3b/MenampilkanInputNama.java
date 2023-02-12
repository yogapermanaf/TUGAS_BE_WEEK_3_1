package Tugasbackendweek3b;
import java.util.Scanner;

public class MenampilkanInputNama {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = sc.nextLine();
        System.out.println("Selamat datang di bootcamp Kawah Edukasi, " + nama);
        
    }
}
