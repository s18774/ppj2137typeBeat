package zad1;

public class RandomClass {
    public static void main(String [] args){
        //zad 4.02
        int n = 5; // Liczba bitów w kodzie Greya
        int totalWords = (int) Math.pow(2, n); // Całkowita liczba słów kodowych

        int[] grayCodeSequence = new int[totalWords];

        // Inicjalizacja sekwencji kodu Greya
        for (int i = 0; i < totalWords; i++) {
            grayCodeSequence[i] = i ^ (i >> 1);
        }

        // Wyświetlenie sekwencji kodu Greya
        for (int i = 0; i < totalWords; i++) {
            String binaryValue = Integer.toBinaryString(grayCodeSequence[i]);
            while (binaryValue.length() < n) {
                binaryValue = "0" + binaryValue;
            }
            System.out.println(i + " - " + binaryValue);
        }
    }
}


