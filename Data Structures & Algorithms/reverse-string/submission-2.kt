class Solution {
    fun reverseString(s: CharArray) {
        var left = 0
        var right = s.size - 1

        while(right > left) {
            val temp = s[right]
            s[right] = s[left]
            s[left] = temp
            right--
            left++
        }
    }
}
