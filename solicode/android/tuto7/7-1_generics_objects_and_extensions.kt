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
