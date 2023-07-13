package Data_Structures.LinkedList;

public class ReverseLinkedList<T> {

  // Node class represents a single node in the linked list
  private static class Node<T> {

    private T data;
    private Node<T> next;

    public Node(T data) {
      this.data = data;
    }
  }

  private Node<T> head; // Head of the linked list

  // Method to add an element to the front of the linked list
  public void add(T data) {
    Node<T> newNode = new Node<>(data);
    newNode.next = head; // Set the next reference of the new node to the current head
    head = newNode; // Set the new node as the head
  }

  // Method to reverse the order of elements in the linked list
  public void reverse() {
    Node<T> previous = null;
    Node<T> current = head;
    Node<T> next = null;

    while (current != null) {
      next = current.next; // Save the next node
      current.next = previous; // Reverse the next reference to the previous node
      previous = current; // Move the previous pointer to the current node
      current = next; // Move the current pointer to the next node
    }

    head = previous; // Set the reversed list's last node as the new head
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
    ReverseLinkedList<Integer> list = new ReverseLinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println("Original List:");
    list.printList(); // Expected output: 5 4 3 2 1

    list.reverse();

    System.out.println("Reversed List:");
    list.printList(); // Expected output: 1 2 3 4 5
  }
}
