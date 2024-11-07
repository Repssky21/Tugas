import java.util.Scanner;
public class tugasinputoutput2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan jenis  kelamin (L/P) : ");
        String jenisKelamin = input.next();

        System.out.print("Masukan nomor sepatu: ");
        int nomorSepatu = input.nextInt();

        input.nextLine(); // membersihkan  buffer

        System.out.print("Apakah sudah menikah  (true/false) : ");
        boolean sudahMenikah = input.nextBoolean();  


        System.out.println("\nBiodata anda: ");
        System.out.println("Jenis kelamin: "  + jenisKelamin);
        System.out.println("Nomor sepatu: "  + nomorSepatu);
        System.out.println("Sudah menikah : "  + sudahMenikah);

        input.close();

    }
}