class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1 

        while (end >= start) {
            var mid: Int = (start + end)/2
            
            if(target == nums[mid]) {
                return mid
            }

            if(target > nums[mid]) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }

        return -1
    }
}