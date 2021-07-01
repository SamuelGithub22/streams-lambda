package fr.insee.java8exercises.streams;

import java.util.List;

public class OldestPerson {

    public static Person oldestPerson(List<Person> people) {
        Person oldestPerson = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

}
