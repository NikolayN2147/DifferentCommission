import org.junit.Test

import org.junit.Assert.*

class DifferentCommissionKtTest {

    @Test
    fun commissionCalculation_VkPay() {

        val comission = VK_PAY
        val moneyVk = money

        val result  = comission * moneyVk

        assertEquals(0,result.toInt())


    }

    @Test
    fun commissionCalculation_Master_Maestro() {

        val comissionVkpay = MASTERCARD_MAESTRO
        val moneyMaster = money

        val result  = comissionVkpay * moneyMaster

        assertEquals(60,result.toInt())


    }

    @Test
    fun commissionCalculation_Visa_Mir() {

        val comissionVkpay = VISA_MIR
        val moneyVisa = money

        val result  = comissionVkpay * moneyVisa

        assertEquals(75,result.toInt())


    }

}