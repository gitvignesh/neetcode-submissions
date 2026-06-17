/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val stack = ArrayDeque<TreeNode>()
        var curr = root
        val result = mutableListOf<Int>()

        while (curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.addLast(curr)
                result.add(curr.`val`)
                curr = curr.left
            }
            curr = stack.removeLast()
            curr = curr.right
        }

        return result
    }
}
