import java.util.Scanner;

public class tugasop16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input nilai rata-rata dari pengguna
        System.out.print("Masukkan nilai rata-rata: ");
        double rataRata = scanner.nextDouble();
        
        // Menggunakan operator ternary untuk menentukan kenaikan kelas
        String status = (rataRata >= 75) ? "Naik Kelas" : "Tidak Naik Kelas";
        
        // Menampilkan hasil
        System.out.println("Status Kenaikan Kelas: " + status);
        
        // Menutup scanner
        scanner.close();
    }
}
