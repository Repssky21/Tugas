import java.util.Scanner;

public class percabangan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input total belanja
        System.out.print("Masukkan total belanja Anda: Rp. ");
        double totalBelanja = scanner.nextDouble();
        
        // Memeriksa apakah total belanja kurang dari Rp. 500.000
        if (totalBelanja < 500000) {
            double selisih = 500000 - totalBelanja;
            System.out.println("Belanja anda kurang dari Rp. 500.000. Silahkan tambah lagi belanjanya senilai Rp. " + selisih + ". Agar mendapatkan bonus gantungan kunci.");
        } else {
            System.out.println("Terima kasih telah berbelanja! Anda sudah memenuhi syarat untuk mendapatkan bonus gantungan kunci.");
        }
        
        scanner.close();
    }
}
