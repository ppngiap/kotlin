

fun main() {

fun irange() {
	for(i in 0..3) {             // 1
	    print(i)
	}
	print(" ")

	for(i in 2..8 step 2) {      // 2
	    print(i)
	}
	print(" ")

	for (i in 3 downTo 0) {      // 3
	    print(i)
	}
	print(" ")
}
irange()

fun crange() {

	for (c in 'a'..'d') {        // 1
	    print(c)
	}
	print(" ")

	for (c in 'z' downTo 's' step 2) { // 2
	    print(c)
	}
	print(" ")
}
crange()

fun notInRange() {

	val x = 2
	if (x in 1..10) {            // 1
	    print(x)
	}
	print(" ")

	if (x !in 1..4) {            // 2
	    print(x)
	}
}
notInRange()

}
