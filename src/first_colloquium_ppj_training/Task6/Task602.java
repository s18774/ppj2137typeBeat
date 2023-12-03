package first_colloquium_ppj_training.Task6;

import java.util.Scanner;

public class Task602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean cond = true;
        int userInput;
        int numberOfAttempts=0;
        int sum=0;

        while (cond){
            System.out.print("jeśli wpiszesz 0 to działanie programu zakończy się");
            System.out.print(" podaj cyfrę: ");
            userInput=sc.nextInt();
            if (userInput==0){
                numberOfAttempts++;
                cond=false;
            }else {
                numberOfAttempts++;
                sum+=userInput;
            }
        }
        System.out.println("liczba wprowadzonych liczb: "+numberOfAttempts+ " suma wprowadzonych liczb:"+sum);

    }
}
