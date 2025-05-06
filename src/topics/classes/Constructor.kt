package topics.classes


/*
 * Primary constructor:
 * A class in Kotlin has a primary constructor and possibly
 * one or more secondary constructors. The primary constructor
 * is declared in the class header, and it goes after the class
 * name and optional type parameters:
 * class PersonType constructor(type: String) { /*...*/ }
 * If the primary constructor does not have any annotations or
 * visibility modifiers, the constructor keyword can be omitted:
*/
class PersonType(type: String) { /*...*/ }

/*
 * Secondary constructors:
 * If the class has a primary constructor, each secondary constructor
 * needs to delegate to the primary constructor, either directly or
 * indirectly through another secondary constructor(s). Delegation to another
 * constructor of the same class is done using the 'this' keyword:
*/
data class PersonLineage(val name: String) {
    val children: MutableList<PersonLineage> = mutableListOf()
    constructor(name: String, parent: PersonLineage) : this(name) {
        parent.children.add(this)
    }
}



data class UserDto(val firstName: String, val lastName: String)

data class UserEntity(val completeName: String) {

    // Second
    constructor(dto: UserDto) : this(
        completeName = "${dto.firstName} ${dto.lastName}"
    )
}

fun main() {
    val dto = UserDto("Samuel", "Baioco")
    val user = UserEntity(dto)
    val user2 = UserEntity("Ju")

    val dtos = listOf(UserDto("Samuel", "Baioco"), UserDto("Ju", "Souza"))

    val entities = dtos.map { UserEntity(it) }

    println(user.completeName)

    val person = PersonLineage("Samuel")
    val child = PersonLineage("Emanuelle", person)

    println(person)
    println(person.children)
    println(child)
}