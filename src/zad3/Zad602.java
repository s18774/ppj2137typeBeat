package zad3;
import java.util.Scanner;
public class Zad602 {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);

        int num;
        int sum=0;
        int reps=0;//ilosc liczb wpisanych przez użytkownika

        System.out.println("Wprowadzaj licby. Jeśli wprowadzisz 0 działanie programu zakończy się");

        do {
            System.out.println("wprowadz liczbę ");
            num =scaner.nextInt();

            if (num!=0){
                sum+=num;
                reps++;
            }
        }while (num!=0);
        System.out.println("ilość prób użytkownika "+reps);
        System.out.println("suma wprowadzonych liczb "+sum);
    }
}
