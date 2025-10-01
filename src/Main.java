import DataStructure.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> number = new DoublyLinkedList<>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        System.out.println("initial doubly linkedlist elements:");
        number.display();

        number.addLast(6);
        number.addLast(30);
        System.out.println("after adding 2 more elements at the end of the list:");
        number.display();

        System.out.println("does the list contain an element 6: " + number.contains(6));
        System.out.println("does the list contain an element 40: " + number.contains(40));
        System.out.println("the number to remove at index 2 is " + number.remove(2));
        System.out.println("the number to remove at the first index is " + number.remove(0));
        System.out.println("the number to remove at the last index is " + number.remove(4));
        System.out.println("final doubly linkedlist elements:");
        number.display();
    }
}