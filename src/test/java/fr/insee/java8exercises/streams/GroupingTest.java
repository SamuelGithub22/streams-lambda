package fr.insee.java8exercises.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static fr.insee.java8exercises.streams.Grouping.groupByNationality;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class GroupingTest {

    @Test
    public void personsShouldBeSeparatedByNationality() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = asList(sara, eva, viktor);
        Map<String, List<Person>> result = groupByNationality(collection);
        assertThat(result.get("Norwegian")).hasSameElementsAs(asList(sara, eva));
        assertThat(result.get("Serbian")).hasSameElementsAs(asList(viktor));
    }

}
