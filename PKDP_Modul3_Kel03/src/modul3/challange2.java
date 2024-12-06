package modul3;

public class challange2 {
    public static void main(String[] args) {
        String kalimat = "Budi sedang minum kopi di pagi hari";
        String[] kataTotal = kalimat.split(" ");
        int total = 0;
        for (String kata : kataTotal){
            System.out.println("Kata " + kata + " memiliki " + kata.length() + " huruf " );
            total += kata.length();
        }
        System.out.println("Total huruf : " + total);
    }
}
