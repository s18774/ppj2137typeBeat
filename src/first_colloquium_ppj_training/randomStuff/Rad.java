package first_colloquium_ppj_training.randomStuff;

import java.util.Scanner;

public class Rad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie wartości n od użytkownika
        System.out.print("Podaj wartość n: ");
        int n = scanner.nextInt();
        int iloczyn = 0;
        // Zewnętrzna pętla odpowiedzialna za iteracje od 1 do n
        for (int i = 1; i <= n; i++) {
            // Inicjalizacja iloczynu dla bieżącej iteracji

            iloczyn += i;


            // Wyświetlenie wyniku dla bieżącej iteracji
        }
        System.out.println("suma od 1 do " + n + ": " + iloczyn);

        scanner.close();
    }
}
