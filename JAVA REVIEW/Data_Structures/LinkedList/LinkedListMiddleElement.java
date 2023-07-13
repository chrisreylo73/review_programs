package Data_Structures.LinkedList;

public class LinkedListMiddleElement<T> {

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

  // Method to find and return the middle node of the linked list
  public Node<T> findMiddleNode() {
    if (head == null) {
      return null; // Empty list, no middle node
    }

    Node<T> slow = head;
    Node<T> fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next; // Move slow pointer by one node
      fast = fast.next.next; // Move fast pointer by two nodes
    }

    return slow; // Return the middle node
  }

  public static void main(String[] args) {
    LinkedListMiddleElement<Integer> list = new LinkedListMiddleElement<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    Node<Integer> middleNode = list.findMiddleNode();

    if (middleNode != null) {
      System.out.println("Middle Node: " + middleNode.data);
    } else {
      System.out.println("Middle Node: null");
    }
  }
}
