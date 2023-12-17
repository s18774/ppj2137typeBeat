package secondColloqium.Task11;

public class Person2 {

    public String name;
    public String surname;
    public int birthyear;

    public Person2(String name, String surname, int birthyear) {
        this.name = name;
        this.surname = surname;
        this.birthyear = birthyear;
    }

    public void introduceYourself() {
        System.out.println("Cześć! Jestem " + this.name + " " + this.surname + ".");
        System.out.println("Urodziłem/łam się w roku " + this.birthyear + ".");
    }

    public static void main(String[] args) {
        Person2 person1 = new Person2("Anna", "Kowalska", 1990);
        Person2 person2 = new Person2("Jan", "Nowak", 1985);
        Person2 person3 = new Person2("Maria", "Wiśniewska", 2000);

        person1.introduceYourself();
        System.out.println();

        person2.introduceYourself();
        System.out.println();

        person3.introduceYourself();
    }
}
