import java.util.Scanner;

public class percabangan8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();
        
        // Menentukan bilangan ganjil atau genap untuk angka pertama
        if (angka1 % 2 == 0) {
            System.out.println(angka1 + " adalah bilangan genap.");
        } else {
            System.out.println(angka1 + " adalah bilangan ganjil.");
        }
        
        // Menentukan bilangan ganjil atau genap untuk angka kedua
        if (angka2 % 2 == 0) {
            System.out.println(angka2 + " adalah bilangan genap.");
        } else {
            System.out.println(angka2 + " adalah bilangan ganjil.");
        }
        
        // Menutup scanner
        scanner.close();
    }
}