import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainJavaTest {

    @Test
    void countNumbersWithStandardInput() {
        int[] inputArray = {1, 3, 4, 5, 1, 5, 4};

        Map<Integer, Integer> result = MainJava.countNumbers(inputArray);
        assertEquals(4, result.size());
        assertEquals(result.get(1), 2);
        assertEquals(result.get(3), 1);
        assertEquals(result.get(4), 2);
        assertEquals(result.get(5), 2);
    }

    @Test
    void countNumbersWithEmptyArray() {
        int[] inputArray = {};

        Map<Integer, Integer> result = MainJava.countNumbers(inputArray);
        assertEquals(0, result.size());
    }

    @Test
    void countNumbersWithSingleElement() {
        int[] inputArray = {9};

        Map<Integer, Integer> result = MainJava.countNumbers(inputArray);
        assertEquals(1, result.size());
        assertEquals(result.get(9), 1);
    }

    @Test
    void countNumbersWithNegativeNumbers() {
        int[] inputArray = {-1, 2, -1, 0, -1, 2};

        Map<Integer, Integer> result = MainJava.countNumbers(inputArray);
        assertEquals(3, result.size());
        assertEquals(result.get(-1), 3);
        assertEquals(result.get(2), 2);
        assertEquals(result.get(0), 1);
    }
}
