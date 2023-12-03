package zad3;

import java.util.Scanner;

public class Zad604 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //wczytywanie od użytkownika dnia oraz miesiąca
        System.out.println("podaj dzień: ");
        int dzien = sc.nextInt();
        System.out.println("podaj miesiąc: ");
        int miesiac = sc.nextInt();

        //sprawdzamy poprawność wprowadzonych
        if (miesiac<1 || miesiac>12 || dzien<1 || dzien>31){
            System.out.println("podane daty sa nieprawidłowe ");
        }else {

            int[] dni_w_miesiacach={0,31,28,31,30,31,30,31,30,31,30,31};

            int dniOdPoczatkuRoku = 0;
            for (int i = 1; i <miesiac ; i++) {
                dniOdPoczatkuRoku+=dni_w_miesiacach[i];
            }
            dniOdPoczatkuRoku+=dzien;
            System.out.println("Liczba dni od poczatku roku do "+dzien+"."+miesiac+" wynosi: "+dniOdPoczatkuRoku);
            sc.close();
        }
    }
}
