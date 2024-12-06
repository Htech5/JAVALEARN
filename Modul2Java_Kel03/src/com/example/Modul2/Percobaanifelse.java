package com.example.Modul2;
import java.util.Scanner;

public class Percobaanifelse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int a = scan.nextInt();
        if (a>0){
            System.out.println("Ini positif");
        }
        System.out.println("Selesai");
    }
}
