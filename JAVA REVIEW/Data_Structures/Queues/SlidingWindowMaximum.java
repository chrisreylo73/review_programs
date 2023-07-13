package Data_Structures.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

  public static int[] findSlidingWindowMaximum(int[] nums, int k) {
    if (nums == null || k <= 0 || nums.length < k) {
      throw new IllegalArgumentException("Invalid input.");
    }

    int n = nums.length;
    int[] result = new int[n - k + 1];
    Deque<Integer> deque = new ArrayDeque<>();

    int idx = 0;
    for (int i = 0; i < n; i++) {
      // Remove indices that are out of the current window
      while (!deque.isEmpty() && deque.peek() < i - k + 1) {
        deque.poll();
      }

      // Remove indices of smaller elements from the deque
      while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
        deque.pollLast();
      }

      deque.offer(i);

      // Process the maximum element in the window
      if (i >= k - 1) {
        result[idx++] = nums[deque.peek()];
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
    int k = 3;
    int[] result = findSlidingWindowMaximum(nums, k);

    System.out.print("Maximum elements in each sliding window: ");
    for (int num : result) {
      System.out.print(num + " ");
    }
  }
}
