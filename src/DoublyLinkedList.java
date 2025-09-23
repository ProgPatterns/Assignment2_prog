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
        newNode.next = head;
        this.head = newNode;
        newNode.prev = head;
        this.tail = head;
    }

    public void addLast(T data){
        Node newNode = new Node(data);
        Node currentNode = tail;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode.prev;
    }

    public boolean contains(T data){
        Node currentNode = tail;
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
            Node currentNode = head;
            head = head.next;
            head.prev = null;
            return currentNode.data;
        }

        Node currentNode = tail;
        for(int i = 0; i<index-1; i++){
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        currentNode.prev = currentNode.prev.prev;

        return currentNode.data;
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
