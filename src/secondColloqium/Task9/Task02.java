package secondColloqium.Task9;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        char[] charArray = new char[5];
        Random random = new Random();

        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) ('A' + random.nextInt(26));
        }
        System.out.print("tablica na samym początku  ");
        for (char element : charArray) {
            System.out.print(" " + element);
        }
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Wprowadź znak: ");
        char c = in.next().charAt(0);

        int occurrences = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                occurrences++;
                charArray[i] = '0'; // Zastąp wystąpienie wartością 0
            }
        }

        System.out.println("Ilość wystąpień znaku '" + c + "': " + occurrences);

        System.out.print("Tablica po zastąpieniu:");
        for (char element : charArray) {
            System.out.print(" " + element);
        }

        boolean allZeros = true;
        for (char element : charArray) {
            if (element != '0') {
                allZeros = false;
                break;
            }
        }

        if (allZeros) {
            System.out.println("\nTablica jest wypełniona samymi zerami. Koniec programu.");
            in.close();
            System.exit(0);
        }
    }
}
