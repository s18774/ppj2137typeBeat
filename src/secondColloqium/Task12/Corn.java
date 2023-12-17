package secondColloqium.Task12;

import java.util.Random;

public class Corn {
    private int cornCount;

    public Corn(int cornCount) {
        this.cornCount = cornCount;
    }

    public Popcorn[] makePopcorn() {
        Random random = new Random();
        int numberOfPopcorn = random.nextInt(cornCount + 1); // Losowa liczba od 0 do cornCount
        Popcorn[] popcornArray = new Popcorn[numberOfPopcorn];

        for (int i = 0; i < numberOfPopcorn; i++) {
            popcornArray[i] = new Popcorn();
        }

        return popcornArray;
    }

    public static void main(String[] args) {
        // Przykład użycia klasy Corn
        Corn corn = new Corn(10);
        Popcorn[] popcorns = corn.makePopcorn();

        System.out.println("Przygotowano popcorn w ilości: " + popcorns.length);
    }
}

class Popcorn {
    // Klasa reprezentująca pojedynczy kawałek popcornu
}
