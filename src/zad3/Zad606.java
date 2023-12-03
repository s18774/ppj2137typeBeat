package zad3;

import java.util.Scanner;

public class Zad606 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę naturalną dodtnią ");
        long liczba = sc.nextLong();
        sc.close();

        long najwiekszyDzielnikPierwszy = znajdzDzielnikPierwszy(liczba);
        System.out.println(najwiekszyDzielnikPierwszy);
    }

    private static long znajdzDzielnikPierwszy(long n) {
        if (n<=1){
            return 1;
        }
        long dzielnik = 2;
        while (n>1){
            if (n%dzielnik==0){
                n/=dzielnik;
            }else {
                dzielnik++;
            }
        }
        return dzielnik;
    }
}
