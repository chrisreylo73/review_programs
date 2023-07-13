package Data_Structures.Queues;

import java.util.*;

public class QueueRotation {

  // Method to rotate the elements of a queue by a given number of positions
  public static void rotateQueue(Queue<Integer> queue, int positions) {
    if (queue == null || positions <= 0 || positions >= queue.size()) {
      return; // Invalid input or no rotation needed, simply return
    }

    int n = queue.size();
    positions %= n; // Normalize positions to be within the queue size

    for (int i = 0; i < positions; i++) {
      int element = queue.poll(); // Remove the front element from the queue
      queue.offer(element); // Add the removed element to the rear of the queue
    }
  }

  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    queue.offer(4);
    queue.offer(5);

    System.out.println("Original Queue: " + queue);

    int positions = 2;
    rotateQueue(queue, positions); // Rotate the queue by 2 positions

    System.out.println("Rotated Queue (" + positions + " positions): " + queue);
  }
}
