fun getCommission(cardType: String, amount: Double, prevAmount: Double = 0.0): Double{
    return when(cardType){
        "MasterCard", "Maestro" -> if(prevAmount+amount <= 75000.00) 0.0 else (prevAmount+amount-75000.00)/100.00*0.6+20
        "Visa", "Мир" -> if(amount/100.00*0.75 < 35.00) 35.00 else amount/100.00*0.75
        "VK Pay" -> 0.0
        else -> -1.0
    }
}

fun main(){
    println( getCommission("Maestro", 5001.00, 70000.0) )
    println( getCommission("Мир", 10000.00) )
}