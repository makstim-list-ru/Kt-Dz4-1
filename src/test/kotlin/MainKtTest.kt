package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun commissionCalc_MC150K() {
        val cardType: String = "MC"
        val sumMonthTransfers: Int = 0
        val sumDayTransfers: Int = 0
        val newTransfer: Int = 150_000

        val result = commissionCalc(
            cardType = cardType,
            sumMonthTransfers = sumMonthTransfers,
            sumDayTransfers = sumDayTransfers,
            newTransfer = newTransfer
        )
        assertEquals(470, result)

    }

    @Test
    fun commissionCalc_MC700K() {
        val cardType: String = "MC"
        val sumMonthTransfers: Int = 0
        val sumDayTransfers: Int = 0
        val newTransfer: Int = 700_000

        val result = commissionCalc(
            cardType = cardType,
            sumMonthTransfers = sumMonthTransfers,
            sumDayTransfers = sumDayTransfers,
            newTransfer = newTransfer
        )
        assertEquals(-1, result)

    }

    @Test
    fun commissionCalc_default150K() {
        val newTransfer: Int = 150_000

        val result = commissionCalc(
            newTransfer = newTransfer
        )
        assertEquals(1125, result)

    }
}