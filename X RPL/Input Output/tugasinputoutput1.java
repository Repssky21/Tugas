import java.util.Scanner;
public class tugasinputoutput1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // menerima inputan
        System.out.println("Masukkan nama Anda : ");
        String nama = input.nextLine();

        System.out.println("inputan usia");
        int  angka = input.nextInt();

        System.out.println("tinggi badan");
        double tinggi = input.nextDouble();

        System.err.println("asal kota");
        String kota = input.nextLine();
 
        System.err.println("\n====== output ======");
        System.err.println("Nama  : " + nama);
        System.err.println("Usia   : " + angka);
        System.err.println("Tinggi Badan  : " + tinggi);
        System.err.println("Asal Kota   : " + kota);

    
    }
}
