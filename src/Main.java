//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList <Integer> number = new DoublyLinkedList<>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.display();

        number.addLast(6);
        number.addLast(30);
        number.display();

        boolean p = number.contains(6);
        System.out.println(p);

        number.remove(0);
        number.display();

        number.remove(0);
        number.display();
    }
}