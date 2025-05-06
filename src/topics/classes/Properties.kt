package topics.classes




/*
* Declaring properties:
* In Kotlin classes can be declared either as mutable, using the var keyword, or as
* read-only, using the val keyword.
*/
private class Address {
    var street: String = ""
    var city: String = ""
    var state: String = ""
    var zip: String? = null
}

fun main() {
    val address = Address()
    address.street = "Av. Brasil"
    address.city = "Tangará da Serra"
    address.state = "MT"
    address.zip = "0000"
}