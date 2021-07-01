package fr.insee.java8exercises.streams;

import java.util.ArrayList;
import java.util.List;

public class ToUpperCase {

    private ToUpperCase() {
    }

    public static List<String> toUpperCase(List<String> collection) {
        List<String> newCollection = new ArrayList<>();
        for (String element : collection) {
            newCollection.add(element.toUpperCase());
        }
        return newCollection;
    }

}
