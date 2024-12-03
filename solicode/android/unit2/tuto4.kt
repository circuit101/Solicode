// Use if statements
fun main() {
    val trafficLightColor = "Red"

    if (trafficLightColor == "Red") {
        println("Stop")
    } 
}

// Add else statements
fun main() {
    val trafficLightColor = "Green"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else {
        println("Go")
    }
}

// Add an else if branch
fun main() {
    val trafficLightColor = "Yellow"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else {
        println("Go")
    }
}

// When statements
fun main() {
    val trafficLightColor = "Yellow"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}

// Nullability
fun main() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
}

// Handle nullable variables
fun main() {
    var favoriteActor: String? = null
    println(favoriteActor?.length)
}

// Store a function in a variable
fun main() {
    val trickFunction = trick
}

fun trick() {
    println("No treats!")
}

// Use functions as data types
val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

fun main() {
    val trickFunction = trick
    trick()
    trickFunction()
    treat()
}

// Lambda
fun main() {
    val treatFunction = trickOrTreat(false, { "$it quarters" })
    val trickFunction = trickOrTreat(true, null)
    treatFunction()
    trickFunction()
}

// Use the repeat function
fun main() {
    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)
    repeat(4) {
        treatFunction()
    }
    trickFunction()
}
