package pbo2.pkg10116147.latihan42.tabungan;

/**
 * @author 
 * NAMA      : Garry Prang
 * KELAS     : PBO2
 * NIM       : 10116147
 * Deskripsi : Program untuk menarik uang dari tabungan.
 */

public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo)
    {
         this.saldo = saldo;
    }
    public void ambilUang(int jumlah)
    {
        saldo -= jumlah;
        System.out.println("Saldo anda sekarang\t\t: "+saldo);
    }
}
