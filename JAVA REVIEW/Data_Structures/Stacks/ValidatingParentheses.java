package Data_Structures.Stacks;

import java.util.Stack;

public class ValidatingParentheses {

  public static boolean areParenthesesBalanced(String str) {
    Stack<Character> stack = new Stack<>();

    // Iterate through each character in the string
    for (char c : str.toCharArray()) {
      if (isOpenBracket(c)) {
        stack.push(c); // Push the opening bracket onto the stack
      } else if (isClosedBracket(c)) {
        if (stack.isEmpty() || !isMatchingBracket(stack.pop(), c)) {
          return false; // If stack is empty or the brackets don't match, parentheses are not balanced
        }
      }
    }

    return stack.isEmpty(); // Parentheses are balanced if the stack is empty at the end
  }

  // Helper method to check if a character is an opening bracket
  private static boolean isOpenBracket(char c) {
    return c == '(' || c == '{' || c == '[';
  }

  // Helper method to check if a character is a closing bracket
  private static boolean isClosedBracket(char c) {
    return c == ')' || c == '}' || c == ']';
  }

  // Helper method to check if the given opening and closing brackets match
  private static boolean isMatchingBracket(char open, char close) {
    return (
      (open == '(' && close == ')') ||
      (open == '{' && close == '}') ||
      (open == '[' && close == ']')
    );
  }

  public static void main(String[] args) {
    String str1 = "(({}))";
    String str2 = "({[}])";
    String str3 = "{([])}";

    System.out.println(
      "Are parentheses balanced in " +
      str1 +
      "? " +
      areParenthesesBalanced(str1)
    );
    System.out.println(
      "Are parentheses balanced in " +
      str2 +
      "? " +
      areParenthesesBalanced(str2)
    );
    System.out.println(
      "Are parentheses balanced in " +
      str3 +
      "? " +
      areParenthesesBalanced(str3)
    );
  }
}
