public class AddMiddle {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addAtMiddle(int idx, int data) {
        if (idx == 0) {
            addAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]) {
        AddMiddle ll = new AddMiddle();
        ll.addAtFirst(4);
        ll.addAtFirst(3);
        ll.addAtFirst(2);
        ll.addAtFirst(1);
        ll.print();
        ll.addAtMiddle(2, 9);
        ll.print();
    }
}
