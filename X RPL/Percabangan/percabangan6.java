import java.util.Scanner;
public class percabangan6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input kode plat nomor
        System.out.print("Masukkan kode plat nomor (huruf): ");
        char kodePlat = input.nextLine().toUpperCase().charAt(0);
        
        // Menentukan nama kota berdasarkan kode plat
        String kota;
        switch (kodePlat) {
            case 'A':
                kota = "Bali";
                break;
            case 'B':
                kota = "Jakarta";
                break;
            case 'L':
                kota = "Bandung";
                break;
            case 'P':
                kota = "Jember, Banyuwangi, Bondowoso, Situbondo";
                break;
            case 'N':
                kota = "Malang";
                break;
            case 'M':
                kota = "Surabaya";
                break;
            // Tambahkan lebih banyak case sesuai kebutuhan
            default:
                kota = "Kode tidak dikenali";
        }
        
        // Output nama kota
        System.out.println("Kota untuk kode plat nomor '" + kodePlat + "' adalah: " + kota);
        
        input.close();
    }
}

