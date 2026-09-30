class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size-1
        while (start <= end) {
            var mid = (start + end)/2
            if (target == nums[mid]) {
                return mid
            }
            
            if (target < nums[mid]) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
        return -1
    }
}