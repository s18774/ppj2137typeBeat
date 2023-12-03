package first_colloquium_ppj_training.Task7;
import java.util.Scanner;
public class Task703 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą naturalną: ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <n; j++) {
                if ((i==j) || (i+j == (n-1))){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
