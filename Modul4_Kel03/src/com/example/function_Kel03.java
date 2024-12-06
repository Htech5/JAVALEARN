package com.example;

public class function_Kel03 {
    //non return type dengan parameter
    static void cetakKelompok(String kelompok){
        System.out.println(kelompok);
    }

    //non return type tanpa parameter
    static void cetakHello(){
        System.out.println("Halo Praktikan Progdas 2024 ^^");
    }

    static void bilanganGenap(int n){
        for (int i = 0;i<=n;i+=2) {
            System.out.println(i);
        }
    }
    //return type dengan parameter
    static String returnParam(String text){
        return text;
    }

    //return type tanpa parameter
    static String returnText(){
        return "Hari ini kita akan belajar mengenai Function dan Method";
    }

    public static void main(String[] args) {
        //penggunaan function non return type dengan mengisi argument pada parameter kelompok
        cetakKelompok("Kelompok 03");

        //penggunaan function non return type tanpa parameter
        cetakHello();

        //penggunaan function return type dengan mengisi argument pada parameter
        System.out.println(returnParam("ini function dengan return"));

        //penggunaan function return type tanpa parameter
        System.out.println(returnText());

        bilanganGenap(10);

        System.out.println("________________________________________________________");
    }
}
