import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] initialArray = {1, 3, 4, 5, 1, 5, 4};

        Map<Integer, Integer> numberToCount = new HashMap<>();

        for (int digit : initialArray) {
            Integer count = numberToCount.getOrDefault(digit, 0);
            count ++;
            numberToCount.put(digit, count);
        }
        System.out.println(numberToCount);
    }
}