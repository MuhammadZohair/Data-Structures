package kotlin_lang.lists.singly_linked_list

import kotlin_lang.lists.Collection


class SinglyLinkedList<T> : Collection<T> {

    var head: Node<T>? = null
    var sizeOfList: Int = 0

    override fun add(element: T): Boolean {
        head?.let {
            var currentNode = it
            while (currentNode.nextRef != null) {
                currentNode = currentNode.nextRef!!
            }
            currentNode.nextRef = Node(element, null)
            sizeOfList++
            return true
        } ?: run {
            head = Node(element, null)
            sizeOfList++
            return true
        }
    }

    override fun add(index: Int, element: T) {
        if (index > sizeOfList) throw IndexOutOfBoundsException("Index not accessible")

        if (index == sizeOfList) {
            add(element)
            return
        }

        head?.let {
            //todo: find the position and then place it
        } ?: run {
            head = Node(element, null)
        }

    }

    data class Node<T>(var info: T, var nextRef: Node<T>?)
}