class MainGroovy {
    static void main(String[] args) {
        def initialArray = [1, 3, 4, 5, 1, 5, 4] as int[]
        println(countNumbers(initialArray))
    }

    static Map<Integer, Integer> countNumbers(int[] initialArray) {
        initialArray.toList().countBy {it}
    }
}