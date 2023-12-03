package first_colloquium_ppj_training.Task6;

import java.util.Scanner;

public class Task605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfAttempts=1;
        boolean cond1=true;
        boolean cond2=true;
        int kraniecA = 0;
        int kraniecB = 0;

        while (cond1){
            System.out.print("podaj początek przedziału A, pamiętając że A < B oraz a,b < 100: ");
            kraniecA = sc.nextInt();
            System.out.print("podaj koniec przedziału B zgodnie z powyższym warunkiem: ");
            kraniecB = sc.nextInt();
            if ((kraniecA>=kraniecB) || kraniecA>=100 || kraniecB > 101){
                System.out.println("niepoprawne wartości przedziałów");
            }else {
                cond1=false;
            }
        }


        int generatedNumber = 0;
        while (cond2){
            generatedNumber = (int)(Math.random()*100);
            if (generatedNumber>=kraniecA && generatedNumber<=kraniecB){
                System.out.println("wylosowana liczba to: "+generatedNumber+" i znajduje się ona w przedziale ["+kraniecA+", "+kraniecB+"]");
                cond2=false;
            }else {
                System.out.println("Wylosowana liczba to " +generatedNumber+" znajduje się ona poza przedzialem ["+kraniecA+", "+kraniecB+"]");
                numOfAttempts++;
            }

        }
        System.out.println("liczba prób: "+numOfAttempts+" wylosowana ostatecznie liczba: "+generatedNumber+" przedzial ["+kraniecA+", "+kraniecB+"]" );
    }
}
