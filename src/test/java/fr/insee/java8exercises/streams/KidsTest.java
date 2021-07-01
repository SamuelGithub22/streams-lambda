package fr.insee.java8exercises.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static fr.insee.java8exercises.streams.Kids.kidsNames;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class KidsTest {

    @Test
    public void kidNameShouldReturnNamesOfYoungerThan18() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, viktor, anna);
        assertThat(kidsNames(collection))
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
    }

}
