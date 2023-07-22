package java_lang.singly_linked_list;

import java.util.Iterator;
import java.util.List;

public class SinglyLinkedList<T> implements Collection<T> {

    private int sizeOfList;
    private Node firstItem;

    public SinglyLinkedList() {
        firstItem = new Node();
    }

    public int size() {
        return sizeOfList;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean add(T var1) {
        Node currentNode = new Node(var1, null);

        try {
            if (sizeOfList == 0) {
                firstItem = currentNode;
                sizeOfList++;
            } else {
                Node lastNode = firstItem;

                while (lastNode.getNextRef() != null) {
                    lastNode = lastNode.getNextRef();
                }

                sizeOfList++;
                lastNode.setNextRef(currentNode);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> var1) {

        // TODO: 24/03/2023 to be implemented
        return false;
    }

    public boolean addAll(List<T> list) {
        try {
            for (T currentItem : list) {
                add(currentItem);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean contains(T var1) {
        // TODO: 24/03/2023 to be implemented
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> var1) {
        // TODO: 24/03/2023 to be implemented
        return false;
    }

    @Override
    public boolean remove(Object var1) {
        if (sizeOfList == 0) {
            return false;
        }

        Node currentNode = firstItem;
        Node previousNode = null;

        // first item is the one which should be deleted
        if (firstItem.getInfo() == var1) {
            firstItem = firstItem.getNextRef();
            sizeOfList--;
            return true;
        }

        // middle item to be deleted
        while (currentNode.getNextRef() != null) {
            if (currentNode.getInfo() == var1) {
                //delete node
                previousNode.setNextRef(currentNode.getNextRef());
                sizeOfList--;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextRef();
        }

        //last item to be deleted
        if (currentNode.getInfo() == var1) {
            previousNode.setNextRef(null);
            sizeOfList--;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> var1) {
        // TODO: 24/03/2023 to be implemented
        return false;
    }

    @Override
    public T get(int index) {
        // TODO: 24/03/2023 to be implemented
        return null;
    }

    @Override
    public T set(int index, T element) {
        // TODO: 24/03/2023 to be implemented
        return null;
    }

    @Override
    public T peek() {
        // TODO: 24/03/2023 to be implemented
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO: 24/03/2023 to be implemented
        return null;
    }

    @Override
    public void clear() {
        // TODO: 24/03/2023 to be implemented
    }

    @Override
    public String copyToString() {
        StringBuilder stringBuilder = new StringBuilder("\n");

        Node node = firstItem;
        while (node.getNextRef() != null) {
            stringBuilder.append(" ").append(node.info).append(" ");
            node = node.getNextRef();
        }
        stringBuilder.append(" ").append(node.info).append(" ");

        stringBuilder.append("\n");
        return stringBuilder.toString();

    }

    private class Node {
        private T info;
        private Node nextRef;

        public Node() {
        }

        public Node(T data, Node nextRef) {
            this.info = data;
            this.nextRef = nextRef;
        }

        public T getInfo() {
            return info;
        }

        public void setInfo(T info) {
            this.info = info;
        }

        public Node getNextRef() {
            return nextRef;
        }

        public void setNextRef(Node nextRef) {
            this.nextRef = nextRef;
        }
    }
}