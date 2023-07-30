package kotlin_lang.lists

interface Collection<T> {

    fun add(element: T): Boolean
    fun add(index: Int, element: T)


}