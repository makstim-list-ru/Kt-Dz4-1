package ru.netology

import kotlin.math.max

const val LIMIT_MONTH_CARD = 600_000
const val LIMIT_DAY_CARD = 150_000
const val LIMIT_MONTH_VK = 40_000
const val LIMIT_DAY_VK = 15_000

const val ERROR_LIMIT_MONTH = -2
const val ERROR_LIMIT_DAY = -1

fun main() {

    commissionCalc("MC", 0, 0, 150_000)
    commissionCalc("MC", 0, 0, 700_000)
    commissionCalc(newTransfer = 150_000)
    commissionCalc("VISA", newTransfer = 100_000)

}

fun commissionCalc(
    cardType: String = "MIR",
    sumMonthTransfers: Int = 0,
    sumDayTransfers: Int = 0,
    newTransfer: Int
): Int {

    when {
            newTransfer + sumDayTransfers > if (cardType == "VK") LIMIT_DAY_VK else LIMIT_DAY_CARD -> {
                println("Превышен разрешенный лимит в день, операция блокирована")
                return ERROR_LIMIT_DAY
            }

            newTransfer + sumMonthTransfers > if (cardType == "VK") LIMIT_MONTH_VK else LIMIT_MONTH_CARD -> {
                println("Превышен разрешенный лимит в месяц, операция блокирована")
                return ERROR_LIMIT_MONTH
            }
        }

    var comission: Int = 0

    when (cardType) {
        "MC", "Maestro" -> comission = when {
            newTransfer < 300 -> (newTransfer * 0.006 + 20).toInt()
            sumMonthTransfers + newTransfer <= 75_000 -> 0
            else -> ((sumMonthTransfers + newTransfer - 75_000) * 0.006 + 20).toInt()
        }

        "VISA", "MIR" -> comission = max((newTransfer * 0.0075).toInt(), 35)
        //if (newTransfer * 0.0075 < 35) 35 else (newTransfer * 0.0075).toInt()
        "VK" -> comission = 0
    }

    println(
        "Размер комиссии при сумме перевода $newTransfer рублей по карте $cardType: $comission рублей"
    )
    return comission
}