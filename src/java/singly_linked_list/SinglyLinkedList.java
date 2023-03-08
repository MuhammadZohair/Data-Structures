package java.singly_linked_list;

import java.util.List;

/**
 * The type Singly linked list.
 * Something similar to: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/LinkedList.html
 *
 * @param <T> the type parameter
 */
public class SinglyLinkedList<T> implements CRUD<T> {

    private int sizeOfList;
    private boolean isEmpty;
    private Node firstItem;

    /**
     * Instantiates a new Singly linked list.
     */
    public SinglyLinkedList() {
        firstItem = new Node();
    }

    /**
     * @param data
     */
    public void insert(T data) {
        Node currentNode = new Node(data, null);

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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param list
     */
    public void insertAll(List<T> list) {
        for (T currentItem : list) {
            insert(currentItem);
        }
    }

    /**
     * @param oldValue
     * @param newValue
     * @return
     */
    @Override
    public boolean update(T oldValue, T newValue) {

        Node node = firstItem;
        while (node.getNextRef() != null) {
            if (node.getInfo() == oldValue) {
                node.setInfo(newValue);
                return true;
            }
            node = node.getNextRef();
        }
        return false;
    }

    /**
     * @param data
     * @return
     */
    @Override
    public boolean delete(T data) {
        if (sizeOfList == 0) {
            return false;
        }

        Node currentNode = firstItem;
        Node previousNode = null;

        // first item is the one which should be deleted
        if (firstItem.getInfo() == data) {
            firstItem = firstItem.getNextRef();
            sizeOfList--;
            return true;
        }

        // middle item to be deleted
        while (currentNode.getNextRef() != null) {
            if (currentNode.getInfo() == data) {
                //delete node
                previousNode.setNextRef(currentNode.getNextRef());
                sizeOfList--;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextRef();
        }

        //last item to be deleted
        if (currentNode.getInfo() == data) {
            previousNode.setNextRef(null);
            sizeOfList--;
            return true;
        }
        return false;
    }

    /**
     * @return
     */
    public boolean isEmpty() {
        return sizeOfList() == 0;
    }

    /**
     * @return
     */
    public int sizeOfList() {
        return sizeOfList;
    }

    /**
     * @return
     */
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

    /**
     *
     */
    private class Node {
        private T info;
        private Node nextRef;

        /**
         * Instantiates a new Node.
         */
        public Node() {
        }

        /**
         * Instantiates a new Node.
         *
         * @param data    the data
         * @param nextRef the next ref
         */
        public Node(T data, Node nextRef) {
            this.info = data;
            this.nextRef = nextRef;
        }

        /**
         * Gets info.
         *
         * @return the info
         */
        public T getInfo() {
            return info;
        }

        /**
         * Sets info.
         *
         * @param info the info
         */
        public void setInfo(T info) {
            this.info = info;
        }

        /**
         * Gets next ref.
         *
         * @return the next ref
         */
        public Node getNextRef() {
            return nextRef;
        }

        /**
         * Sets next ref.
         *
         * @param nextRef the next ref
         */
        public void setNextRef(Node nextRef) {
            this.nextRef = nextRef;
        }
    }
}