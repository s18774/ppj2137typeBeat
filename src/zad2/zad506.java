package zad2;

import java.util.Scanner;

public class zad506 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź liczbę uzyskanych punktów: ");
        double punkty = scanner.nextDouble();

        System.out.print("Wprowadź maksymalną liczbę punktów możliwych do uzyskania: ");
        double maxPunkty = scanner.nextDouble();

        double procent = (punkty / maxPunkty) * 100;

        String ocena = "";

        if (procent >= 87.5) {
            ocena = "5";
        } else if (procent >= 81.25) {
            ocena = "4.5";
        } else if (procent >= 75) {
            ocena = "4";
        } else if (procent >= 62.6) {
            ocena = "3.5";
        } else if (procent >= 50) {
            ocena = "3";
        } else {
            ocena = "2";
        }

        System.out.println("Twoja ocena to: " + ocena);

        scanner.close();
    }
}
