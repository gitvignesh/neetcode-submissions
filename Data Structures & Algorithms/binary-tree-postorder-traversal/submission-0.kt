/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val stack = ArrayDeque<TreeNode>()
        var curr = root
        val result = mutableListOf<Int>()
        var lastVisited: TreeNode? = null

        while (curr != null || stack.isNotEmpty()) {
            while(curr != null) {
                stack.addLast(curr)
                curr = curr.left
            }

            val peekNode = stack.last()

            if (peekNode.right != null && lastVisited != peekNode.right) {
                curr = peekNode.right
            } else {
                result.add(peekNode.`val`)
                lastVisited = stack.removeLast()
            }
        }

        return result
    }
}
