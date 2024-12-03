// To display a message on the screen

fun main() {
	println("Hello world")
}

// To declare a function

fun name(inputs) {
	//code
}

// Declare a variable
fun main() {
	val name:datatype = value
	var name:datatype = value
}

// Update a variable
fun main() {
    var cartTotal = 0
    println("Total: $cartTotal")

    cartTotal = 20
    println("Total: $cartTotal")
}
// Define and call functions
fun main() {
    birthdayGreeting()
}

fun birthdayGreeting() {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

// Return a value from a function
fun main() {
    println(birthdayGreeting())
}

fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

// Add a parameter to a function
fun main() {
    println(birthdayGreeting("Rover"))
}

fun birthdayGreeting(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
