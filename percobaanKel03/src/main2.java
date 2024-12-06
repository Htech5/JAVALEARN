import strukturdata.linear.stack;
import java.util.Scanner;

public class main2 {

    // Instansiasi Stack dari class yang sudah dibuat dengan kapasitas 5
    private static stack screenStack = new stack(5);
    private static String currentScreen = "Main Menu";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayCurrentScreen();
            displayMenu();
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    navigateToScreen("Sub Menu 1");
                    break;
                case 2:
                    navigateToScreen("Sub Menu 2");
                    break;
                case 3:
                    navigateToScreen("Sub Menu 3");
                    break;
                case 4:
                    navigateToScreen("Sub Menu 4");
                    break;
                case 5:
                    goToPreviousScreen();
                    break;
                case 6:
                    exitApplication();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
// Fungsi buat menampilkan posisi layar saat ini
    private static void displayCurrentScreen() {
        System.out.println("\nCurrent Display: " + currentScreen);
    }

// Fungsi buat menampilkan opsi menu
    private static void displayMenu() {
        System.out.println("Pilih opsi:");
        System.out.println("1. Masuk ke Sub Menu 1");
        System.out.println("2. Masuk ke Sub Menu 2");
        System.out.println("3. Masuk ke Sub Menu 3");
        System.out.println("4. Masuk ke Sub Menu 4");
        System.out.println("5. Kembali ke layar sebelumnya (Prev)");
        System.out.println("6. Keluar"); System.out.print("Masukkan pilihan: ");
    }

    // Fungsi buat navigasi ke layar baru
    private static void navigateToScreen(String newScreen) {
// Ngecek apakah sekarang sudah berada di layar yang ingin dikunjungi
        if (currentScreen.equals(newScreen)) { System.out.println("\nAnda sudah berada di " + newScreen);
        } else if (screenStack.isFull()) {
            System.out.println("\nStack penuh! Tidak dapat menambahkan layar baru.");
        } else {
            screenStack.push(currentScreen);
            currentScreen = newScreen;
        }
    }

// Fungsi buat kembali ke layar sebelumnya
    private static void goToPreviousScreen() {
        if (!screenStack.isEmpty()) {
        currentScreen = (String) screenStack.pop();
    } else {
        System.out.println("\nTidak ada layar sebelumnya.");
    }
}

    private static void exitApplication() {
        System.out.println("\nKeluar dari aplikasi.");
    }
}