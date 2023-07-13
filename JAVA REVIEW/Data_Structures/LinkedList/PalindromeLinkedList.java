package Data_Structures.LinkedList;

public class PalindromeLinkedList<T> {

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

  // Method to check if the linked list is a palindrome
  public boolean isPalindrome() {
    if (head == null) {
      return true; // An empty list is considered a palindrome
    }

    Node<T> slow = head;
    Node<T> fast = head;
    Node<T> prevSlow = null;
    Node<T> mid = null;

    // Move the slow and fast pointers to find the middle node
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      prevSlow = slow;
      slow = slow.next;
    }

    // Handling odd number of nodes, set the mid node
    if (fast != null) {
      mid = slow;
      slow = slow.next;
    }

    // Reverse the second half of the linked list
    Node<T> secondHalf = reverseLinkedList(slow);
    prevSlow.next = null; // Disconnect the first half from the second half

    // Compare the first half and reversed second half of the list
    boolean isPalindrome = compareLists(head, secondHalf);

    // Restore the original list by reversing the second half again
    reverseLinkedList(secondHalf);

    // If there was a mid node, reconnect it in the reversed second half
    if (mid != null) {
      prevSlow.next = mid;
      mid.next = secondHalf;
    } else {
      prevSlow.next = secondHalf; // Reconnect the first and second half
    }

    return isPalindrome;
  }

  // Helper method to reverse a linked list
  private Node<T> reverseLinkedList(Node<T> node) {
    Node<T> prev = null;
    Node<T> current = node;

    while (current != null) {
      Node<T> next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    return prev; // Return the new head of the reversed list
  }

  // Helper method to compare two linked lists for equality
  private boolean compareLists(Node<T> list1, Node<T> list2) {
    Node<T> current1 = list1;
    Node<T> current2 = list2;

    while (current1 != null && current2 != null) {
      if (!current1.data.equals(current2.data)) {
        return false; // Data mismatch, not a palindrome
      }
      current1 = current1.next;
      current2 = current2.next;
    }

    return true; // Both lists are identical, it's a palindrome
  }

  public static void main(String[] args) {
    PalindromeLinkedList<Integer> list = new PalindromeLinkedList<>();

    // Create a palindrome linked list: 1 -> 2 -> 3 -> 2 -> 1
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(2);
    list.add(1);

    boolean isPalindrome = list.isPalindrome();

    if (isPalindrome) {
      System.out.println("The list is a palindrome.");
    } else {
      System.out.println("The list is not a palindrome.");
    }
  }
}
