package topics.classes

import kotlin.enums.enumEntries

/*
* Enum classes:
* The most basic use case for enum classes is the implementation of type-safe enums:
*/
enum class Aligment {
    LEFT, CENTER, RIGHT
}

/*
* Each enum constant is an object. Enum constants are separated by commas.
* Since each enum is an instance of the enum class, it can be initialized as:
*/
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

/*
* The enumValues<T>() function is still supported, but we recommend that you use the
* enumEntries<T>() function instead because it has less performance impact:
*/
inline fun <reified T : Enum<T>> printAllValues() {
    println(enumEntries<T>().joinToString { it.name })
}

fun main() {
    val color = Color.valueOf("RED")
    println("The color is: $color") // prints "The first color is: RED"
    println("The rgb color is: ${color.ordinal}") // prints position index

    printAllValues<Color>()
    // prints RED, GREEN, BLUE
}