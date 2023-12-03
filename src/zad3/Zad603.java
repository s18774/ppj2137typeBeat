package zad3;

import java.util.Scanner;

public class Zad603 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("wprowadz swój numer studenta ");

        int studentNumber = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= studentNumber ; i++) {
            sum+=i;
        }

        System.out.println("suma liczb od 0 do "+studentNumber+" wynosi "+sum);
        sc.close();
    }
}
