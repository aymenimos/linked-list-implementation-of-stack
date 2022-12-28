
class Node {

    int data;
    Node next;
}

public class linkedliststack {
    Node head;

    public void push(int number) {
        Node newnode = new Node();
        newnode.data = number;

        if (head == null) {
            head = newnode;

        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void pop() {

        if (head == null) {
            System.out.println("the stack is empty nothing to pop");
        } else {
            Node pointer = head;
            System.out.println(pointer.data + " is poped");
            pointer = pointer.next;
            head = pointer;
        }

    }

    public void display() {
        Node pointer = head;
        if (head == null) {

        } else {
            while (pointer.next != null) {
                System.out.println(pointer.data);
                pointer = pointer.next;
            }
        }

        if (head == null) {
            System.out.println("the stack is empty");
        } else {
            System.out.println(pointer.data);

        }

    }

}
