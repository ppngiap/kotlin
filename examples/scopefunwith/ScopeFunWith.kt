data class Configuration(val host : String, val port : Int)

fun main() {
	val configuration = Configuration("google", 80)

	with(configuration) {
	    println("$host:$port")
	}

	// instead of:
	println("${configuration.host}:${configuration.port}")  
}
