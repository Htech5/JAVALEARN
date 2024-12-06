package com;
import java.util.Scanner;
public class examplePercobaan1Java_Kel03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama: ");
        String nama = input.next();

        System.out.println("Usia Tahun Ini: ");
        int umur = input.nextInt();

        System.out.println("Halo " + nama + ", lahir tahun " + (2024 - umur));
    }
}
