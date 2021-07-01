package fr.insee.java8exercises.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static fr.insee.java8exercises.streams.Sum.calculateSum;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Sum all elements of a collection
 */
public class SumTest {

    @Test
    public void calculateSumShouldReturnSumOfAllIntegersInCollection() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(calculateSum(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

}
