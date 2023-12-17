package secondColloqium.Task11;

public class Person {

    public String name;
    public String surname;
    public int birthyear;

    public Person(String name, String surname, int birthyear) {
        this.name = name;
        this.surname = surname;
        this.birthyear = birthyear;
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 1990);

        System.out.println("Imię: " + person.name);
        System.out.println("Nazwisko: " + person.surname);
        System.out.println("Rok urodzenia: " + person.birthyear);
    }
}
