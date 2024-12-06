package com.example.Modul2;
import java.util.Scanner;

public class Percobaanifelseifelse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Warna : ");
        String warna = scan.nextLine();
        if (warna.equalsIgnoreCase("Hitam")) {
            System.out.println("Anda suka warna " + warna);
        }
        else if (warna.equalsIgnoreCase("Putih")) {
            System.out.println("Anda suka warna putih :3 ");
        }
        else if (warna.equalsIgnoreCase("Rainbow")) {
            System.out.println("Anda Unik");
        }
        else {
            System.out.println("Anda Bukan Golongan Kami");
        }
    }
}
