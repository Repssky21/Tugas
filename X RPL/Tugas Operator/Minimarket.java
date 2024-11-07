import javax.swing.JOptionPane;

public class Minimarket {
    public static void main(String[] args) {
        // Jumlah awal barang
        int sirup = 5;
        int deterjen = 6;
        int mieInstan = 10;

        // Mengambil input dari pengguna untuk menambahkan barang
        String inputSirup = JOptionPane.showInputDialog("Masukkan jumlah sirup yang ingin ditambahkan:");
        String inputDeterjen = JOptionPane.showInputDialog("Masukkan jumlah deterjen yang ingin ditambahkan:");
        String inputMieInstan = JOptionPane.showInputDialog("Masukkan jumlah mie instan yang ingin ditambahkan:");

        // Mengonversi input ke dalam bentuk integer
        int tambahSirup = Integer.parseInt(inputSirup);
        int tambahDeterjen = Integer.parseInt(inputDeterjen);
        int tambahMieInstan = Integer.parseInt(inputMieInstan);

        // Menambahkan jumlah barang
        sirup += tambahSirup;
        deterjen += tambahDeterjen;
        mieInstan += tambahMieInstan;

        // Menampilkan hasil akhir jumlah barang
        String message = "Jumlah barang setelah penambahan:\n" +
                         "Sirup: " + sirup + "\n" +
                         "Deterjen: " + deterjen + "\n" +
                         "Mie Instan: " + mieInstan;
        
        JOptionPane.showMessageDialog(null, message);
    }
}