package secondColloqium.Task12;

import java.util.Arrays;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name) {
        this(name, 1990);
    }

    public String getName() {
        return name;
    }

    public int getAge(int currentYear) {
        return currentYear - birthYear;
    }

    public static Person getOlder(Person person1, Person person2) {
        return (person1.birthYear < person2.birthYear) ? person1 : person2;
    }

    public static Person getOldest(Person[] people) {
        if (people.length == 0) {
            return null;
        }

        Person oldestPerson = people[0];
        for (int i = 1; i < people.length; i++) {
            oldestPerson = getOlder(oldestPerson, people[i]);
        }
        return oldestPerson;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 1980);
        Person person2 = new Person("Alice", 1995);
        Person person3 = new Person("Bob", 1975);
        Person person4 = new Person("Eva", 1988);

        Person[] peopleArray = {person1, person2, person3, person4};

        System.out.println("Name of person1: " + person1.getName());
        System.out.println("Age of person2: " + person2.getAge(2023));

        Person olderPerson = Person.getOlder(person3, person4);
        System.out.println("Older person between person3 and person4: " + olderPerson.getName());

        Person oldestPerson = Person.getOldest(peopleArray);
        System.out.println("Oldest person in the array: " + oldestPerson.getName());

        sortPeopleArrayByAge(peopleArray, 2023);

        System.out.println("\nSorted array by age:");
        for (Person person : peopleArray) {
            System.out.println(person.getName() + " - Age: " + person.getAge(2023));
        }
    }

    private static void sortPeopleArrayByAge(Person[] people, int currentYear) {
        Arrays.sort(people, (p1, p2) -> p1.getAge(currentYear) - p2.getAge(currentYear));
    }
}
