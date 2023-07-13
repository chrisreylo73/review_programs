package Data_Structures.LinkedList;

import java.util.HashSet;

public class RemoveDuplicatesLinkedList<T> {

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

  // Method to remove duplicates from the linked list
  public void removeDuplicates() {
    if (head == null || head.next == null) {
      return; // No duplicates can exist in an empty list or a list with only one node
    }

    HashSet<T> set = new HashSet<>();
    Node<T> previous = null;
    Node<T> current = head;

    while (current != null) {
      if (set.contains(current.data)) {
        previous.next = current.next; // Skip the current node as it is a duplicate
      } else {
        set.add(current.data);
        previous = current; // Move the previous pointer to the current node
      }
      current = current.next; // Move the current pointer to the next node
    }
  }

  // Method to print the elements of the linked list
  public void printList() {
    Node<T> current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    RemoveDuplicatesLinkedList<Integer> list = new RemoveDuplicatesLinkedList<>();

    // Create a linked list with duplicates: 1 -> 2 -> 2 -> 3 -> 4 -> 3 -> 5
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(3);
    list.add(5);

    System.out.println("Original List:");
    list.printList(); // Expected output: 1 2 2 3 4 3 5

    list.removeDuplicates();

    System.out.println("List after removing duplicates:");
    list.printList(); // Expected output: 1 2 3 4 5
  }
}
