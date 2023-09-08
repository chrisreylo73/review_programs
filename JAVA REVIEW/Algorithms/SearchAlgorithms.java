package Algorithms;

import java.util.*;

public class SearchAlgorithms {

  /**-----------------------------------------------------------------------------------------------------------------------
   *                                                    Linear
   *-----------------------------------------------------------------------------------------------------------------------**/
  // Linear search algorithm
  public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i; // Found the target element at index i
      }
    }

    return -1; // Target element not found
  }

  /**-----------------------------------------------------------------------------------------------------------------------
   *                                                    Binary
   *-----------------------------------------------------------------------------------------------------------------------**/
  public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (arr[mid] == target) {
        return mid; // Found the target element at index mid
      }

      if (arr[mid] < target) {
        left = mid + 1; // Target is in the right half
      } else {
        right = mid - 1; // Target is in the left half
      }
    }

    return -1; // Target element not found
  }

  /**-----------------------------------------------------------------------------------------------------------------------
   *                                                    BFS
   *-----------------------------------------------------------------------------------------------------------------------**/
  public static void bfs(int[] arr, int target) {
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[arr.length];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        System.out.println("BFS: Element found at index " + i);
        return;
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (!visited[i]) {
        visited[i] = true;
        queue.offer(i);

        while (!queue.isEmpty()) {
          int currentIndex = queue.poll();
          if (arr[currentIndex] == target) {
            System.out.println("BFS: Element found at index " + currentIndex);
            return;
          }
          // Add neighbors to the queue
          // Modify this part based on the specific graph structure or adjacency list representation
          // For example, if the graph is represented using adjacency list, you can iterate through the neighbors of currentIndex
          // and add the unvisited neighbors to the queue.
        }
      }
    }

    System.out.println("BFS: Element not found");
  }

  /**-----------------------------------------------------------------------------------------------------------------------
   *                                                    DFS
   *-----------------------------------------------------------------------------------------------------------------------**/
  public static void dfs(int[] arr, int target) {
    boolean[] visited = new boolean[arr.length];

    for (int i = 0; i < arr.length; i++) {
      if (!visited[i]) {
        dfsUtil(arr, i, visited, target);
      }
    }

    System.out.println("DFS: Element not found");
  }

  private static void dfsUtil(
    int[] arr,
    int currentIndex,
    boolean[] visited,
    int target
  ) {
    visited[currentIndex] = true;
    if (arr[currentIndex] == target) {
      System.out.println("DFS: Element found at index " + currentIndex);
      System.exit(0);
    }
    // Explore neighbors recursively
    // Modify this part based on the specific graph structure or adjacency list representation
    // For example, if the graph is represented using adjacency list, you can iterate through the neighbors of currentIndex
    // and call the dfsUtil method for the unvisited neighbors.
  }

  /**-----------------------------------------------------------------------------------------------------------------------
   *                                                    MAIN
   *-----------------------------------------------------------------------------------------------------------------------**/
  public static void main(String[] args) {
    int[] sortedArray = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
    int[] unsortedArray = { 5, 23, 8, 72, 16, 2, 91, 38, 56, 12 };

    int target = 23;

    // Binary search on a sorted array
    int binarySearchIndex = SearchAlgorithms.binarySearch(sortedArray, target);
    if (binarySearchIndex != -1) {
      System.out.println(
        "Binary search: Element found at index " + binarySearchIndex
      );
    } else {
      System.out.println("Binary search: Element not found");
    }

    // Linear search on an unsorted array
    int linearSearchIndex = SearchAlgorithms.linearSearch(
      unsortedArray,
      target
    );
    if (linearSearchIndex != -1) {
      System.out.println(
        "Linear search: Element found at index " + linearSearchIndex
      );
    } else {
      System.out.println("Linear search: Element not found");
    }

    bfs(unsortedArray, target);
    dfs(unsortedArray, target);
  }
}
