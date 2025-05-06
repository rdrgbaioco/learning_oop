package topics.encapsulamento

private class Address {
    // The initializer, getter, and setter are optional. The property type is optional
    // if it can be inferred from the initializer or the getter's return type, as shown below:
    var street: String = "Av. Brasil"
    var city: String = "Tangará da Serra"
    var state: String = "MT"
    var zip: String = "123456"

    // The full syntax of a read-only property declaration differs from a
    // mutable one in two ways: it starts with val instead of var and does not allow a setter:
    val code: Int = 0

    /*
    * Getters and setters:
    * You can define custom accessors for a property. If you define a custom getter, it will be called
    * every time you access the property (this way you can implement a computed property).
    * Here's an example of a custom getter:
    */
    val complete: String // property type is optional since it can be inferred from the getter's return type
        get() = "${street}, $city, $state, $zip."
}