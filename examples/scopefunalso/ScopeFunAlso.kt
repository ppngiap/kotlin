
data class Person (val name: String, val age : Int, val about : String)

fun main() {
    val jake = Person("Jake", 30, "Android Developer")                                     // 1
	.also {
	    println(it);
	}
}
