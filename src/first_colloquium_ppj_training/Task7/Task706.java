package first_colloquium_ppj_training.Task7;
public class Task706 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 4, 3, 1};

        // Wyświetlenie wyniku
        System.out.println(sprawdzCzyPalindrom(tab));
    }

    // Metoda sprawdzająca, czy elementy tablicy czytane od początku do końca i od końca do początku są takie same
    private static boolean sprawdzCzyPalindrom(int[] tablica) {
        int dlugosc = tablica.length;

        // Porównanie elementów tablicy od początku do końca i od końca do początku
        for (int i = 0; i < dlugosc; i++) {
            if (tablica[i] != tablica[dlugosc - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
