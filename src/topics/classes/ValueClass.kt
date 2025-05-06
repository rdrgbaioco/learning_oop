package topics.classes


/*
 * Inline value classes:
 * Sometimes it is useful to wrap a value in a class to create
 * a more domain-specific type. However, it introduces runtime overhead
 * due to additional heap allocations. Moreover, if the wrapped type is
 * primitive, the performance hit is significant, because primitive types
 * are usually heavily optimized by the runtime, while their wrappers
 * don't get any special treatment:
*/
@JvmInline
value class Password(private val value: String)

@JvmInline
value class Customer(private val fullName: String) {
    init {
        require(fullName.isNotEmpty()) {
            "Full name shouldn't be empty"
        }
    }

    constructor(firstName: String, lastName: String) : this("$firstName $lastName") {
        require(lastName.isNotBlank()) {
            "Last name shouldn't be empty"
        }
    }

    val length: Int
        get() = fullName.length

    fun greet() {
        println("Hello, $fullName")
    }
}


fun main() {
    val customer = Customer("") // Error: Full name shouldn't be empty
}