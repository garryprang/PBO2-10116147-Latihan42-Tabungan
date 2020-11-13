package pbo2.pkg10116147.latihan42.tabungan;

import java.util.Scanner;

/**
 * @author 
 * NAMA      : Garry Prang
 * KELAS     : PBO2
 * NIM       : 10116147
 * Deskripsi : Program untuk menarik uang dari tabungan.
 */

public class PBO210116147Latihan42Tabungan {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("========= PROGRAM PENARIKAN UANG =========");
       System.out.print("Masukkan saldo awal\t\t: ");
       Tabungan tabungan = new Tabungan(sc.nextInt());
       System.out.print("Jumlah uang yang diiambil\t: ");
       tabungan.ambilUang(sc.nextInt());
    }
    
}
