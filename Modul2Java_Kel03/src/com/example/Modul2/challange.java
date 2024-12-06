package com.example.Modul2;
import java.util.Scanner;

public class challange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Jam Tidur");
        int jam = scan.nextInt();
        if(jam>=10){
            System.out.println("Anda tidur berlebihan");
        }
        else if(jam>=8){
            System.out.println("Anda tidur sehat");
        }
        else if(jam>=6){
            System.out.println("Anda cukup tidur");
        }
        else if(jam>=4){
            System.out.println("Anda kurang tidur");
        }
        else{
            System.out.println("Anda sangat kurang tidur");
        }
    }
}
