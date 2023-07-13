package Data_Structures.Queues;

public class CircularQueue<T> {

  private T[] queue;
  private int front;
  private int rear;
  private int size;
  private int capacity;

  @SuppressWarnings("unchecked")
  public CircularQueue(int capacity) {
    this.capacity = capacity;
    this.queue = (T[]) new Object[capacity];
    this.front = 0;
    this.rear = -1;
    this.size = 0;
  }

  // Method to add an element to the circular queue
  public void enqueue(T data) {
    if (isFull()) {
      throw new IllegalStateException("Queue is full.");
    }

    rear = (rear + 1) % capacity; // Calculate the new rear position using modulo
    queue[rear] = data; // Insert the new element at the rear
    size++; // Increment the size of the queue
  }

  // Method to remove and return the element from the front of the circular queue
  public T dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty.");
    }

    T data = queue[front]; // Get the data of the front element
    queue[front] = null; // Remove the element from the front
    front = (front + 1) % capacity; // Calculate the new front position using modulo
    size--; // Decrement the size of the queue

    return data; // Return the data of the removed element
  }

  // Method to check if the circular queue is full
  public boolean isFull() {
    return size == capacity; // Queue is full if the size is equal to the capacity
  }

  // Method to check if the circular queue is empty
  public boolean isEmpty() {
    return size == 0; // Queue is empty if the size is zero
  }

  public static void main(String[] args) {
    CircularQueue<Integer> queue = new CircularQueue<>(3);
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    System.out.println("Dequeue: " + queue.dequeue());
    System.out.println("Dequeue: " + queue.dequeue());
    System.out.println("IsEmpty: " + queue.isEmpty());
    System.out.println("Dequeue: " + queue.dequeue());
    System.out.println("IsEmpty: " + queue.isEmpty());
  }
}
