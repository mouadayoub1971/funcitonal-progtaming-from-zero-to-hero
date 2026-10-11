class Coffee:
    val price: Double = 2.00

class CreditCard:
    // Unit mean void
    def charge(price: Double): Unit
        println("charging " + price)

class Cafe:
    // this function do more then one thing , it buy a coffe and it pay it's price so there too thing wich is bad 
    def BuyCoffee(cc: CreditCard)
        val cup = Coffe()
        cc.charge(cup.price)
        cup