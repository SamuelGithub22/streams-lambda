package fr.insee.java8exercises.streams;

public class Person {

    private final String name;

    private final int age;

    private String nationality;

    public Person(final String nameValue, final int ageValue) {
        name = nameValue;
        age = ageValue;
    }

    public Person(final String nameValue, final int ageValue, final String nationalityValue) {
        name = nameValue;
        age = ageValue;
        nationality = nationalityValue;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

}