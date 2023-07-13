package Data_Structures.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

  // Method to find the first non-repeating character in a given string
  public static char findFirstNonRepeatingCharacter(String str) {
    int[] charCount = new int[26]; // Assuming only lowercase alphabets

    Queue<Character> queue = new LinkedList<>(); // Queue to track non-repeating characters

    for (char c : str.toCharArray()) {
      charCount[c - 'a']++; // Increment the count of the character

      queue.offer(c); // Add the character to the queue

      // Remove characters from the queue until a non-repeating character is found
      while (!queue.isEmpty() && charCount[queue.peek() - 'a'] > 1) {
        queue.poll();
      }
    }

    return queue.isEmpty() ? '\0' : queue.peek(); // Return the first non-repeating character, or null if not found
  }

  public static void main(String[] args) {
    String input = "aabbccd";
    char firstNonRepeatingChar = findFirstNonRepeatingCharacter(input);
    System.out.println(
      "First non-repeating character: " + firstNonRepeatingChar
    );
  }
}
