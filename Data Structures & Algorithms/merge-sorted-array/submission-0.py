class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        last = m + n - 1
        i = m - 1
        j = n - 1

        # Merge in reverse order to avoid overwriting elements in nums1
        while i >= 0 and j >= 0:
            if nums2[j] > nums1[i]:
                nums1[last] = nums2[j]
                j -= 1
            else:
                nums1[last] = nums1[i]
                i -= 1
            last -= 1

        # If there are remaining elements in nums2, fill them into nums1
        # (Note: if i >= 0, those elements are already in their correct place)
        while j >= 0:
            nums1[last] = nums2[j]
            last -= 1
            j -= 1
        