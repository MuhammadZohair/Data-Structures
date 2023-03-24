package java_lang;

import java_lang.singly_linked_list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        System.out.println(singlyLinkedList.isEmpty());

        singlyLinkedList.insert("Uzair");
        singlyLinkedList.insert("Zohairr");
        singlyLinkedList.insert("Awais");

        System.out.println(singlyLinkedList.copyToString());

        singlyLinkedList.update("Zohairr", "Zohair");

        System.out.println(singlyLinkedList.copyToString());

        System.out.println(singlyLinkedList.size());

        singlyLinkedList.delete("Awais");

        System.out.println(singlyLinkedList.copyToString());

        System.out.println(singlyLinkedList.isEmpty());
        System.out.println(singlyLinkedList.size());
    }
}