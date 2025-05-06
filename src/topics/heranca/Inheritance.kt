package topics.heranca

/*
 * By default, Kotlin classes are final – they can't be inherited.
 * When you want to allow extension of a concrete class.
 * To make a class inheritable, mark it with the open keyword:
*/
open class Superclass(p: Int) {
    val borderColor: String get() = "black"
}

/*
* To declare an explicit supertype, place the type after a colon in the class header:
*/
class Subclass(p: Int) : Superclass(p)

open class ShapeBase {
    open val vertexCount: Int = 0
    val borderColor: String get() = "black"
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }
}

class Circle() : ShapeBase() {
    override fun draw() { /*...*/ }
}

/*
* The overriding mechanism works on properties in the same way that it does on methods.
*/
class Rectangle : ShapeBase() {
    override val vertexCount = 4
}

/*
* Code in a derived class can call its superclass functions and
* property accessor implementations using the super keyword.
*/
class FilledRectangle : ShapeBase() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor
}

interface Shape {
    val vertexCount: Int
}

/*
* You can also override a val property with a var property, but not vice versa:
* This is allowed because a val property essentially declares a get method, and
* overriding it as a var additionally declares a set method in the derived class
*/
class Polygon : Shape {
    // Note that you can use the override keyword as part of the
    // property declaration in a primary constructor
    override var vertexCount: Int = 0  // Can be set to any number later
}

open class RectangleBase {
    open fun draw() {
        println("RectangleBase draw")
    }
}

interface PolygonBase {
    fun draw() {
        println("PolygonBase draw")
    } // interface members are 'open' by default
}

/*
* Overriding rules
* In Kotlin, implementation inheritance is regulated by the following rule:
* if a class inherits multiple implementations of the same member from its
* immediate superclasses, it must override this member and provide its own
* implementation (perhaps, using one of the inherited ones).
* To denote the supertype from which the inherited implementation is taken,
* use super qualified by the supertype name in angle brackets, such as super<Base>:
*/
class Square() : RectangleBase(), PolygonBase {
    // The compiler requires draw() to be overridden:
    // It's fine to inherit from both Rectangle and Polygon,
    // but both of them have their implementations of draw(),
    // so you need to override draw() in Square and provide a
    // separate implementation for it to eliminate the ambiguity
    override fun draw() {
        super<RectangleBase>.draw() // call to Rectangle.draw()
        super<PolygonBase>.draw() // call to Polygon.draw()
    }
}

fun main() {
    val square = Square()
    square.draw()
}