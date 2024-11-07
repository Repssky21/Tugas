import java.util.Scanner;

public class percabangan7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();
        
        // Menentukan angka terbesar
        if (angka1 > angka2) {
            System.out.println("Angka terbesar adalah: " + angka1);
        } else if (angka2 > angka1) {
            System.out.println("Angka terbesar adalah: " + angka2);
        } else {
            System.out.println("Kedua angka sama.");
        }
        
        // Menutup scanner
        scanner.close();
    }
}