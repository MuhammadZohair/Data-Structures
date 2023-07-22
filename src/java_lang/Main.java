package java_lang;

import java_lang.singly_linked_list.SinglyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        System.out.println(singlyLinkedList.isEmpty());

        singlyLinkedList.add("Uzair");
        singlyLinkedList.add("Zohairr");
        singlyLinkedList.add("Awais");

        System.out.println(singlyLinkedList.copyToString());

        singlyLinkedList.set(1, "Zohair");

        System.out.println(singlyLinkedList.copyToString());

        System.out.println(singlyLinkedList.size());

        singlyLinkedList.remove("Awais");

        System.out.println(singlyLinkedList.copyToString());

        System.out.println(singlyLinkedList.isEmpty());
        System.out.println(singlyLinkedList.size());

        LinkedList<Integer> list = new LinkedList<>();
    }
}