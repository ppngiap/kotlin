fun main() {
	fun customPrint(s: String?) {
		println("CustomPrint $s")
	}

	val empty = "test".let {               // 1
	    customPrint(it)                    // 2
	    it.isEmpty()                       // 3
	}
	println(" is empty: $empty")


	fun printNonNull(str: String?) {
	    println("Printing \"$str\":")

	    str?.let {                         // 4
		print("\t")
		customPrint(it)
		println()
	    }
	}
	printNonNull(null)
	printNonNull("my string") 
}

