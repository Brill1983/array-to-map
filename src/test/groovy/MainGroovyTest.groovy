import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals

class MainGroovyTest {

    @Test
    void countNumbersWithStandardInput() {
        def inputArray = [1, 3, 4, 5, 1, 5, 4] as int[]

        Map<Integer, Integer> result = MainGroovy.countNumbers(inputArray)
        assertEquals(4, result.size())
        assertEquals(result.get(1), 2)
        assertEquals(result.get(3), 1)
        assertEquals(result.get(4), 2)
        assertEquals(result.get(5), 2)
    }

    @Test
    void countNumbersWithEmptyArray() {
        def inputArray = [] as int[]

        Map<Integer, Integer> result = MainGroovy.countNumbers(inputArray)
        assertEquals(0, result.size())
    }

    @Test
    void countNumbersWithSingleElement() {
        def inputArray = [9] as int[]

        Map<Integer, Integer> result = MainGroovy.countNumbers(inputArray)
        assertEquals(1, result.size())
        assertEquals(result.get(9), 1)
    }

    @Test
    void countNumbersWithNegativeNumbers() {
        def inputArray = [-1, 2, -1, 0, -1, 2] as int[]

        Map<Integer, Integer> result = MainGroovy.countNumbers(inputArray)
        assertEquals(3, result.size())
        assertEquals(result.get(-1), 3)
        assertEquals(result.get(2), 2)
        assertEquals(result.get(0), 1)
    }
}
