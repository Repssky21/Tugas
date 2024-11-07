import java.util.Scanner;
public class tugasinputoutput3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input
        // jenis kelamin
        System.out.print("jenis kelamin: ");
        char jeniskelamin = input.nextLine ().charAt(0);

        System.out.print("Nomor Sepatu: ");
        int nomorSepatu = input.nextInt();

        System.out.print("Sudah Menikah: ");
        boolean sudahMenikah = input.nextBoolean();
        
        System.err.println("Jenis Kelamin  : " + jeniskelamin);
        System.err.println("Nomor Sepatu   : " + nomorSepatu);
        System.err.println("Sudah Menikah : " + sudahMenikah);
        

    }
}
