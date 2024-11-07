import java.util.Scanner;

    public class percabangan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input angka dari pengguna
        System.out.print("Masukkan angka (1-7): ");
        int angka = scanner.nextInt();

        // Menentukan nama hari berdasarkan input
        String namaHari;

        switch (angka) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
                namaHari = "Jum’at";
                break;
            case 7:
                namaHari = "Sabtu";
                break;
            default:
                namaHari = "Angka tidak valid. Silakan masukkan angka antara 1 dan 7.";
        }

        // Menampilkan hasil
        System.out.println(namaHari);

        scanner.close();
    }
}

