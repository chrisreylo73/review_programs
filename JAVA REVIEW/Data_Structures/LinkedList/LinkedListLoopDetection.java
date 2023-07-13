package Data_Structures.LinkedList;

public class LinkedListLoopDetection<T> {

  // Node class represents a single node in the linked list
  private static class Node<T> {

    private T data;
    private Node<T> next;

    public Node(T data) {
      this.data = data;
    }
  }

  private Node<T> head; // Head of the linked list

  // Method to add an element to the end of the linked list
  public void add(T data) {
    Node<T> newNode = new Node<>(data);

    if (head == null) {
      head = newNode; // If the list is empty, set the new node as the head
    } else {
      Node<T> current = head;
      while (current.next != null) {
        current = current.next; // Traverse to the end of the list
      }
      current.next = newNode; // Add the new node at the end of the list
    }
  }

  // Method to detect and return the starting node of a loop in the linked list, if present
  public Node<T> detectLoop() {
    Node<T> slow = head;
    Node<T> fast = head;

    // Move the slow pointer by one node and the fast pointer by two nodes
    // until they meet or the fast pointer reaches the end of the list
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      // Loop detected as the slow and fast pointers meet
      if (slow == fast) {
        return getLoopStartNode(slow);
      }
    }

    return null; // No loop found
  }

  // Helper method to find the starting node of the loop
  private Node<T> getLoopStartNode(Node<T> intersection) {
    Node<T> ptr1 = head;
    Node<T> ptr2 = intersection;

    // Move both pointers at the same pace until they meet
    while (ptr1 != ptr2) {
      ptr1 = ptr1.next;
      ptr2 = ptr2.next;
    }

    return ptr1; // Return the starting node of the loop
  }

  public static void main(String[] args) {
    LinkedListLoopDetection<Integer> list = new LinkedListLoopDetection<>();

    // Create a LinkedList with a loop
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    // Create a loop by connecting the last node to the second node
    Node<Integer> lastNode = list.head;
    while (lastNode.next != null) {
      lastNode = lastNode.next;
    }
    lastNode.next = list.head.next;

    Node<Integer> loopStartNode = list.detectLoop();

    if (loopStartNode != null) {
      System.out.println("Loop Detected. Start Node: " + loopStartNode.data);
    } else {
      System.out.println("No Loop Detected.");
    }
  }
}
