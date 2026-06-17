class Solution {
    fun sortColors(nums: IntArray) {
        var left = 0
        var right = nums.size-1
        var i = 0

        fun swap(i: Int, j: Int) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
        }

        while (i <= right) {
            if (nums[i] == 0){
                swap(i, left)
                left++
            } else if (nums[i] == 2) {
                swap(i, right)
                right--
                i--
            }
            i++
        }
    }
}
