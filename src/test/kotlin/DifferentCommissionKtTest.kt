import org.junit.Test

import org.junit.Assert.*

class DifferentCommissionKtTest {
    @Test
    fun commissionCalculation() {
        val card = "VISA"
        val limitOfDay = 0
        val limitOfMonth = 0

        val result = commissionCalculation(card,limitOfDay,limitOfMonth)
        val expected = 750
        assertEquals(expected, result.toInt())

    }
}