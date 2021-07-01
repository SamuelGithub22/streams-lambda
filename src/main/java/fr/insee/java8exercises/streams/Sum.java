package fr.insee.java8exercises.streams;

import java.util.List;

public class Sum {

    private Sum() {
    }

    public static int calculateSum(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

}
