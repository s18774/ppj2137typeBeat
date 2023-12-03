package first_colloquium_ppj_training.Task7;
import java.util.Random;

public class Task705 {
    public static void main(String[] args) {
        // Deklaracja i inicjalizacja tablicy double o rozmiarze 10
        double[] tablica = new double[10];

        // Wypełnienie tablicy losowymi liczbami
        wypelnijTabliceLosowymi(tablica);

        // Wyświetlenie zawartości całej tablicy
        System.out.println("Zawartość całej tablicy:");
        wyswietlTablice(tablica);

        // Wyświetlenie liczb o parzystym indeksie
        System.out.println("\nLiczby o parzystym indeksie:");
        wyswietlLiczbyParzysteIndeks(tablica);

        // Wyświetlenie elementów tablicy, których przekonwertowane na int wartości są nieparzyste
        System.out.println("\nElementy tablicy, których wartości (jako int) są nieparzyste:");
        wyswietlNieparzysteWartosci(tablica);
    }

    // Metoda do wypełniania tablicy losowymi liczbami
    private static void wypelnijTabliceLosowymi(double[] tablica) {
        Random rand = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextDouble() * 100; // Losowe liczby z zakresu 0-100
        }
    }

    // Metoda do wyświetlania zawartości tablicy
    private static void wyswietlTablice(double[] tablica) {
        for (double element : tablica) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Metoda do wyświetlania liczb o parzystym indeksie
    private static void wyswietlLiczbyParzysteIndeks(double[] tablica) {
        for (int i = 0; i < tablica.length; i += 2) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }

    // Metoda do wyświetlania elementów tablicy, których przekonwertowane na int wartości są nieparzyste
    private static void wyswietlNieparzysteWartosci(double[] tablica) {
        for (double element : tablica) {
            int wartoscJakoInt = (int) element;
            if (wartoscJakoInt % 2 != 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
}
