package kotlin_lang.lists.singly_linked_list

import kotlin_lang.lists.Collection


class SinglyLinkedList<T> : Collection<T> {

    var head: Node<T>? = null

    override fun add(element: T): Boolean {
        head?.let {
            var currentNode = it
            while (currentNode.nextRef != null) {
                currentNode = currentNode.nextRef!!
            }
            currentNode.nextRef = Node(element, null)
            return true
        } ?: run {
            head = Node(element, null)
            return true
        }
    }

    data class Node<T>(var info: T, var nextRef: Node<T>?)
}