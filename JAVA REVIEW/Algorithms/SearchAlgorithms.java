package Algorithms;

public class SearchAlgorithms {

  // Binary search algorithm
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

  // Linear search algorithm
  public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i; // Found the target element at index i
      }
    }

    return -1; // Target element not found
  }
}
