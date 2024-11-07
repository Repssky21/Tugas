import java.util.Scanner;

public class tugas4inputoutput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("nama lengkap: ");
		String namaLengkap = input.nextLine();

		System.out.print("Repan: ");
		int Repan = input.nextInt();
		
		System.out.print("umur");
		int umur = input.nextInt();
		
		System.out.println("nama lengkap: " + namaLengkap);
		System.out.println("Repan: " + Repan);
		System.out.println("umur: " + umur + "tahun");
		input.close();

	}
}