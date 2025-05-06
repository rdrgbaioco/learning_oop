package topics.encapsulamento

// This class and its method are accessible from any module or file
class PublicExample {
    fun sayHello() {
        println("Hello from PublicExample")
    }
}

/*
 * Accessible only inside the file (for top-level declarations)
 * or inside the class (for class members).
*/
private class PrivateClass {
    fun greet() {
        println("Hello from PrivateClass")
    }
}

class OuterClass {
    private val secret = "This is private"

    private fun revealSecret() {
        println(secret)
    }
}

/*
 * Accessible in the class and its subclasses
 * (but not from outside the class, unlike public or internal).
*/
open class Transmission {
    protected fun showMessage() {
        println("Protected message")
    }
}

class Derived : Transmission() {
    fun callProtected() {
        showMessage() // Allowed here
    }
}

/*
 * Accessible within the same module (e.g., same project or library).
*/
internal class InternalClass {
    internal fun speak() {
        println("Hello from InternalClass")
    }
}

/*
 * An 'inner' class holds a reference to its outer class instance
 * and can access its members.
*/
class Container {
    private val value = 42

    inner class Inner {
        fun showValue() {
            println("Accessing outer value: $value")
        }
    }
}