package kotlin_lang.lists.singly_linked_list

import kotlin_lang.lists.Collection


class SinglyLinkedList<T> : Collection<T> {

    var head: Node<T>? = null
    private var sizeOfList: Int = 0

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

        head?.let {
            var previousNode = head
            var currentNode = head
            var i = 1

            while (i < index) {
                previousNode = currentNode
                currentNode = currentNode?.nextRef
                i++
            }

            previousNode?.nextRef = currentNode
            currentNode?.nextRef = Node(element, currentNode?.nextRef)
            sizeOfList++

            //todo: find the position and then place it
        } ?: run {
            head = Node(element, null)
            sizeOfList++
        }
    }

    data class Node<T>(var info: T, var nextRef: Node<T>?)

}