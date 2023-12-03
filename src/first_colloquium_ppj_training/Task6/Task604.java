package first_colloquium_ppj_training.Task6;

import java.util.Scanner;

public class Task604 {
    public static void main(String[] args) {
        int currentYear = 2023;

        Scanner sc = new Scanner(System.in);
        System.out.print("podaj miesiąc: ");
        int month = sc.nextInt();
        System.out.print("podaj dzień: ");
        int day = sc.nextInt();
        int numberOfdays=0;

        int[] monthsTabRegular = {0,31, 28, 31, 30, 31, 30, 31,31,30,31,30,31};
        int[] leapYearDays = {0,31, 29, 31, 30, 31, 30, 31,31,30,31,30,31};

        if (isLeapYear(currentYear)){
            for (int i = 0; i <month ; i++) {
                numberOfdays+=leapYearDays[i];
            }
            numberOfdays+=day;
        }else {
            for (int i = 0; i <month ; i++) {
                numberOfdays+=monthsTabRegular[i];
            }
            numberOfdays+=day;
        }

        System.out.println("od początku roku: "+currentYear+" do: dd/mm: "+day+"/"+month+" minęło: "+numberOfdays+" dni");


    }
    public static boolean isLeapYear(int year){
        if ((year%4==0&&year%100!=0)||(year%400==0)){
            return true;
        }else {
            return false;
        }
    }
}
