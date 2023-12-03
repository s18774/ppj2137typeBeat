package first_colloquium_ppj_training.Task7;
import java.util.Scanner;
public class Task701 {
    public static void main(String[] args) {
        //Wczytaj z klawiatury wartość liczbową całkowitą i przechowaj ją
        // w zmiennej n. Następnie napisz program, który w sąsiadujących kolumnach
        // przedstawi drugą, trzecią i czwartą potęgę dla wartości od 1 do n.
        Scanner scanner = new Scanner(System.in);

        // Wczytanie wartości liczbowej całkowitej od użytkownika
        System.out.print("Podaj wartość liczbową całkowitą n: ");
        int n = scanner.nextInt();

        // Wyświetlenie nagłówka
        System.out.println("Liczba Kwadrat Sześcian Czwórka");

        // Obliczenia i wyświetlanie potęg dla wartości od 1 do n
        for (int i = 1; i <= n; i++) {
            int kwadrat = i * i;
            int szescian = i * i * i;
            int czworka = i * i * i * i;

            // Wyświetlenie wyników w odpowiednich kolumnach
            System.out.println( i+"    "+ kwadrat+"    "+ szescian+"    "+ czworka);
        }

        scanner.close();
    }
}
