import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList <Integer> number = new DoublyLinkedList<>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        number.addLast(6);
        number.addLast(30);
        number.display();

        System.out.println("the element contains node 6 returns " + number.contains(6));
//
        System.out.println("the number to remove is " + number.remove(2));
        number.display();
        number.displayReverse();

    }
}