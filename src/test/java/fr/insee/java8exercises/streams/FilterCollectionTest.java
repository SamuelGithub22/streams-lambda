package fr.insee.java8exercises.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static fr.insee.java8exercises.streams.FilterCollection.stringsShorterThant4Characters;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FilterCollectionTest {

    @Test
    public void transformKeepStringsShorterThant4Characters() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertThat(stringsShorterThant4Characters(collection)).hasSameElementsAs(expected);
    }

}
