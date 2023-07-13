package Data_Structures.Queues;

public class RecentOrderTracker<T> {

  private T[] circularArray;
  private int front;
  private int rear;
  private int size;
  private int capacity;

  @SuppressWarnings("unchecked")
  public RecentOrderTracker(int N) {
    this.capacity = N;
    this.circularArray = (T[]) new Object[N]; // Create an array of type T[] to store recent orders
    this.front = 0;
    this.rear = -1;
    this.size = 0;
  }

  // Method to enqueue an order into the recent order tracker
  public void enqueue(T data) {
    rear = (rear + 1) % capacity; // Calculate the new rear position using modulo
    circularArray[rear] = data; // Add the order to the circular array at the rear position

    if (size < capacity) {
      size++; // Increment the size if the tracker is not full
    } else {
      front = (front + 1) % capacity; // Move the front position circularly if the tracker is full
    }
  }

  // Method to get the recent orders from the tracker as an array
  @SuppressWarnings("unchecked")
  public T[] getRecentOrders() {
    T[] recentOrders = (T[]) new Object[size]; // Create a new array to store the recent orders

    for (int i = 0; i < size; i++) {
      recentOrders[i] = circularArray[(front + i) % capacity]; // Copy the orders from the circular array
    }

    return recentOrders; // Return the array of recent orders
  }

  public static void main(String[] args) {
    RecentOrderTracker<String> tracker = new RecentOrderTracker<>(5);

    tracker.enqueue("Order 1");
    tracker.enqueue("Order 2");
    tracker.enqueue("Order 3");
    tracker.enqueue("Order 4");
    tracker.enqueue("Order 5");

    System.out.println("Recent Orders:");
    for (String order : tracker.getRecentOrders()) {
      System.out.println(order); // Print the recent orders
    }

    tracker.enqueue("Order 6");
    tracker.enqueue("Order 7");

    System.out.println("\nRecent Orders:");
    for (String order : tracker.getRecentOrders()) {
      System.out.println(order); // Print the updated recent orders
    }
  }
}
