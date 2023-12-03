package secondColloqium.Task9;

public class Task01 {
    public static void main(String[] args) {
        char[] charArray = {'z', 'g', 'c'};


        int minIndex = 0;

        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] < charArray[minIndex]) {
                minIndex = i;
            }
        }

        // Wyświetl wynik
        System.out.println("Indeks elementu o najmniejszej wartości: " + minIndex);
    }
}
