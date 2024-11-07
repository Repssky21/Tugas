
    import javax.swing.JOptionPane;
    public  class tugasop {

    public static void main(String[] args) {
        // Jumlah awal barang di minimarket
        int sirup = 5;
        int deterjen = 6;
        int mieInstan = 10;

        // Menginput jumlah tambahan barang dari distributor
        String inputSirup = JOptionPane.showInputDialog("Masukkan jumlah tambahan sirup:");
        String inputDeterjen = JOptionPane.showInputDialog("Masukkan jumlah tambahan deterjen:");
        String inputMieInstan = JOptionPane.showInputDialog("Masukkan jumlah tambahan mie instan:");

        // Mengonversi input ke integer
        int tambahanSirup = Integer.parseInt(inputSirup);
        int tambahanDeterjen = Integer.parseInt(inputDeterjen);
        int tambahanMieInstan = Integer.parseInt(inputMieInstan);

        // Menambahkan jumlah barang dengan operator assignment
        sirup += tambahanSirup;
        deterjen += tambahanDeterjen;
        mieInstan += tambahanMieInstan;

        // Menampilkan jumlah akhir barang
        String message = "Jumlah akhir barang di minimarket:\n" +
                         "Sirup: " + sirup + "\n" +
                         "Deterjen: " + deterjen + "\n" +
                         "Mie Instan: " + mieInstan;

        JOptionPane.showMessageDialog(null, message);
    }

}
