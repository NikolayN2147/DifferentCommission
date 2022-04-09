import org.junit.Test

import org.junit.Assert.*

class DifferentCommissionKtTest {

    @Test
    fun commissionCalculation() {
        val rub = 100
        val card = VISA

        val result = commissionCalculation(
            money, card
        )

        assertEquals(90,result)
    }
}