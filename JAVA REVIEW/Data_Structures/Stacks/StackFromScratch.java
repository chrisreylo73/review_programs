package Data_Structures.Stacks;

public class StackFromScratch<T> {

  // Node class represents a single element in the stack
  private static class Node<T> {

    private T data;
    private Node<T> next;

    public Node(T data) {
      this.data = data;
    }
  }

  private Node<T> top; // Top of the stack

  // Method to push an element onto the stack
  public void push(T data) {
    Node<T> newNode = new Node<>(data);
    newNode.next = top; // Set the new node's next reference to the current top
    top = newNode; // Update top to the new node, effectively pushing the element onto the stack
  }

  // Method to pop and return the element from the top of the stack
  public T pop() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty.");
    }

    T data = top.data; // Retrieve the data of the current top node
    top = top.next; // Update top to the next node, effectively removing the current top
    return data; // Return the data of the removed node
  }

  // Method to return the element at the top of the stack without removing it
  public T peek() {
    if (isEmpty()) {
      throw new IllegalStateException("Stack is empty.");
    }

    return top.data; // Return the data of the top node
  }

  // Method to check if the stack is empty
  public boolean isEmpty() {
    return top == null; // Stack is empty if the top is null
  }

  public static void main(String[] args) {
    StackFromScratch<Integer> stack = new StackFromScratch<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println("Peek: " + stack.peek());
    System.out.println("Pop: " + stack.pop());
    System.out.println("Pop: " + stack.pop());
    System.out.println("IsEmpty: " + stack.isEmpty());
    System.out.println("Pop: " + stack.pop());
    System.out.println("IsEmpty: " + stack.isEmpty());

    stack.push(40);
    stack.push(50);

    System.out.println("Peek: " + stack.peek());
    System.out.println("Pop: " + stack.pop());
    System.out.println("IsEmpty: " + stack.isEmpty());
    System.out.println("Pop: " + stack.pop());
    System.out.println("IsEmpty: " + stack.isEmpty());
  }
}
