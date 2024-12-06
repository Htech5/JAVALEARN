public abstract class Modul6_Kel03 {
    private String judul;
    private String penulis;
    private int tahunTerbit;

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahunTerbit(int tahun) {
        this.tahunTerbit = tahun;
    }


    public String getJudul(){
        return judul;
    }

    public String getPenulis(){
        return penulis;
    }

    public int getTahunTerbit(){
        return tahunTerbit;
    }

    public abstract double hitungHarga();
    }

class BukuFiksi extends Modul6_Kel03 {
    @Override
    public double hitungHarga() {
        return 50000;
    }
}


class BukuNonFiksi extends Modul6_Kel03 {
    @Override
    public double hitungHarga() {
        return 75000;
    }
} 