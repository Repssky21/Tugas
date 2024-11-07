import java.util.Scanner;
public class luassegitiga  {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Masukan alas segitiga:  ");
        Double alas = scanner.nextDouble();

        System.out.print("Masukan tinggi segitiga:  ");
        Double tinggi = scanner.nextDouble();

        double luas = 0.5  * alas * tinggi;
        System.out.println("Luas segitiga adalah: " + luas);




    }
    
}