class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""
        
        prefix = ""
        first_word = strs[0]

        for i in range(len(first_word)):
            for word in strs:
                # If the current index exceeds the word's length 
                # or characters don't match, return current prefix
                 if i >= len(word) or word[i] != first_word[i]:
                    return prefix
        
            # Append the character to the prefix
            prefix += first_word[i]

        return prefix