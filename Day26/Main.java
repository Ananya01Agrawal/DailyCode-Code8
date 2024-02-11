import java.util.*;

class ListNode {

  int val;
  ListNode next;
  ListNode(int x) {
    val = x;
    next = null;
  }
}

class Main {
  static void PrintList(ListNode head) // Function to print the LinkedList
  {
    ListNode curr = head;
    for (; curr != null; curr = curr.next)
      System.out.print(curr.val + "-->");
    System.out.println("null");
  }

  static ListNode InsertatFirst(int value, ListNode head) {

    // Step1 : creating a new Node with the given val
    ListNode newnode = new ListNode(value);

    // Step2 : Making next of newly created Node to point the head of LinkedList
    newnode.next = head;

    // Making the newly created Node as head
    head = newnode;
    return head;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ListNode head = null; // head of the LinkedList

    System.out.println("Enter the number of elements to insert at the beginning of the linked list:");
    int n = sc.nextInt();

    System.out.println("Enter the elements:");
    for (int i = 0; i < n; i++) {
      int value = sc.nextInt();
      head = InsertatFirst(value, head);
    }

    System.out.println("LinkedList before inserting 0 at beginning : ");
    PrintList(head);
    
    head = InsertatFirst(0, head);
    
    System.out.println("LinkedList after inserting 0 at beginning : ");
    PrintList(head);
  }
}
