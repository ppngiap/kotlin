fun main() {

	val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

	val anyNegative = numbers.any( { it < 0 } )            // 2

	val anyGT6 = numbers.any { it > 6 }                  // 3

	println(numbers)
	println(anyNegative)
	println(anyGT6)
}
