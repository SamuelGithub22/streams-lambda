package fr.insee.java8exercises.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static fr.insee.java8exercises.streams.PeopleStats.calculateStats;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class PeopleStatsTest {

    Person sara = new Person("Sara", 4);

    Person viktor = new Person("Viktor", 40);

    Person eva = new Person("Eva", 42);

    List<Person> collection = asList(sara, eva, viktor);

    @Test
    public void calculateStatsShouldReturnAverageAge() {
        assertThat(calculateStats(collection).getAverage())
                .isEqualTo((double) (4 + 40 + 42) / 3);
    }

    @Test
    public void getStatsShouldReturnNumberOfPeople() {
        assertThat(calculateStats(collection).getCount())
                .isEqualTo(3);
    }

    @Test
    public void getStatsShouldReturnMaximumAge() {
        assertThat(calculateStats(collection).getMax())
                .isEqualTo(42);
    }

    @Test
    public void getStatsShouldReturnMinimumAge() {
        assertThat(calculateStats(collection).getMin())
                .isEqualTo(4);
    }

    @Test
    public void getStatsShouldReturnSumOfAllAges() {
        assertThat(calculateStats(collection).getSum())
                .isEqualTo(40 + 42 + 4);
    }

}
