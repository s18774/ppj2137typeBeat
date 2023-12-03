package first_colloquium_ppj_training.Task6;

import java.util.Scanner;

public class Task603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("podaj nr studenta : ");
        int nrStudenta = sc.nextInt();
        int sum=0;
        for (int i = 0; i <=nrStudenta ; i++) {
            sum+=i;
        }
        System.out.println("suma liczb od 0 do nr studenta: "+nrStudenta+" wynosi: "+sum);
    }
}
