package DataStructure;

public class DoublyLinkedList <T>{
    Node head;
    Node tail;

    class Node{
        T data;
        Node next;
        Node prev;

        public Node(T data){
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public void add(T data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(T data){
        Node newNode = new Node(data);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean contains(T data){
        Node currentNode = head;
        while(currentNode != null){
            if(currentNode.data.equals(data)){
                return true;
            }
             currentNode = currentNode.next;
        }
        return false;
    }

    public T remove(int index){
        if(index == 0){
            T value = head.data;
            head = head.next;
            head.prev = null;
            return value;
        }

        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }

        T value = currentNode.next.data;
        if(currentNode.next.next != null) {
            currentNode.next.next.prev = currentNode;
        }else{
            tail = currentNode;
        }
        currentNode.next = currentNode.next.next;
        return value;
    }

    public void display(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}
