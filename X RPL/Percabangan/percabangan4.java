
    import java.util.Scanner;

public class percabangan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input merk celana
        System.out.print("Masukkan merk celana (ABC/DEF): ");
        String merk = scanner.nextLine().toUpperCase();

        // Input ukuran celana
        System.out.print("Masukkan ukuran celana (26-34): ");
        int ukuran = scanner.nextInt();

        // Menentukan harga berdasarkan merk dan ukuran
        int harga = 0;

        if (merk.equals("ABC")) {
            if (ukuran >= 26 && ukuran <= 30) {
                harga = 160000;
            } else if (ukuran >= 31 && ukuran <= 34) {
                harga = 180000;
            } else {
                System.out.println("Ukuran tidak valid untuk merk ABC.");
            }
        } else if (merk.equals("DEF")) {
            if (ukuran >= 26 && ukuran <= 30) {
                harga = 210000;
            } else if (ukuran >= 31 && ukuran <= 34) {
                harga = 220000;
            } else {
                System.out.println("Ukuran tidak valid untuk merk DEF.");
            }
        } else {
            System.out.println("Merk tidak valid.");
        }

        // Menampilkan harga jika valid
        if (harga > 0) {
            System.out.println("Harga celana " + merk + " ukuran " + ukuran + " adalah Rp. " + harga);
        }

        scanner.close();
    }
}