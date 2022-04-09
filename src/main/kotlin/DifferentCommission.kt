const val money: Int = 1000100

const val VK_PAY = "VkPay"
const val MASTERCARD = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "Mir"


fun main() {
    commissionCalculation(money, MIR)
}

fun commissionCalculation(money: Int, card: String) {
    val comissionMasterMaestro = 0.006
    val comissionVisaMir = 0.0075
    val comissionVkPay = 0.0
    var comission: Double
    when (card) {
        VK_PAY -> {
            comission = comissionVkPay * money
            comissionPrint(comission)
        }
        MASTERCARD, MAESTRO -> {
            comission = comissionMasterMaestro * money + 20
            comissionPrint(comission)
        }
        VISA, MIR -> {
            comission = comissionVisaMir * money
            if (comission < 35) {
                comission = 35.0
                comissionPrint(comission)
            } else comissionPrint(comission)
        }
    }
}

fun comissionPrint(comission: Double) {
    println("Комиссия за перевод : " + comission.toInt() + " руб " + ((comission * 100) % 100).toInt() + " коп. ")
}