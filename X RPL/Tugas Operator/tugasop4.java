public class tugasop4 {
        public static void main(String[] args) {
            // Nilai siswa
            int nilaiSiswa1 = 80;
            int nilaiSiswa2 = 95;
            int nilaiSiswa3 = 75;
    
            // Menghitung total nilai
            int totalNilai = 0; // Inisialisasi total nilai
            totalNilai += nilaiSiswa1; // Menambahkan nilai siswa 1
            totalNilai += nilaiSiswa2; // Menambahkan nilai siswa 2
            totalNilai += nilaiSiswa3; // Menambahkan nilai siswa 3
    
            // Menghitung rata-rata nilai
            double rataRataNilai = totalNilai / 3.0; // Membagi total dengan jumlah siswa
    
            // Menampilkan hasil
            System.out.println("Total nilai: " + totalNilai);
            System.out.println("Rata-rata nilai: " + rataRataNilai);
        }
    }
