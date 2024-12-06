package com.example.Modul2;
import java.util.Scanner;

public class PercobaanSwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner deposit = new Scanner(System.in);
        System.out.println("Masukkan nilai deposit : ");
        System.out.println("Nilai Deposit yang anda masukkan adalah : " + deposit);
        int nilai = scan.nextInt();
        System.out.println("Masukkan lama tahun deposit :");
        int lama = deposit.nextInt();

        System.out.println("1. Menggunakan Kartu Atm");
        System.out.println("2. Menggunakan Kartu Kredit");
        System.out.println("3. Menggunakan Tunai");
        System.out.println("Pilih Metode pembayaran : ");
        switch (tirai){
            case "1" :System.out.println("Anda menggunakan kartu atm");
            break;
            case "2" :System.out.println("Anda menggunakan kartu kredit");
            break;
            case "3" :System.out.println("Anda menggunakan tunai");
            default: System.out.println("Anda tidak meimilih kartu");
            break;
        }
        System.out.println("ENJOY");
    }
}
