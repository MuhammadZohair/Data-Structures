package kotlin_lang.lists

import java.util.*
import java.util.function.Predicate

interface Collection<T> {
    fun size(): Int

    fun add(var1: T): Boolean

    fun addAll(var1: Collection<out T>?): Boolean

    operator fun contains(var1: T): Boolean

    fun containsAll(var1: Collection<*>?): Boolean

    fun remove(var1: Any?): Boolean

    fun removeAll(var1: Collection<*>?): Boolean

    fun removeIf(filter: Predicate<in T>): Boolean {
        Objects.requireNonNull(filter)
        var removed = false
        val each = this.iterator()
        while (each.hasNext()) {
            if (filter.test(each.next())) {
                each.remove()
                removed = true
            }
        }
        return removed
    }

    operator fun get(index: Int): T

    operator fun set(index: Int, element: T): T

    fun peek(): T

    operator fun iterator(): MutableIterator<T>

    fun clear()

    override fun equals(var1: Any?): Boolean

    fun copyToString(): String?
}