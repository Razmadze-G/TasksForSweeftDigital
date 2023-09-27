package solutions

import kotlin.math.pow
import kotlin.math.sqrt

object Stairs {
    fun countVariants(n: Int): Int {
        val s = sqrt(5.0)
        return (1 / s * (((1 + s) / 2).pow(n) - ((1 - s) / 2).pow(n))).toInt()
    }
}