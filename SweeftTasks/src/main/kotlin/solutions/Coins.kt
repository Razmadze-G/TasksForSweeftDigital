package solutions

object Coins {
    fun minSplit(amount: Int): Int {
        var coinAmount = amount
        if (amount < 0) {
            print("Money can not be negative")
            return -1
        }
        val coins = intArrayOf(1, 5, 10, 20, 50)
        var answer = 0

        for (i in 4 downTo 0) {
            answer += coinAmount / coins[i]
            coinAmount -= coinAmount / coins[i] * coins[i]
        }
        return answer
    }
}