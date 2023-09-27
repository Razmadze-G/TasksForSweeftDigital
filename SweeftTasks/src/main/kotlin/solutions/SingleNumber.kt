package solutions

object SingleNumber {
    fun singleNumber(nums: IntArray): Int = nums.reduce { prev, curr -> prev xor curr }

    fun singleNumberUsingMap(nums: IntArray): Int {
        val count = mutableMapOf<Int, Int>()
        nums.forEach { num ->
            if (count.contains(num)) {
                count[num] = 2
            } else
                count[num] = 1
        }

        nums.forEach { num ->
            if (count[num] == 1) return num
        }
        return 0
    }
}