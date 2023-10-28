package zad1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //zad 4.01
                String hexValue = "18774";
                System.out.println("liczba w zapisie hexadecymalnym: "+hexValue);

                // Tworzymy łańcuch na potrzeby przechowania postaci binarnej
                StringBuilder binaryValue = new StringBuilder();

                // Konwertujemy każdą cyfrę heksadecymalną na postać binarną i dodajemy do łańcucha
                for (int i = 0; i < hexValue.length(); i++) {
                    char hexDigit = hexValue.charAt(i);
                    int decimalValue = Integer.parseInt(String.valueOf(hexDigit), 16);
                    String binaryDigit = String.format("%4s", Integer.toBinaryString(decimalValue)).replace(' ', '0');
                    binaryValue.append(binaryDigit);

                    // Dodajemy symbol "_" po każdej grupie 4 bitów (poza ostatnią)
                    if (i < hexValue.length() - 1) {
                        binaryValue.append("_");
                    }
                }

                System.out.println("zapis binarny: "+binaryValue.toString());
    }
}