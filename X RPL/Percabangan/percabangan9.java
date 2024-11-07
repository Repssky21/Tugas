import java.util.Scanner;

public class percabangan9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dua angka dari pengguna
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        // Menentukan angka terbesar
        int angkaTerbesar = (angka1 > angka2) ? angka1 : angka2;
        System.out.println("Angka terbesar adalah: " + angkaTerbesar);

        // Menentukan ganjil atau genap
        if (angka1 % 2 == 0) {
            System.out.println(angka1 + " adalah bilangan genap.");
        } else {
            System.out.println(angka1 + " adalah bilangan ganjil.");
        }

        if (angka2 % 2 == 0) {
            System.out.println(angka2 + " adalah bilangan genap.");
        } else {
            System.out.println(angka2 + " adalah bilangan ganjil.");
        }

        // Menutup scanner
        scanner.close();
    }
}