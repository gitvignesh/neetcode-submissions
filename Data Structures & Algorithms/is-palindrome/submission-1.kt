class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right){

            while(left < right && !isAlphaNum(s[left])){
                left++
            }

            while(left < right && !isAlphaNum(s[right])){
                right--
            }

            if(s[left].lowercase() != s[right].lowercase()){
                return false
            }

            left++
            right--
        }

        return true
    }

    fun isAlphaNum(c: Char): Boolean {
        return ('A'.code <= c.code && c.code <= 'Z'.code) ||
                ('a'.code <= c.code && c.code <= 'z'.code) ||
                ('0'.code <= c.code && c.code <= '9'.code) 
    }
}
