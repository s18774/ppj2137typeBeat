package first_colloquium_ppj_training.Task5;

import java.util.Scanner;

public class Task503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("wpisz jeden znak aby sprawdzić czy jest on samogłoską czy spółgłoską ");
        char userInput = sc.next().charAt(0);

        if (userInput == 'a' || userInput == 'ą' ||userInput == 'e' ||userInput == 'ę'||userInput == 'i'||userInput == 'o'||userInput == 'ó'||userInput == 'u'||userInput == 'y'){
            System.out.println("podany znak "+userInput+" jest samogłoską");
        }else {
            System.out.println("znak jest spółgłoską");
        }
    }
}
