package com.example;

import java.util.Scanner;

public class Percobaan2java_Kel03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] siswa = new String[4];

        System.out.println("Siswa pertama: ");
        siswa[0] = input.nextLine();

        System.out.println("Siswa kedua: ");
        siswa[1] = input.nextLine();

        System.out.println("Siswa ketiga: ");
        siswa[2] = input.nextLine();

        System.out.println("Siswa keempat: ");
        siswa[3] = input.nextLine();

        System.out.println();

        System.out.println("Nama-nama siswa: ");
        System.out.println(siswa[0]+", "+siswa[1]+", "+siswa[2]+", "+siswa[3]);
        System.out.print("Nama siswa ketiga: ");
        System.out.println(siswa[2]);
        System.out.print("Nama siswa pertama: ");
        System.out.println(siswa[0]);
        System.out.print("Nama siswa keempat: ");
        System.out.println(siswa[3]);
        System.out.print("Nama siswa kedua: ");
        System.out.println(siswa[1]);
   }
}
