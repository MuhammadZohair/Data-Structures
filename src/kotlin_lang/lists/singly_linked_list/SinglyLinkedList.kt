package kotlin_lang.lists.singly_linked_list

import kotlin_lang.lists.Collection


class SinglyLinkedList<T> : Collection<T> {

    private var firstItem: Node<T>? = null
    private var sizeOfList: Int = 0

    override fun size(): Int {
        return sizeOfList
    }

    override fun add(var1: T): Boolean {
        val newNode: Node<T> = Node(var1, null)

        firstItem?.let {
            var lastNode = it
            while (lastNode.nextRef != null) {
                lastNode = lastNode.nextRef!!
            }
            lastNode.nextRef = newNode
        } ?: run {
            firstItem = newNode
        }

        firstItem?.let { } ?: run { }

        sizeOfList++
        return true
    }


    override fun addAll(list: List<T>): Boolean {
        for (item in list) {
            add(item)
        }
        return true
    }

    override fun copyToString(): String {
        val stringBuilder: StringBuilder = StringBuilder()
        var tempNode = firstItem
        while (tempNode?.nextRef != null) {
            stringBuilder.append(" ").append(tempNode.info).append(" ")
            tempNode = tempNode.nextRef
        }
        stringBuilder.append(" ").append(tempNode?.info).append(" ")

        stringBuilder.append("\n")
        return stringBuilder.toString()

    }

    data class Node<T>(var info: T, var nextRef: Node<T>?)
}