package zad2;
import java.util.Scanner;

public class zad503 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź pojedynczy znak: ");
        char ch = scanner.next().charAt(0);

        if (isVowel(ch)) {
            System.out.println(ch + " to samogłoska.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " to spółgłoska.");
        } else {
            System.out.println(ch + " to inny znak (np. cyfra, znak specjalny).");
        }

        scanner.close();
    }

    public static boolean isVowel(char ch) {
        // Sprawdzamy, czy znak jest samogłoską (małymi i dużymi literami)
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
