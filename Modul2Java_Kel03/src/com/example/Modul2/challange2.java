package com.example.Modul2;
import java.util.Scanner;

public class challange2 {
    public static void main(String[] args) {
        String[] namaBulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        String[] jumlahHari = {
                "31 hari", "28 atau 29 hari", "31 hari", "30 hari", "31 hari",
                "30 hari", "31 hari", "31 hari", "30 hari", "31 hari", "30 hari", "31 hari"
        };

        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Nomor Bulan (1-12): ");
        int bulan = scan.nextInt();

        if (bulan >= 1 && bulan <= 12) {
            System.out.println(namaBulan[bulan - 1] + " memiliki " + jumlahHari[bulan - 1]);
        } else {
            System.out.println("Tidak ada yang dipilih/tidak valid");
        }
        System.out.println("ENJOY");
    }
}
