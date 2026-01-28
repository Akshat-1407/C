public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // Create new node;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        // newNode.next = head;
        newNode.next = head;
        // head will now point towards the new node
        head = newNode;
    }

    public static void main(String[] args) {
        
    }
}