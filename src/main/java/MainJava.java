import java.util.HashMap;
import java.util.Map;

public class MainJava {
    public static void main(String[] args) {
        int[] initialArray = {1, 3, 4, 5, 1, 5, 4};
        System.out.println(countNumbers(initialArray));
    }

    public static Map<Integer, Integer> countNumbers(int[] initialArray) {
        Map<Integer, Integer> numberToCount = new HashMap<>();

        for (int digit : initialArray) {
            Integer count = numberToCount.getOrDefault(digit, 0);
            count ++;
            numberToCount.put(digit, count);
        }
        return numberToCount;
    }
}