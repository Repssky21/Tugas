import java.util.Scanner;

public class tugasop15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input nilai a dan b dari pengguna
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();
        
        // Melakukan operasi left shift dan right shift
        int leftShift = a << 2; // Menggeser a ke kiri sebanyak 2 bit
        int rightShift = b >> 2; // Menggeser b ke kanan sebanyak 2 bit
        
        // Menampilkan hasil
        System.out.println("Hasil left shift a (a << 2): " + leftShift);
        System.out.println("Hasil right shift b (b >> 2): " + rightShift);
        
        // Menutup scanner
        scanner.close();
    }
}
