package fr.insee.java8exercises.streams;

import java.util.ArrayList;
import java.util.List;

public class FilterCollection {

    private FilterCollection() {
    }

    public static List<String> stringsShorterThant4Characters(List<String> collection) {
        List<String> newCollection = new ArrayList<>();
        for (String element : collection) {
            if (element.length() < 4) {
                newCollection.add(element);
            }
        }
        return newCollection;
    }

}
