


const val money: Int = 100

const val VK_PAY = "VkPay"
const val MASTERCARD = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "Mir"


fun main() {
commissionCalculation(money,VISA)
}

fun commissionCalculation(money:Int,card:String){
    val comissionMasterMaestro = money * 0.006 + 20
    val comissionVisaMir = money * 0.0075
    when(card){
        VK_PAY-> println("Комиссия за перевод $money руб: 0 рублей 00 коп.")
        MASTERCARD,MAESTRO -> println("Комиссия за перевод $money руб: "
                + comissionMasterMaestro.toInt() + " руб " + ((comissionMasterMaestro * 100) % 100).toInt() + " коп" )
        VISA,MIR -> if(comissionVisaMir < 35)
            println("Комиссия за перевод $money руб: 35 рублей 00 коп.")
        else
            println("Комиссия за перевод $money руб: " + comissionVisaMir.toInt()
        + " руб " + ((comissionVisaMir * 100) % 100).toInt() + " коп." )
    }
}