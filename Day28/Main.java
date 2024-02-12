import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class LinkedList {
    // Function to calculate the length of a linked list
    private static int lengthOfLinkedList(Node head) {
        int count = 0;
        Node temp = head;
        // Traverse the linked list and count nodes
        while (temp != null) {
            temp = temp.next;
            count++; // increment count for every node traversed
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            if (head == null) {
                head = new Node(data);
                tail = head;
            } else {
                tail.next = new Node(data);
                tail = tail.next;
            }
        }

        // Print the length of the linked list
        System.out.println("Length of the linked list: " + lengthOfLinkedList(head));
    }
}
