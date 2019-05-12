fun main() {
	val numbers = listOf(1, -2, 3, -4, 5, -6)                // 1

	val evenOdd = numbers.partition { it % 2 == 0 }           // 2
	val (positives, negatives) = numbers.partition { it > 0 } // 3

	println(evenOdd)
	println(positives)
	println(negatives)
}
