fun main() {
	val authors = setOf("Shakespeare", "Hemingway", "Twain")
	val writers = setOf("Twain", "Shakespeare", "Hemingway")

	println(authors == writers)   // 1
	println(authors === writers)  // 2

	println(authors)
	println(writers)

	val a2 = authors.sorted()
	val w2 = writers.sorted()

	println(a2 == w2)
	println(a2 === w2)

	println(a2)
	println(w2)
}
