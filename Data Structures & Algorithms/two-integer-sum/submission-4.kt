class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
       val seen = HashMap<Int, Int>()

       for( (index, num) in nums.withIndex()) {
            val diff = target - num

            if (seen.containsKey(diff)) {
                return intArrayOf(seen[diff]!!, index)
            } 
            
            seen[num] = index
       }

       return intArrayOf()
    }
}
