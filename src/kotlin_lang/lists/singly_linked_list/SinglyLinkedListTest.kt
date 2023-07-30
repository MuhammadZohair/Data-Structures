package kotlin_lang.lists.singly_linked_list

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SinglyLinkedListTest {

    lateinit var linkedList: SinglyLinkedList<Int>

    @BeforeEach
    fun setUp() {
        linkedList = SinglyLinkedList()
    }

    @Test
    fun addToList_listIsEmpty_elementAddedToHead() {

        linkedList.add(0)
        assertEquals(0, linkedList.head?.info)
    }

    @Test
    fun addToList_listContainsOne_elementAddedAtEnd() {

        linkedList.add(0)
        linkedList.add(1)
        assertEquals(1, linkedList.head?.nextRef?.info)
    }

    @Test
    fun addToList_listContainsMany_elementAddedAtEnd() {

        linkedList.add(0)
        linkedList.add(1)
        linkedList.add(2)
        assertEquals(2, linkedList.head?.nextRef?.nextRef?.info)
    }
}