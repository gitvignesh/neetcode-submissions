class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        size = len(nums) * 2
        ans = [0] * size

        for index in range(len(nums)):
            ans[index] = nums[index]
            ans[index + len(nums)] = nums[index]
        
        return ans