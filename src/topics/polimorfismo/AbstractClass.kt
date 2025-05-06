package topics.polimorfismo

/*
* With Abstracts classes:
* To provide shared base and force implementation of specific parts.
*/
abstract class PaymentMethod {
    abstract fun pay(amount: Long)
}

class CreditCard : PaymentMethod() {
    override fun pay(amount: Long) {
        println("Paying $amount with credit.")
    }
}

class DebitCard : PaymentMethod() {
    override fun pay(amount: Long) {
        println("Paying $amount with debit.")
    }
}

fun processPayment(type: PaymentMethod, amount: Long) {
    type.pay(amount) // Polymorphism in action
}

fun main() {
    val payments: List<PaymentMethod> = listOf(CreditCard(), DebitCard())

    for (p in payments) {
        processPayment(p, 15000)
    }
}