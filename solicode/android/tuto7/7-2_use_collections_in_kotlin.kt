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
