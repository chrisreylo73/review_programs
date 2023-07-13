package Data_Structures.LinkedList;

public class NthNodeFromEndLinkedList<T> {

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

  // Method to find the Nth node from the end of the linked list
  public T findNthNodeFromEnd(int n) {
    if (head == null) {
      return null; // Empty list, no Nth node
    }

    Node<T> slow = head;
    Node<T> fast = head;

    // Move the fast pointer N nodes ahead of the slow pointer
    for (int i = 0; i < n; i++) {
      if (fast == null) {
        return null; // N is larger than the length of the list
      }
      fast = fast.next;
    }

    // Move both pointers until the fast pointer reaches the end of the list
    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }

    return slow.data; // Return the data of the Nth node from the end
  }

  public static void main(String[] args) {
    NthNodeFromEndLinkedList<Integer> list = new NthNodeFromEndLinkedList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    int n = 2; // Find the 2nd node from the end

    Integer nthNode = list.findNthNodeFromEnd(n);

    if (nthNode != null) {
      System.out.println("Nth Node from the End: " + nthNode);
    } else {
      System.out.println("Invalid value of N.");
    }
  }
}
