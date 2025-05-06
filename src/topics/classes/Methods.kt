package topics.classes

/*
* Member functions:
* A member function is a function that is defined inside a class or object:
*/
class Machine() {
    // Private function
    private fun power() {
        println("Machine power on...")
    }

    // Kotlin functions are declared using the 'fun' keyword:
    fun start() {
        power()
        println("Machine is on!")
    }
}

/*
* Function scope:
* Kotlin functions can be declared at the top level in a file,
* meaning you do not need to create a class to hold a function
*/
fun concatenate(vararg values: String): String {
    val builder = StringBuilder()
    for (value in values) {
        builder.append("$value ")
    }
    return builder.toString()
}

/*
* Local functions:
* Kotlin supports local functions, which are functions inside other functions:
*/
fun greetUser(name: String): String {
    // Local method
    fun capitalize(input: String): String {
        return input.replaceFirstChar { it.uppercaseChar() }
    }

    val formattedName = capitalize(name)

    return "Hello, $formattedName!"
}

/*
* Generic functions:
* Functions can have generic parameters, which are
* specified using angle brackets before the function name:
*/
fun <T> toList(item: T): List<T> {
    return listOf(item)
}

/*
* Infix notation:
* Functions marked with the infix keyword can also be called using
* the infix notation (omitting the dot and the parentheses for the call).
* Infix functions must meet the following requirements:
* 1 - They must be member functions or extension functions.
* 2 - They must have a single parameter.
* 3 - The parameter must not accept variable number of arguments
* and must have no default value.
*/
infix fun Int.isEqual(other: Int): Boolean {
    return this == other
}

fun main() {
    val machine = Machine()
    machine.start()

    val areNumbersEqual = 1 isEqual 3
    println(areNumbersEqual)

    val concatenation = concatenate("Samuel", "Rodrigo", "Baioco")
    println(concatenation)

    val greet = greetUser("samuel")
    println(greet)

    val machines = toList(machine) // Create List<Machine>
}