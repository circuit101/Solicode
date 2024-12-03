//Generics
class Question<T>(
    //Properties
    val questionText: String,
    val answer: T,
    val difficulty: String
)

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", "medium")
    val question2 = Question<Boolean>("The sky is green. True or false?", false, "easy")
    val question3 = Question<Int>("How many days are there between full moons?", 28, "hard")

    println("Question 1: ${question1.questionText} (Answer: ${question1.answer}, Difficulty: ${question1.difficulty})")
    println("Question 2: ${question2.questionText} (Answer: ${question2.answer}, Difficulty: ${question2.difficulty})")
    println("Question 3: ${question3.questionText} (Answer: ${question3.answer}, Difficulty: ${question3.difficulty})")
}

//Enum and singleton object
class Question<T>(
    // Properties
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty {
    EASY, MEDIUM, HARD
}

class Quiz {
    // Companion object to hold student progress
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
        
        // Extension property to get the progress text
        val progressText: String
            get() = "$answered of $total answered"
            
        fun printProgressBar() {
            repeat(Quiz.answered) { print("▓") }
            repeat(Quiz.total - Quiz.answered) { print("▒") }
	    println()
	    println(Quiz.progressText)
        }    
    }

    // Questions
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
}

fun main() {
    Quiz.printProgressBar()
}


//Data class
data class Question<T>(
    //Properties
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty {
    EASY, MEDIUM, HARD
}

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    println(question1.toString())
}

// Arrays
fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    
    val solarSystem = rockPlanets + gasPlanets
    
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])
    
    println("---")
    solarSystem[3] = "Little Earth"
    println(solarSystem[3])
    
    println("---")
    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    println(newSolarSystem[8])
}

//Lists
fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    
    println(solarSystem.size) 
    
    println("---")
    println(solarSystem[2])
    println(solarSystem.get(3))
    
    println("---")
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))
    
    println("---")
    for (planet in solarSystem) {
    println(planet)
	}
}

// Mutable_Lists
fun main() {
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    
    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")
    
    solarSystem[3] = "Future Moon"
    
    println(solarSystem[3])
	println(solarSystem[9])
    
    solarSystem.removeAt(9)
    solarSystem.remove("Future Moon")
    
    println("---")
    println(solarSystem.contains("Pluto"))
    println("Future Moon" in solarSystem)
}

// Sets
fun main() {
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    
    println(solarSystem.size)
    
    println("---")
    solarSystem.add("Pluto")
    println(solarSystem.size)
    
    println("---")
    println(solarSystem.contains("Pluto"))
    
    println("---")
    solarSystem.add("Pluto")
    println(solarSystem.size)
    
    println("---")
    solarSystem.remove("Pluto")
    println(solarSystem.size)
	println(solarSystem.contains("Pluto"))
}

// Map collection
fun main() {
   val solarSystem = mutableMapOf(
    "Mercury" to 0,
    "Venus" to 0,
    "Earth" to 1,
    "Mars" to 2,
    "Jupiter" to 79,
    "Saturn" to 82,
    "Uranus" to 27,
    "Neptune" to 14,
    "Pluto" to 9
	)
   
   println(solarSystem.size)
   
   println("---")
   println(solarSystem["Pluto"])
   
   println("---")
   println(solarSystem.get("Theia"))
   
   println("---")
   solarSystem.remove("Pluto")
   println(solarSystem.size)
   
   println("---")
   solarSystem["Jupiter"] = 78
   println(solarSystem["Jupiter"])
}

// Higher order functions with collections
class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

// Foreach()
fun main() {
    cookies.forEach {
        println("Menu item: ${it.name}")
    }
}

// Map()
fun main() {
    val fullMenu = cookies.map {
    "${it.name} - $${it.price}"
	}
    
    println("Full menu:")
	fullMenu.forEach {
    	println(it)
	}
}

// Filter()
fun main() {
	val softBakedMenu = cookies.filter {
    	it.softBaked
	}
    
    println("Soft cookies:")
	softBakedMenu.forEach {
    	println("${it.name} - $${it.price}")
	}
}

// groupBy()
fun main() {
	val groupedMenu = cookies.groupBy { it.softBaked }
    
    val softBakedMenu = groupedMenu[true] ?: listOf()
	val crunchyMenu = groupedMenu[false] ?: listOf()
    
    println("Soft cookies:")
	softBakedMenu.forEach {
    	println("${it.name} - $${it.price}")
	}
	println("Crunchy cookies:")
	crunchyMenu.forEach {
    	println("${it.name} - $${it.price}")
	}
}

// fold()
fun main() {
    val totalPrice = cookies.fold(0.0) {total, cookie -> 
    	total + cookie.price
	}
    println("Total price: ${totalPrice}")
}

// sortedBy()
fun main() {
    val alphabeticalMenu = cookies.sortedBy {
    	it.name
	}
    
    println("Alphabetical menu:")
	alphabeticalMenu.forEach {
    	println(it.name)
	}
}
