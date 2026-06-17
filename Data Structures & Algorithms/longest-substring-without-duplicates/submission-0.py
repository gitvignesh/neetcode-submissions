class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        substring_set = set()
        left = 0
        max_length = 0

        for right in range(len(s)):
            # If the character is already in the set, remove characters 
            # from the left until the duplicate is gone
            while s[right] in substring_set:
                substring_set.remove(s[left])
                left += 1
                
            substring_set.add(s[right])
            max_length = max(max_length, right - left + 1)

        return max_length
        