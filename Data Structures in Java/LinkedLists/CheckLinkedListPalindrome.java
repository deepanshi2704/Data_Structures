public class CheckLinkedListPalindrome {
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

    public Node findMid(Node head) { // slow-fast technique
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // mid value
    }

    public boolean checkPalindrome() {

        // base case
        if (head == null || head.next == null) {
            return true;
        }

        // step 1 - finding middle node
        Node midNode = findMid(head);

        // step 2 - reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // step 3 - to check the left and right halves
        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]) {
        CheckLinkedListPalindrome ll = new CheckLinkedListPalindrome();
        ll.addAtFirst(1);
        ll.addAtFirst(2);
        ll.addAtFirst(2);
        ll.addAtFirst(1);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}
