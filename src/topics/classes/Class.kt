package topics.classes

/*
 * This is a basic class example.
 *
*/
class MyClass {
    // Properties
    var myProperty: Int = 0

    init {
        println("First initializer block that prints $myProperty")
    }
    // Methods
    fun myMethod() {
        // Method implementation
        myProperty += 10
        println("The current value of 'myProperty' is: $myProperty")
    }
}


fun main() {
    val obj = MyClass() // Creating an instance of MyClass
    println(obj)
    println(obj.myProperty)

    obj.myMethod()
}


