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
    fun commissionCalc_MC250() {
        val cardType: String = "MC"
        val sumMonthTransfers: Int = 0
        val sumDayTransfers: Int = 0
        val newTransfer: Int = 250

        val result = commissionCalc(
            cardType = cardType,
            sumMonthTransfers = sumMonthTransfers,
            sumDayTransfers = sumDayTransfers,
            newTransfer = newTransfer
        )
        assertEquals(21, result)

    }

    @Test
    fun commissionCalc_MC50K() {
        val cardType: String = "MC"
        val sumMonthTransfers: Int = 0
        val sumDayTransfers: Int = 0
        val newTransfer: Int = 50_000

        val result = commissionCalc(
            cardType = cardType,
            sumMonthTransfers = sumMonthTransfers,
            sumDayTransfers = sumDayTransfers,
            newTransfer = newTransfer
        )
        assertEquals(0, result)

    }

    @Test
    fun commissionCalc_VISA100K() {
        val cardType: String = "VISA"
        val sumMonthTransfers: Int = 0
        val sumDayTransfers: Int = 0
        val newTransfer: Int = 100_000

        val result = commissionCalc(
            cardType = cardType,
            sumMonthTransfers = sumMonthTransfers,
            sumDayTransfers = sumDayTransfers,
            newTransfer = newTransfer
        )
        assertEquals(750, result)

    }


    @Test
    fun commissionCalc_VK10K() {
        val cardType: String = "VK"
        val sumMonthTransfers: Int = 0
        val sumDayTransfers: Int = 0
        val newTransfer: Int = 10_000

        val result = commissionCalc(
            cardType = cardType,
            sumMonthTransfers = sumMonthTransfers,
            sumDayTransfers = sumDayTransfers,
            newTransfer = newTransfer
        )
        assertEquals(0, result)

    }

    @Test
    fun commissionCalc_VK100K() {
        val cardType: String = "VK"
        val sumMonthTransfers: Int = 0
        val sumDayTransfers: Int = 0
        val newTransfer: Int = 100_000

        val result = commissionCalc(
            cardType = cardType,
            sumMonthTransfers = sumMonthTransfers,
            sumDayTransfers = sumDayTransfers,
            newTransfer = newTransfer
        )
        assertEquals(ERROR_LIMIT_DAY, result)

    }

    @Test
    fun commissionCalc_VK35_7K() {
        val cardType: String = "VK"
        val sumMonthTransfers: Int = 35_000
        val sumDayTransfers: Int = 0
        val newTransfer: Int = 7_000

        val result = commissionCalc(
            cardType = cardType,
            sumMonthTransfers = sumMonthTransfers,
            sumDayTransfers = sumDayTransfers,
            newTransfer = newTransfer
        )
        assertEquals(ERROR_LIMIT_MONTH, result)

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