package io.codeforall.bootcamp;

/**
 * A simple Linked List container implementation
 */
public class LinkedList<T>{

    private Node head;
    private int length = 0;

    public LinkedList() {

        head = new Node(null);

    }

    /**
     * Obtain the number of data elements on the list
     *
     * @return
     */
    public int size() {
        return length;
    }

    /**
     * Adds a data element to the container
     *
     * @param data the element to add
     */
    public void add(T data) {

        Node node = new Node(data);
        Node iterator = head;

        // Advance to the end of the list
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }

        iterator.setNext(node);
        length++;

    }

    /**
     * Returns the index of the first occurrence of the data element in the list
     *
     * @param data the element to search for
     * @return the index of the element, or -1 if the list does not contain the element
     */
    public int indexOf(T data) {

        int index = 0;
        Node iterator = head.getNext();

        while (iterator != null) {

            if (iterator.getData().equals(data)) {
                return index;
            }

            iterator = iterator.getNext();
            index++;
        }

        // Data was not found
        return -1;

    }

    /**
     * Returns the data element at the specified index
     *
     * @param index index of the the element to return
     * @return the returned element or null if not found
     */
    public Object get(int index) {

        Node iterator = head.getNext();

        while (iterator != null) {
            if (index == 0) {
                return iterator.getData();
            }

            iterator = iterator.getNext();
            index--;
        }

        // not found
        return null;
    }

    /**
     * Removes the first occurrence of the data element from the list
     *
     * @param data the element to remove
     * @return true if the list contains the element
     */
    public boolean remove(T data) {

        Node previous = head;
        Node iterator = head.getNext();

        while (iterator != null) {

            if (iterator.getData().equals(data)) {
                previous.setNext(iterator.getNext());
                length--;
                return true;
            }

            previous = iterator;
            iterator = iterator.getNext();

        }

        return false;

    }

    /**
     * Linked List Node, used internally by the LinkedList class only
     */
    private class Node {

        /**
         * Reference to the next Node in the list
         */
        private Node next;

        /**
         * Reference to the data
         */
        private T data;

        public Node(T data) {
            this.data = data;
            next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
