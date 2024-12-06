public class Praktikum_Progdas {
    public static void main(String[] args) {
        // Membuat objek BukuFiksi
        Modul6_Kel03 bukuFiksi = new BukuFiksi();
        bukuFiksi.setJudul("Pemograman Dasar");
        bukuFiksi.setPenulis("J.K. Rowling");
        bukuFiksi.setTahunTerbit(1997);

        // Membuat objek BukuNonFiksi</
        Modul6_Kel03 bukuNonFiksi = new BukuNonFiksi();
        bukuNonFiksi.setJudul("Fisika Dasar");
        bukuNonFiksi.setPenulis("Stephen");
        bukuNonFiksi.setTahunTerbit(2001);

        // Mencetak informasi BukuFiksi
        System.out.println("Buku Fiksi:");
        cetakInfoBuku(bukuFiksi);

        // Mencetak informasi BukuNonFiksi
        System.out.println("\nBuku Non-Fiksi:");
        cetakInfoBuku(bukuNonFiksi);
    }

    // Method untuk mencetak informasi buku
    private static void cetakInfoBuku(Modul6_Kel03 buku) {
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Penulis: " + buku.getPenulis());
        System.out.println("Tahun Terbit: " + buku.getTahunTerbit());
        System.out.println("Harga: Rp" + buku.hitungHarga());
    }
}