package com.example.Modul2;

import java.util.Scanner;

public class Percobaanif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("MASUKKAN NILAI UJIAN : ");
        int a = scan.nextInt();
        if (a>0){
            System.out.println("Nilai yang dimasukkan adalah : " + a + ", Anda remedi");
        } else {
            System.out.println("Nilai yang dimasukkan adalah : " + a + ", Anda lulus");
        }
    }
}
