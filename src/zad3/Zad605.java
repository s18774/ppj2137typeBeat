package zad3;

import java.util.Random;
import java.util.Scanner;

public class Zad605 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Podaj dolny zakres przedziału A: ");
        int a = sc.nextInt();
        System.out.println("Podaj górny zakres przedziału B: ");
        int b = sc.nextInt();

        if (a<b && a>=0 && b>=0 && a<100 && b<100){
            int liczbaProb = 0;
            int wylosowanaLiczba;

            do {
                wylosowanaLiczba =random.nextInt(100);
                liczbaProb++;
            }while (wylosowanaLiczba < a || wylosowanaLiczba>b);
            System.out.println("wylosowana liczba to "+wylosowanaLiczba);
            System.out.println("ilosc nieudanych prób "+liczbaProb);
            sc.close();
        }else {
            System.out.println("wprowadzono nieprawidłowe dane");
        }
    }
}
