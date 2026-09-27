class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = hashMapOf<String, MutableList<String>>()

        for (str in strs) {
            val sorted = str.toCharArray().sorted().joinToString("")
            
            result.getOrPut(sorted) { mutableListOf() }.add(str)
        }

        return result.values.toList()
    }
}
