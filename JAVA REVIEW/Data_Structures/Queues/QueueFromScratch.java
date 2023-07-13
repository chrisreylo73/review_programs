package Data_Structures.Queues;

public class QueueFromScratch<T> {

  // Implementing a Queue:

  // Node class represents a single element in the queue
  private static class Node<T> {

    private T data; // Data of the node
    private Node<T> next; // Reference to the next node in the queue

    public Node(T data) {
      this.data = data;
    }
  }

  private Node<T> head; // Front of the queue
  private Node<T> tail; // Rear of the queue

  // Method to add an element to the queue
  public void enqueue(T data) {
    Node<T> newNode = new Node<>(data);
    if (tail == null) {
      // If the queue is empty, set both head and tail to the new node
      head = newNode;
      tail = newNode;
    } else {
      // Append the new node to the end of the queue
      tail.next = newNode;
      tail = newNode;
    }
  }

  // Method to remove and return the front element of the queue
  public T dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty.");
    }
    T data = head.data; // Store the data of the current head node
    head = head.next; // Move the head to the next node
    if (head == null) {
      // If the head becomes null, i.e., the queue becomes empty, update the tail as well
      tail = null;
    }
    return data; // Return the data of the removed node
  }

  // Method to return the front element of the queue without removing it
  public T peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty.");
    }
    return head.data; // Return the data of the head node
  }

  // Method to remove the first occurrence of a given element from the queue
  public void remove(T data) {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty.");
    }
    if (head.data.equals(data)) {
      // If the element to be removed is at the head, call dequeue to remove it
      dequeue();
      return;
    }
    Node<T> curr = head;
    Node<T> prev = null;
    while (curr != null && !curr.data.equals(data)) {
      // Traverse the queue to find the element to be removed
      prev = curr;
      curr = curr.next;
    }
    if (curr == null) {
      // If the element is not found in the queue, throw an exception
      throw new IllegalArgumentException("Element not found in the queue.");
    }
    prev.next = curr.next; // Update the pointers to remove the node
    if (prev.next == null) {
      // If the removed node was the tail, update the tail pointer
      tail = prev;
    }
  }

  // Method to check if the queue is empty
  public boolean isEmpty() {
    return head == null; // Queue is empty if the head is null
  }

  public static void main(String[] args) {
    QueueFromScratch<Integer> queue = new QueueFromScratch<>();
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    System.out.println("Peek: " + queue.peek());
    System.out.println("Dequeue: " + queue.dequeue());
    System.out.println("Dequeue: " + queue.dequeue());
    System.out.println("IsEmpty: " + queue.isEmpty());
    System.out.println("Dequeue: " + queue.dequeue());
    System.out.println("IsEmpty: " + queue.isEmpty());

    queue.enqueue(40);
    queue.enqueue(50);
    queue.remove(40);

    System.out.println("Peek: " + queue.peek());
    System.out.println("Dequeue: " + queue.dequeue());
    System.out.println("IsEmpty: " + queue.isEmpty());
    System.out.println("Dequeue: " + queue.dequeue());
    System.out.println("IsEmpty: " + queue.isEmpty());
  }
}
