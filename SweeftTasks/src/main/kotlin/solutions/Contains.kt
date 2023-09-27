package solutions

import java.util.*

object Contains {
    fun notContains(nums: IntArray): Int {
        Arrays.sort(nums)
        var isThereNumberOne = false
        for (i in 0..nums.size - 2) {
            if (nums[i] > 0) {
                if (nums[i] == 1) isThereNumberOne = true
                if (!isThereNumberOne) return 1
                if (nums[i] != nums[i + 1] - 1) return nums[i] + 1
            }
        }
        return nums[nums.size - 1] + 1
    }
}