package Data_Structures.LinkedList;

public class LinkedListFromScratch<T> {

  // Node class represents a single node in the linked list
  private static class Node<T> {

    private T data;
    private Node<T> next;

    public Node(T data) {
      this.data = data;
    }
  }

  private Node<T> head; // Head of the linked list
  private int size; // Size of the linked list

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

    size++; // Increment the size of the list
  }

  // Method to remove an element from the linked list
  public void remove(T data) {
    if (head == null) {
      return; // List is empty, nothing to remove
    }

    if (head.data.equals(data)) {
      head = head.next; // If the element to be removed is at the head, update the head
      size--; // Decrement the size of the list
      return;
    }

    Node<T> current = head;
    Node<T> prev = null;

    while (current != null && !current.data.equals(data)) {
      prev = current;
      current = current.next; // Traverse to find the node to be removed
    }

    if (current == null) {
      return; // Element not found in the list
    }

    prev.next = current.next; // Remove the node by updating the next reference of the previous node
    size--; // Decrement the size of the list
  }

  // Method to get an element at the specified index in the linked list
  public T get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Invalid index.");
    }

    Node<T> current = head;
    for (int i = 0; i < index; i++) {
      current = current.next; // Traverse to the specified index
    }

    return current.data; // Return the data of the node at the specified index
  }

  // Method to get the size of the linked list
  public int size() {
    return size; // Return the size of the list
  }

  public static void main(String[] args) {
    LinkedListFromScratch<Integer> list = new LinkedListFromScratch<>();

    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println("Size: " + list.size()); // Expected output: 3

    list.remove(20);

    System.out.println("Size: " + list.size()); // Expected output: 2

    int element = list.get(1);

    System.out.println("Element at index 1: " + element); // Expected output: 30
  }
}
