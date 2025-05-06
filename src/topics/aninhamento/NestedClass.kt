package topics.aninhamento


/*
 * A nested class in Kotlin does not hold a reference to the outer class.
 * It behaves like a static class in Java.
*/
private class OuterExample {
    val outerValue = "I'm in Outer"

    class Nested {
        fun nestedFunction(): String {
            return "Hello from Nested class"
        }
    }
}

sealed class Result {
    class Success(val data: String) : Result()
    class Error(val message: String) : Result()
    object Loading : Result()
}

fun main() {
    val nested = OuterExample.Nested()
    println(nested.nestedFunction())
}