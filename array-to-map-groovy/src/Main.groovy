static void main(String[] args) {
    def initialArray = [1, 3, 4, 5, 1, 5, 4]

    def numberToCount = [:]

    initialArray.each { digit ->
        numberToCount[digit] = (numberToCount[digit] ?: 0) + 1
    }

    println numberToCount
}