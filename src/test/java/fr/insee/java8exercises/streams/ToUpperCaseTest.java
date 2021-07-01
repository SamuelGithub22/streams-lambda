package fr.insee.java8exercises.streams;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static fr.insee.java8exercises.streams.ToUpperCase.toUpperCase;
import static org.assertj.core.api.Assertions.assertThat;

public class ToUpperCaseTest {

    public static Stream<Arguments> shouldConvertCollectionElementsToUpperCase() {
        return Stream.of(
                Arguments.of(List.of("My", "name", "is", "John", "Doe"), List.of("MY", "NAME", "IS", "JOHN", "DOE")),
                Arguments.of(List.of("a", "z", "e", "r", "t", "y"), List.of("A", "Z", "E", "R", "T", "Y")),
                Arguments.of(List.of("WXCVBN"), List.of("WXCVBN")),
                Arguments.of(List.of("1", "2", "3", "45", "67890"), List.of("1", "2", "3", "45", "67890")),
                Arguments.of(List.of(""), List.of("")),
                Arguments.of(List.of(), List.of())
        );
    }

    @ParameterizedTest
    @MethodSource
    public void shouldConvertCollectionElementsToUpperCase(List<String> collection, List<String> expected) {
        assertThat(toUpperCase(collection)).hasSameElementsAs(expected);
    }

}
