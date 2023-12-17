package secondColloqium.Task11;

import java.util.Random;

public class Fruit {

    private String name;
    private double weight;

    public Fruit(String name) {
        this.name = name;
        this.weight = generateRandomWeight();
    }

    private double generateRandomWeight() {
        Random random = new Random();
        return 0.5 + 0.3 * random.nextDouble();
    }

    public void show() {
        System.out.println("Owoc: " + name);
        System.out.println("Waga: " + weight + " kg");
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("Jabłko");

        apple.show();
    }
}
