import java.util.Scanner;
public class percabangan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input nilai angka
        System.out.print("Masukkan nilai angka (0 - 100): ");
        int nilaiAngka = scanner.nextInt();
        
        // Menentukan nilai huruf berdasarkan rentang nilai
        char nilaiHuruf;
        
        if (nilaiAngka >= 81 && nilaiAngka <= 100) {
            nilaiHuruf = 'A';
        } else if (nilaiAngka >= 71 && nilaiAngka <= 80) {
            nilaiHuruf = 'B';
        } else if (nilaiAngka >= 51 && nilaiAngka <= 70) {
            nilaiHuruf = 'C';
        } else if (nilaiAngka >= 21 && nilaiAngka <= 50) {
            nilaiHuruf = 'D';
        } else if (nilaiAngka >= 0 && nilaiAngka <= 20) {
            nilaiHuruf = 'E';
        } else {
            System.out.println("Nilai yang dimasukkan tidak valid. Harus antara 0 - 100.");
            scanner.close();
            return; // Keluar dari program jika nilai tidak valid
        }
        
        // Menampilkan hasil konversi
        System.out.println("Nilai huruf Anda adalah: " + nilaiHuruf);
        
        scanner.close();
    }
}