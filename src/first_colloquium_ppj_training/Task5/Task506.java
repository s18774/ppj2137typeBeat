package first_colloquium_ppj_training.Task5;

import java.util.Scanner;

public class Task506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cond = true;
        double userPkt = 0;
        double maxPkt = 0;
        //pętla która nie puści nas jeśli źle są wprowadzone dane
        while (cond) {
            System.out.print("Podaj maxymalna możliwą liczbę punktów do uzyskania: ");
            maxPkt = sc.nextDouble();
            System.out.print("Podaj liczbę uzyskanych przez siebie pkt: ");
            userPkt = sc.nextDouble();

            if (maxPkt < userPkt) {
                System.out.println("liczba uzyskanych pky nie może być większa od maxymalnej liczby pkt do zdobycia");
            } else {
                cond = false;
            }
        }

        double tempUserPktPercentage = userPkt * 100;
        double pktPercentage = tempUserPktPercentage / maxPkt;
        //sprawdzimy sobie czy pkt wgle wchodzi w próg zaliczenia tj: 50% na ocene 3
        if (pktPercentage >= 87.5) {
            System.out.println("Przedmiot zaliczony na ocene 5, twoj procent punktów to: " + pktPercentage + "%");
        } else if (pktPercentage >= 81.25) {
            System.out.println("Przedmiot zaliczony na ocene 4.5, twoj procent punktów to: " + pktPercentage + "%");
        } else if (pktPercentage >= 75) {
            System.out.println("Przedmiot zaliczony na ocene 4, twoj procent punktów to: " + pktPercentage + "%");
        } else if (pktPercentage >= 62.6) {
            System.out.println("Przedmiot zaliczony na ocene 3.5, twoj procent punktów to: " + pktPercentage + "%");
        } else if (pktPercentage >= 50.) {
            System.out.println("Przedmiot zaliczony na ocene 3, twoj procent punktów to: " + pktPercentage + "%");
        } else {
            System.out.println("Przedmiot nie zaliczony");
        }
    }
}
