package com.example;
import java.util.Scanner;

public class Percobaan3java_Kel03 {
    public static void main(String[] args) {
        String[][] array = {
                {"Ucok", "Rudi", "Joko", "Agus", "Budi"},
                {"Pemograman Dasar", "Kalkulus", "Bahasa Inggris", "Teknologi Informasi", "Kimia"}
        };
        System.out.println("Matkul kesukaan " + array [0][0] + " adalah " + array [1][0] + " dan " + array[1][2]);
        System.out.println("Matkul kesukaan " + array [0][1] + " adalah " + array [1][1] + " dan " + array[1][3]);
        System.out.println("Matkul kesukaan " + array [0][2] + " adalah " + array [1][4] + " dan " + array[1][1]);
        System.out.println("Matkul kesukaan " + array [0][3] + " adalah " + array [1][3] + " dan " + array[1][0]);
        System.out.println("Matkul kesukaan " + array [0][4] + " adalah " + array [1][2] + " dan " + array[1][4]);

    }
}
