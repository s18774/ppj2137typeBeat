package secondColloqium.Task11;

public class Car {


    private double fuelLevel;


    public Car(double initialFuelLevel) {
        this.fuelLevel = initialFuelLevel;
    }


    public static void drive(Car car, int distance) {

        if (car.hasEnoughFuel(distance)) {
            car.startEngine();
            System.out.println("Samochód wystartował! Możesz przejechać " + distance + " km.");
        } else {
            System.out.println("Brak wystarczającej ilości paliwa. Tankuj!");
        }
    }

    private boolean hasEnoughFuel(int distance) {
        double fuelNeeded = distance / 10.;
        return fuelLevel >= fuelNeeded;
    }

    private void startEngine() {
    }

    public static void main(String[] args) {
        Car myCar1 = new Car(30.0);

        drive(myCar1, 100);
    }
}
