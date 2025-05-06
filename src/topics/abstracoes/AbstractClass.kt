package topics.abstracoes


// Abstract class
abstract class Dinosaur {
    // Abstract property (must be overridden)
    abstract val diet: String

    // Abstract method: must be implemented by subclasses
    abstract fun makeSound()

    // Concrete method: has default implementation
    fun eat() {
        when (diet) {
            "carnivore" -> println("${this::class.simpleName} is eating meat. 🍖")
            "herbivore" -> println("${this::class.simpleName} is eating plants. 🌿")
            else -> println("${this::class.simpleName} has an unknown diet.")
        }
    }
}

// Subclass: Dog
class Tyrannosaurus : Dinosaur() {
    override val diet = "carnivore"
    override fun makeSound() {
        println("Woof! 🐶")
    }
}

// Subclass: Cat
class Triceratops : Dinosaur() {
    override val diet = "herbivore"

    override fun makeSound() {
        println("Meow! 🐱")
    }
}

// Usage
fun main() {
    val tRex: Dinosaur = Tyrannosaurus()
    val trike: Dinosaur = Triceratops()

    tRex.makeSound()   // ROAR!!! 🦖
    tRex.eat()         // Tyrannosaurus is eating meat. 🍖

    trike.makeSound()  // Mooorrr! 🐮🦕
    trike.eat()        // Triceratops is eating plants. 🌿
}