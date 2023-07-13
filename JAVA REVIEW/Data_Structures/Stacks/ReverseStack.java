package Data_Structures.Stacks;

import java.util.Stack;

public class ReverseStack {

  public static void reverse(Stack<Integer> stack) {
    if (stack.isEmpty()) {
      return; // Stack is empty, nothing to reverse
    }

    Stack<Integer> auxiliaryStack = new Stack<>();

    // Transfer elements from the original stack to the auxiliary stack
    while (!stack.isEmpty()) {
      auxiliaryStack.push(stack.pop());
    }

    // Transfer elements back from the auxiliary stack to the original stack
    while (!auxiliaryStack.isEmpty()) {
      stack.push(auxiliaryStack.pop());
    }
  }

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    System.out.println("Original Stack: " + stack);

    reverse(stack);

    System.out.println("Reversed Stack: " + stack);
  }
}
