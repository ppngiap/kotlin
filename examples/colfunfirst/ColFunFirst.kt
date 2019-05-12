fun main() {
	val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
	println(numbers)

	val first = numbers.first()                          // 2
	val last = numbers.last()                            // 3
	println(first)
	println(last)

	val firstEven = numbers.first { it % 2 == 0 }        // 4
	val lastOdd = numbers.last { it % 2 != 0 }           // 5
	println(firstEven)
	println(lastOdd)

	val notExist = numbers.first {it == 20}
	print(notExist)
}
