package topics.classes

/*
 * Data classes in Kotlin are primarily used to hold data.
 * The compiler automatically derives the following members
 * from all properties declared in the primary constructor
 * equals() / hashCode() pair, toString(), copy(), componentN()
 * The primary constructor must have at least one parameter.
 * All primary constructor parameters must be marked as val or var.
 * Data classes can't be abstract, open, sealed, or inner.
*/
data class User(
    val name: String,
    val age: Int
)


/*
 * The compiler only uses the properties defined inside the
 * primary constructor for the automatically generated functions.
 * To exclude a property from the generated implementations,
 *  declare it inside the class body:
*/
data class Person(val name: String) {
    var age: Int = 0
}



fun main() {
    val user = User("Samuel", 26)
    println(user)

    val copy = user.copy(name = "Rodrigo")
    println(copy)

    val areEqual = user == copy
    println("The classes are equal: $areEqual")

    val person1 = Person("Samuel")
    val person2 = Person("Samuel")
    person1.age = 10
    person2.age = 20

    println("Persons are equal: ${person1 == person2}")
    // The age property is declared inside the class body and is excluded!.

    val (name, age) = user // destructuring declarations
    println("$name, $age years of age")


    val myUser1 = Customer("Samuel")
    println(myUser1)

    myUser1.greet()

    val myUser2 = Customer("Samuel", "Baioco")
    println(myUser2)
}