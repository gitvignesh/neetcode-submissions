class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val sCharCount = HashMap<Char, Int>()
        val tCharCount = HashMap<Char, Int>()

        for (i in s.indices) {
            sCharCount[s[i]] = sCharCount.getOrDefault(s[i], 0) + 1
            tCharCount[t[i]] = tCharCount.getOrDefault(t[i], 0) + 1
        }

        return sCharCount == tCharCount
    }
}
