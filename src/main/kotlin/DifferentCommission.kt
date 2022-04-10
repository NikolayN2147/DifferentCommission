
const val money: Int = 100

var comission: Double = 0.0

const val VK_PAY = 0.0
const val MASTERCARD_MAESTRO = 0.006
const val VISA_MIR = 0.0075

fun main() {
    commissionCalculation(money, VISA_MIR)
}

fun commissionCalculation(money: Int, card: Double) {

    when (card) {
        VK_PAY -> {
            comission = VK_PAY * money
            comissionPrint(comission)
        }
        MASTERCARD_MAESTRO -> {
            comission = MASTERCARD_MAESTRO * money + 20
            comissionPrint(comission)
        }
        VISA_MIR -> {
            comission = VISA_MIR * money
            if (comission < 35) {
                comission = 35.0
                comissionPrint(comission)
            } else {
                comission = VISA_MIR * money
                comissionPrint(comission)
            }
        }
    }
}

fun comissionPrint(comission: Double) {
    println("Комиссия за перевод : " + comission.toInt() + " руб " + ((comission * 100) % 100).toInt() + " коп. ")
}