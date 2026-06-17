data class Node(
    val key: Int,
    var next: Node? = null
)

class MyHashSet() {

    val store = Array<Node>(100000) { Node(-1) }

    private fun hash(key: Int): Int = key % store.size

    fun add(key: Int) {
        val index = hash(key)
        var curr = store[index]

        while (curr.next != null) {
            if (curr.next!!.key == key) return
            curr = curr.next!!
        }
        curr.next = Node(key)
    }

    fun remove(key: Int) {
        val index = hash(key)
        var curr = store[index]

        while (curr.next != null) {
            if (curr.next!!.key == key) {
                curr.next = curr.next!!.next
                return
            }
            curr = curr.next!!
        }
    }

    fun contains(key: Int): Boolean {
        val index = hash(key)
        var curr = store[index].next

        while (curr != null) {
            if (curr.key == key) return true
            curr = curr.next
        }
        return false
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
