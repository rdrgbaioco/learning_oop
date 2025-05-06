package topics.aninhamento

/*
 * If you need access to members of the outer class, use the inner modifier:
*/
private class Outer {
    private val outerValue = "I'm in Outer"

    inner class Inner {
        fun innerFunction(): String {
            return "Accessing outer: $outerValue"
        }
    }
}

fun main() {
    val outer = Outer()
    val inner = outer.Inner()
    println(inner.innerFunction())
}