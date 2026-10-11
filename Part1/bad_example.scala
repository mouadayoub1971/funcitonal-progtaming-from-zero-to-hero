class Coffee:
    val price: Double = 2.00

class CreditCard:
    // Unit mean void
    def charge(price: Double): Unit
        println("charging " + price)

class Cafe:
    def BuyCoffee(cc: CreditCard)
        val cup = Coffe()
        cc.charge(cup.price)
        cup