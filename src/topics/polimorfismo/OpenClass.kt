package topics.polimorfismo

open class Pet {
    open fun makeSound() {
        println("Algum som genérico")
    }
}

class Dog : Pet() {
    override fun makeSound() {
        println("Latido!")
    }
}

class Cat : Pet() {
    override fun makeSound() {
        println("Miau!")
    }
}

fun main() {
    val cachorro: Pet = Dog()
    cachorro.makeSound()

    val gato: Pet = Cat()
    gato.makeSound()
}