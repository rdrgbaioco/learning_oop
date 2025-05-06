package topics.objetos


/*
 * A singleton ensures that a class has only one instance
 * and provides a global point of access to it.
 * The initialization of an object declaration is thread-safe and done on first access.
 * Can be used to store shared keys (for things like SharedPreferences, Bundle keys, etc.).
*/
object MySharedKeys {
    const val CLIENT_ID = "client_id"
    const val CLIENT_TOKEN = "client_token"
}

data object MyDataObject {
    const val number: Int = 3
}

fun main() {
    val x = MySharedKeys
    val y = MySharedKeys
    println(MySharedKeys)
    // MySharedKeys@hashcode

    val areTheSameObj = x === y // Warning: Condition 'x == y' is always true
    println("Is the same ref in memory: $areTheSameObj")

    println(MyDataObject)
    // MyDataObject

    val anonymousObj = object {
        val x: Int = 10
        val y: Int = 20
    }

    println("X value is: ${anonymousObj.x} and Y is: ${anonymousObj.y}")
}
