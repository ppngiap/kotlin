fun main() {
	val numbers = listOf( listOf(1, 2, 3), listOf(4, 5, 6))                        // 1

	val flatmap  = numbers.flatMap { listOf(it, it, it)} 

	println(flatmap)	
}
