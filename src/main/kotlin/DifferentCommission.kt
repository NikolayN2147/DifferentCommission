const val money: Int = 100_000
const val VK_PAY = "VK_PAY"
const val MASTERCARD = "MASTERCARD"
const val MAESTRO = "MAESTRO"
const val VISA = "VISA"
const val MIR = "MIR"

fun main() {
   val result = commissionCalculation(VISA,0,0)
    comissionPrint(result)
}

fun commissionCalculation(card: String, limitOfDay: Int = 0, limitOfMonth: Int = 0):Double {
    var result = 0.0
    when (card) {
        VK_PAY -> {
            if (limitOfDay > 15_000 || limitOfMonth > 40_000) result = 0.0
        }
        MASTERCARD, MAESTRO -> {
            result = if (money < 75_000) 0.0 else 0.006 * money + 20
        }
        VISA, MIR -> {
            result = if (0.0075 * money < 35) 35.0 else 0.0075 * money

        }
    }
    return result

}


fun comissionPrint(comission: Double) {
   println("Комиссия за перевод : " + comission.toInt() + " руб " + ((comission * 100) % 100).toInt() + " коп. ")
}