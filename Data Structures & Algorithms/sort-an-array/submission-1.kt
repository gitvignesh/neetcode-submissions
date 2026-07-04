class Solution {

    private fun merge(nums: IntArray, start: Int, mid: Int, end: Int) {
        val left = nums.slice(start..mid)
        val right = nums.slice(mid+1..end)

        var i = start
        var j = 0
        var k = 0

        while (j < left.size && k < right.size) {
            if (left[j] <= right[k]) {
                nums[i++] = left[j++]
            } else {
                nums[i++] = right[k++]
            }
        }

        while (j < left.size) nums[i++] = left[j++]
        while (k < right.size) nums[i++] = right[k++]
    }

    private fun mergeSort(nums: IntArray, start: Int, end: Int) {
        if(end-start <= 0){
            return
        }
        
        val mid = (start+end)/2

        mergeSort(nums, start, mid)
        mergeSort(nums, mid+1, end)

        merge(nums, start, mid, end)
    }


    fun sortArray(nums: IntArray): IntArray {
        mergeSort(nums, 0, nums.size-1)
        return nums
    }
}
