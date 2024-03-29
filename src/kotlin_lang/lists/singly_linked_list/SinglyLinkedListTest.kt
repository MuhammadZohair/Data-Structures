package kotlin_lang.lists.singly_linked_list

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class SinglyLinkedListTest {

    lateinit var linkedList: SinglyLinkedList<Int>

    @BeforeEach
    fun setUp() {
        linkedList = SinglyLinkedList()
    }

    @Test
    fun appendAtEnd_listIsEmpty_elementAddedToHead() {

        linkedList.add(0)
        assertEquals(0, linkedList.head?.info)
    }

    @Test
    fun appendAtEnd_listContainsOne_elementAddedAtEnd() {

        linkedList.add(0)
        linkedList.add(1)
        assertEquals(1, linkedList.head?.nextRef?.info)
    }

    @Test
    fun appendAtEnd_listContainsMany_elementAddedAtEnd() {

        linkedList.add(0)
        linkedList.add(1)
        linkedList.add(2)
        assertEquals(2, linkedList.head?.nextRef?.nextRef?.info)
    }

    @DisplayName("Index out of bound exception")
    @Test
    fun addByIndex_indexOutOfRange_throwsException() {
        assertThrows(IndexOutOfBoundsException::class.java) {
            linkedList.add(4, 1)
        }
    }

    @Test
    fun addByIndex_listIsEmpty_elementAddedToHead() {

        linkedList.add(0, 2)
        assertEquals(2, linkedList.head?.info)
    }

    @Test
    fun addByIndex_positionEqualToSize_elementAddedAtEnd() {

        linkedList.add(0, 0)
        linkedList.add(1, 1)
        linkedList.add(2, 2)
        assertEquals(0, linkedList.head?.info)
        assertEquals(1, linkedList.head?.nextRef?.info)
    }

    @Test
    fun addByIndex_indexIs0_elementAddedToHead() {

        linkedList.add(0, 1)
        linkedList.add(1, 2)
        linkedList.add(2, 3)
        linkedList.add(0, -1)
        assertEquals(-1, linkedList.head?.info)
    }


}