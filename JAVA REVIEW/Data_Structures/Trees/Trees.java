package Data_Structures.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Trees {

  public static void main(String[] args) {
    Trees trees = new Trees();
    trees.execute();
  }

  public void execute() {
    // Creating a Binary Tree
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);

    // Tree Traversal
    System.out.print("Pre-order Traversal: ");
    preOrderTraversal(root);
    System.out.println();
    System.out.print("In-order Traversal: ");
    inOrderTraversal(root);
    System.out.println();
    System.out.print("Post-order Traversal: ");
    postOrderTraversal(root);
    System.out.println();
    System.out.print("Level-order Traversal: ");
    levelOrderTraversal(root);
    System.out.println();

    // Searching in a Binary Tree
    TreeNode targetNode = search(root, 5);
    System.out.println("Found node with value 5: " + targetNode);

    // Insertion in a Binary Tree
    insert(root, 6);
    System.out.print("Level-order Traversal after insertion: ");
    levelOrderTraversal(root);
    System.out.println();

    // Deletion in a Binary Tree
    delete(root, 2);
    System.out.print("Level-order Traversal after deletion: ");
    levelOrderTraversal(root);
    System.out.println();
  }

  // Definition of TreeNode class
  private static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
      this.left = null;
      this.right = null;
    }
  }

  // Pre-order Traversal (Root, Left, Right)
  private void preOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    System.out.print(root.val + " "); // Visit the current node (root)
    preOrderTraversal(root.left); // Traverse the left subtree
    preOrderTraversal(root.right); // Traverse the right subtree
  }

  // In-order Traversal (Left, Root, Right)
  private void inOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    inOrderTraversal(root.left); // Traverse the left subtree
    System.out.print(root.val + " "); // Visit the current node (root)
    inOrderTraversal(root.right); // Traverse the right subtree
  }

  // Post-order Traversal (Left, Right, Root)
  private void postOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    postOrderTraversal(root.left); // Traverse the left subtree
    postOrderTraversal(root.right); // Traverse the right subtree
    System.out.print(root.val + " "); // Visit the current node (root)
  }

  // Level-order Traversal
  private void levelOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      System.out.print(node.val + " "); // Visit the current node
      if (node.left != null) {
        queue.offer(node.left); // Enqueue the left child
      }
      if (node.right != null) {
        queue.offer(node.right); // Enqueue the right child
      }
    }
  }

  // Searching for a value in a Binary Tree
  private TreeNode search(TreeNode root, int target) {
    if (root == null || root.val == target) {
      return root;
    }
    TreeNode leftResult = search(root.left, target); // Recursively search in the left subtree
    if (leftResult != null) {
      return leftResult;
    }
    return search(root.right, target); // Recursively search in the right subtree
  }

  // Inserting a value in a Binary Tree
  private void insert(TreeNode root, int value) {
    if (root == null) {
      return;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node.left == null) {
        node.left = new TreeNode(value); // Insert as the left child if available
        return;
      }
      if (node.right == null) {
        node.right = new TreeNode(value); // Insert as the right child if available
        return;
      }
      queue.offer(node.left); // Enqueue the left child for further exploration
      queue.offer(node.right); // Enqueue the right child for further exploration
    }
  }

  // Deleting a value from a Binary Tree
  private void delete(TreeNode root, int value) {
    if (root == null) {
      return;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    TreeNode targetNode = null;
    TreeNode deepestNode = null;
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node.val == value) {
        targetNode = node;
      }
      if (node.left != null) {
        queue.offer(node.left); // Enqueue the left child for further exploration
        deepestNode = node.left; // Keep track of the deepest left node encountered so far
      }
      if (node.right != null) {
        queue.offer(node.right); // Enqueue the right child for further exploration
        deepestNode = node.right; // Keep track of the deepest right node encountered so far
      }
    }
    if (targetNode != null) {
      targetNode.val = deepestNode.val; // Replace the value of the target node with the deepest node's value
      deleteDeepest(root, deepestNode); // Delete the deepest node from its original position
    }
  }

  // Deleting the deepest node in a Binary Tree
  private void deleteDeepest(TreeNode root, TreeNode deepestNode) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node.left != null) {
        if (node.left == deepestNode) {
          node.left = null; // Remove the deepest node by setting its parent's reference to null
          return;
        }
        queue.offer(node.left); // Enqueue the left child for further exploration
      }
      if (node.right != null) {
        if (node.right == deepestNode) {
          node.right = null; // Remove the deepest node by setting its parent's reference to null
          return;
        }
        queue.offer(node.right); // Enqueue the right child for further exploration
      }
    }
  }
}
