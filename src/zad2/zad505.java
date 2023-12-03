package zad2;

import java.util.Scanner;

public class zad505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();
        System.out.print("Wprowadź drugą liczbę: ");
        double liczba2 = scanner.nextDouble();

        if (Math.abs(liczba1 - liczba2) < 0.01) {
            System.out.println("Liczby są takie same z dokładnością do drugiego miejsca po przecinku.");
        } else {
            System.out.println("Liczby nie są takie same z dokładnością do drugiego miejsca po przecinku.");
        }

        scanner.close();
    }
}
