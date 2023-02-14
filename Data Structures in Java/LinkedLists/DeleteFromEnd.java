public class DeleteFromEnd {
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
        System.out.println("null");
    }

    public void deleteNthFromEnd(int n) { // n is the node to be deleted from end
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // first node to be deleted
        if (n == size) {
            head = head.next;
            return;
        }

        // calculating the node to be deleted i.e., size-n
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String args[]) {
        DeleteFromEnd ll = new DeleteFromEnd();
        ll.addAtFirst(5);
        ll.addAtFirst(4);
        ll.addAtFirst(3);
        ll.addAtFirst(2);
        ll.addAtFirst(1);
        ll.print();
        ll.deleteNthFromEnd(3);
        ll.print();
    }
}
