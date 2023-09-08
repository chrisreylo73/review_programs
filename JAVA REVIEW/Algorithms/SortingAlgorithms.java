package Algorithms;

import java.util.Arrays;

public class SortingAlgorithms {

  /**-----------------------------------------------------------------------------------------------------------------------
   *                                                    Quicksort
   *-----------------------------------------------------------------------------------------------------------------------**/
  public static void quicksort(int[] arr) {
    if (arr == null || arr.length == 0) {
      return;
    }
    quicksort(arr, 0, arr.length - 1);
  }

  private static void quicksort(int[] arr, int low, int high) {
    if (low < high) {
      int pivotIndex = partition(arr, low, high);
      quicksort(arr, low, pivotIndex - 1);
      quicksort(arr, pivotIndex + 1, high);
    }
  }

  private static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low;

    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        swap(arr, i, j);
        i++;
      }
    }
    swap(arr, i, high);
    return i;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  /**-----------------------------------------------------------------------------------------------------------------------
   *                                                    Merge Sort
   *-----------------------------------------------------------------------------------------------------------------------**/
  public static void mergeSort(int[] arr) {
    int[] temp = new int[arr.length];
    merge(arr, temp, 0, arr.length - 1);
  }

  private static void merge(int[] arr, int[] temp, int left, int right) {
    if (left >= right) {
      return; // Base case: array has 0 or 1 element
    }

    int mid = left + (right - left) / 2;
    merge(arr, temp, left, mid);
    merge(arr, temp, mid + 1, right);

    int i = left;
    int j = mid + 1;
    int k = left;

    while (i <= mid && j <= right) {
      if (arr[i] <= arr[j]) {
        temp[k++] = arr[i++];
      } else {
        temp[k++] = arr[j++];
      }
    }

    while (i <= mid) {
      temp[k++] = arr[i++];
    }

    while (j <= right) {
      temp[k++] = arr[j++];
    }

    for (int p = left; p <= right; p++) {
      arr[p] = temp[p];
    }
  }

  /**-----------------------------------------------------------------------------------------------------------------------
   *                                                    MAIN
   *-----------------------------------------------------------------------------------------------------------------------**/
  public static void main(String[] args) {
    int[] arr = { 9, 2, 5, 1, 7, 4, 8, 3, 6 };
    System.out.println("Original Array:  " + Arrays.toString(arr));

    // Quicksort
    quicksort(arr);
    System.out.println("Quicksort:       " + Arrays.toString(arr));

    // Merge Sort
    int[] arr2 = { 9, 2, 5, 1, 7, 4, 8, 3, 6 };
    mergeSort(arr2);
    System.out.println("Merge Sort:      " + Arrays.toString(arr));
  }
}
