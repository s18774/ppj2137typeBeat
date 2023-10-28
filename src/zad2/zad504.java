package zad2;

import java.util.Scanner;

public class zad504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wprowadź miesiąc
        System.out.print("Wprowadź miesiąc (1-12): ");
        int month = scanner.nextInt();

        // Wprowadź rok
        System.out.print("Wprowadź rok: ");
        int year = scanner.nextInt();

        // Sprawdź liczbę dni w zadanym miesiącu i roku
        int daysInMonth = getDaysInMonth(month, year);

        if (daysInMonth != -1) {
            System.out.println("Miesiąc " + month + " w roku " + year + " ma " + daysInMonth + " dni.");
        } else {
            System.out.println("Nieprawidłowy miesiąc (podaj wartość od 1 do 12) lub rok.");
        }

        scanner.close();
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1; // Nieprawidłowy miesiąc
        }

        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    return 29; // Luty w roku przestępnym
                } else {
                    return 28; // Luty w roku zwykłym
                }
            case 11:
                return 30; // Kwiecień, czerwiec, wrzesień, listopad mają 30 dni
            default:
                return 31; // Pozostałe miesiące mają 31 dni
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

