package kotlin_lang

import kotlin_lang.lists.singly_linked_list.SinglyLinkedList

fun main() {
    val singlyLinkedList: SinglyLinkedList<String> = SinglyLinkedList()

//    singlyLinkedList.add("Zohair")
//    println(singlyLinkedList.copyToString())
//    singlyLinkedList.add("Uzair")
//    println(singlyLinkedList.copyToString())
//    singlyLinkedList.add("Awais")
//    println(singlyLinkedList.copyToString())

    val list = listOf("A", "Z", "W")
    singlyLinkedList.addAll(list)
    println(singlyLinkedList.copyToString())
    println(singlyLinkedList.contains("Q"))



}
