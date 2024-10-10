package io.codeforall.bootcamp;

public class LinkedList {

    private Node head;

    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
    }

    public int size() {
        return length;
    }




    /**
     * Adds an element to the end of the list
     *
     * @param data the element to add
     */
    public void add(Object data) {

        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }


    /**
     * Obtains an element by index
     *
     * @param index the index of the element
     */
    public Object get(int index) {
        int count = -1;
        Node current = head;
        while (current != null) {
            if (count != index) {
                current = current.getNext();
                count++;
                continue;
            }
            return current.getData();
        }
        return null;
    }

    /**
     * Returns the index of the element in the list
     *
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(Object data) {
        int count = 0;
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
            if (current.getData() != data) {
                count++;
                continue;
            }
            return count;
        }
        return -1;
    }

    /**
     * Removes an element from the list
     *
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(Object data) {

        Node current = head;
        Node currentAfter = head;

        while (currentAfter.getNext() != null) {

            currentAfter = currentAfter.getNext();

            if (currentAfter.getData() == data) {
                current.setNext(currentAfter.getNext());
                length--;
                return true;
            }
            current = current.getNext();

        }
        return false;
    }

    private class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
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
