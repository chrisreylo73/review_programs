import java.io.*;
import java.util.*;

public class JavaReview {

  public void arrays() {
    /* Declaring and Initalizing an array of Strings */
    String[] array1 = { "Aready", "Filled", "In" };
    /* Declating and Initalizing an empty arry of doubles that has a size of 4 */
    double[] array2 = new double[4];
    /* Add to an array in a certain index */
    array2[0] = 24.5;
    /* How to assign a variable the length of an array */
    int sizeOfarray2 = array2.length;
    System.out.println(sizeOfarray2);
    /* How to print out the length of an array */
    System.out.println(array2.length);
    /* How to print out the contents of an array */
    System.out.println(Arrays.toString(array1));
    /* How to print out each of the contents of an array seperatly */
    for (int i = 0; i < 3; i++) {
      System.out.println(array1[i]);
    }
  }

  public void randomNumber() {
    /* Method 1:How to generate random integers in a specific range */
    int max = 5;
    int min = 0;
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    for (int i = 0; i < 5; i++) { // This is just proof that it prints random values
      System.out.println("Random Number = " + randomNum);
      randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
    /* Method 2: How to generate random integers with no specified min */
    int upperbound = 101;
    Random rand = new Random();

    int int_random = rand.nextInt(upperbound);
    double double_random = rand.nextDouble();
    float float_random = rand.nextFloat();
    System.out.println(
      "Random integer value from 0 to" + (upperbound - 1) + " : " + int_random
    );
    System.out.println(
      "Random float value between 0.0 and 1.0 : " + float_random
    );
    System.out.println(
      "Random double value between 0.0 and 1.0 : " + double_random
    );
  }

  public void arrayList() {
    /* Declaring and initializing an arraylist of strings */
    ArrayList<String> list1 = new ArrayList<>();
    /* Declaring and initializing an arraylist of multiple data types */
    ArrayList list2 = new ArrayList<>();
    /* Adding at item to an arraylist */
    list1.add("hi");
    /* Adding an item to an arraylist at a specific index */
    list1.add(1, "hello");
    /* Adding different data types to list2 */
    list2.add("String");
    list2.add(1);
    list2.add(1.5);
    list2.add(true);
    /* Assigning the size of an arraylist to a varible and printing it out */
    int list2Size = list2.size();
    System.out.println(list2Size);
    /* Printing the entire contents of list2 */
    System.out.println("Entire List: " + list2);
    /* Printing a single element of an array */
    System.out.println("Element 0 of list2 : " + list2.get(0));
    /* Changing an element at a certain index value */
    list2.set(0, "Changed String");
    System.out.println(
      "Changed element in index 0 : " + list2.set(0, "Changed String")
    );
    /* Returns true if this list contains the specified element. */
    list2.contains(1.5);
    System.out.println("Contains Method : " + list2.contains(1.5));
    /*
     * The index the first occurrence of a specific element is either returned, or
     * -1 in case the element is not in the list.
     */
    list2.indexOf(1);
    System.out.println("indexOf Method : " + list2.indexOf(1));
    /*
     * Returns the index of the last occurrence of a specific element
     * is either returned or -1 in case the element is not in the list.
     */
    list2.lastIndexOf(1.5);
    System.out.println("lastIndexOf Method : " + list2.lastIndexOf(1.5));
    /* Deleting an element */
    list2.remove(3);
    /* Remove all elements from the arraylist */
    list2.clear();
    /* Checks if arraylist is empty */
    list2.isEmpty();
    System.out.println("isEmpty Method : " + list2.isEmpty());
  }

  public void conditionals() {
    Random rand = new Random();
    int num = rand.nextInt(101);
    /* if statements */
    if (num == 1 || num != 2) {
      System.out.println("Number is equal to 1 or does not equal 2");
    }
    if (num <= 10) {
      System.out.println("Number is less than 10");
    }
    if (num >= 10) {
      System.out.println("Number is greater than 10");
    }
    if (num % 10 == 0) {
      System.out.println("Number is divisable by 10");
    } else if (num % 5 != 0) {
      System.out.println("Number is not divisable by 5 without remainder");
    } else {
      System.out.println("Got to else statement!!!");
    }
    /* Switch case */
    int day = 4;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("There is only 7 days in the week");
    }
  }

  public void stringManipulation() {
    /* Substring - isolates a part of string */
    String str0 = "Hello";
    String justTheL = str0.substring(2, 4);
    System.out.println(justTheL);
    /* Concatination - puts 2 strings together */
    String str1 = "Rock";
    String str2 = "Star";
    String str3 = str1.concat(str2);
    System.out.println(str3);
    // or
    String str4 = str1 + str2;
    System.out.println(str4);
    /* Finding string length */
    String str5 = "Christian";
    int strLength = str5.length();
    System.out.println(strLength);
    /* Finding index of specific character */
    str5 = "Christian";
    int indexFind = str5.indexOf("i"); // finds first occurence of "i" and returns index
    System.out.println(indexFind);
    int lastIndexFind = str5.lastIndexOf("i"); // Finds last occurence of "i" and returns index
    System.out.println(lastIndexFind);
    /* Finding specfic charcter given index */
    String str6 = "Hello";
    char letter = str6.charAt(4);
    System.out.println(letter);
    /* Code to find the number of occurences of a character is a string */
    int count = 0;
    char search = 'i';
    String str_sample = "mississippi";
    for (int i = 0; i < str_sample.length(); i++) {
      if (str_sample.charAt(i) == search) {
        count++;
      }
    }
    System.out.println(
      "The character " +
      search +
      " occurs " +
      count +
      " times in the string " +
      str_sample
    );
    /* Make lowercase */
    str_sample = "AuRora";
    String makeLowerCase = str_sample.toLowerCase();
    System.out.println(makeLowerCase);
    /* Make uppercase */
    str_sample = "AuRora";
    String makeUpperCase = str_sample.toUpperCase();
    System.out.println(makeUpperCase);
    /* Make only one character upper case in a String */
    str_sample = "aurora";
    str_sample =
      str_sample.substring(0, 1).toUpperCase() +
      str_sample.substring(1, str_sample.length());
    System.out.println(str_sample);
    /* Make all of the upper case letters becide the first lowercase */
    str_sample = "AuRORa";
    str_sample =
      str_sample.substring(0, 1) +
      str_sample.substring(1, str_sample.length()).toLowerCase();
    System.out.println(str_sample);
    /* Find how many uppercase letters are in a string */
    str_sample = "HJKJGAKGnsndjkagka";
    int counter = 0;
    for (int j = 0; j < str_sample.length(); j++) {
      if (
        str_sample
          .substring(j, j + 1)
          .equals(str_sample.substring(j, j + 1).toUpperCase())
      ) {
        counter++;
      }
    }
    System.out.println(
      "The number of upper case letters in this string is : " + counter
    );
    /* Contains a certain phrase or character returns true */
    str_sample = "Hi my name is christian lopez";
    System.out.println(str_sample.contains("christian"));
  }

  public void conversions() {
    /* String to Int */
    String text = "100";
    int stringToInt = Integer.parseInt(text);
    System.out.println("String to int : " + stringToInt);
    /* String to double */
    text = "100.65";
    double stringToDouble = Double.parseDouble(text);
    System.out.println("String to double : " + stringToDouble);
    /* String to long */
    text = "100";
    long stringToLong = Long.parseLong(text);
    System.out.println("String to long : " + stringToLong);

    /* int to String */
    int num = 200;
    String intToString = String.valueOf(num);
    System.out.println("\nInt to String : " + intToString);
    /* double to String */
    double num2 = 200.10;
    String doubleToString = String.valueOf(num2);
    System.out.println("double to String : " + doubleToString);
    /* boolean to String */
    boolean bool = true;
    String booleanToString = String.valueOf(bool);
    System.out.println("boolean to String : " + booleanToString);
    /* long to String */
    long num3 = 200;
    String longToString = String.valueOf(num3);
    System.out.println("long to String : " + longToString);

    /* int to double */
    int i = 300;
    double d = Double.valueOf(i);
    System.out.println("\nInt to double : " + d);
    /* int to long */
    i = 300;
    long l = Long.valueOf(i);
    System.out.println("Int to long : " + l);

    /* double to int */
    double d2 = 400.065;
    int i2 = (int) d2;
    System.out.println("\nDouble to int : " + i2);
    /* double to long */
    d2 = 400.075;
    long l2 = (long) d2;
    System.out.println("Double to long : " + l2);

    /* long to int */
    long l3 = 400;
    int i3 = (int) l3;
    System.out.println("\nLong to int : " + i3);
    /* long to double */
    l3 = 400;
    double d3 = (double) l3;
    System.out.println("Long to double : " + d3);

    /* int to hexidecimal */
    int value = -32768;
    String hex = Integer.toHexString(value);
    System.out.println("\nHexidecimal value of " + value + " is : " + hex);
    /* Hex to int */
    int parsedResult = (int) Long.parseLong(hex, 16);
    System.out.println("Integer value of " + hex + " is : " + parsedResult);
    /* int to binary */
    int value2 = 250;
    String binary = Integer.toBinaryString(value2);
    System.out.println("Binary value of " + value2 + " is : " + binary);
    /* binary to int */
    int parsedResult2 = (int) Long.parseLong(binary, 2);
    System.out.println("Integer value of " + binary + " is : " + parsedResult2);
  }

  public void fileManipulation() {
    /* Asking user to enter in a path */
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter in a path to file : ");
    String path = keyboard.nextLine();
    path = path.replace("\\", "\\\\");
    /* Reading in files - bufferd reader method */
    ///// import java.io.*;
    try {
      File file = new File(path);
      BufferedReader br = new BufferedReader(new FileReader(file));
      String str;
      while ((str = br.readLine()) != null) {
        System.out.println(str);
      }
      br.close(); /// close file
    } catch (FileNotFoundException s) {
      System.out.println("File does Not Exist Please Try Again: ");
    } catch (IOException e) {
      System.out.println(e.toString());
    }

    /* Reading in files - File Reader method */
    //// import java.io.*;
    try {
      FileReader fr = new FileReader(path);
      int i; // Declaring loop variable
      while ((i = fr.read()) != -1) {
        System.out.print((char) i); // prints a character at a time
      }
      fr.close(); //// close file
    } catch (FileNotFoundException s) {
      System.out.println("File does Not Exist Please Try Again: ");
    } catch (IOException e) {
      System.out.println(e.toString());
    }
    System.out.println();
    /* Reading in files and printing it out to turminal - Scanner method */
    //// import java.io.*
    try {
      File file2 = new File(path);
      Scanner fileScanner = new Scanner(file2);
      while (fileScanner.hasNextLine()) {
        System.out.println(fileScanner.nextLine());
      }
      fileScanner.close(); //// close file
    } catch (FileNotFoundException s) {
      System.out.println("File does Not Exist Please Try Again: ");
    } catch (IOException e) {
      System.out.println(e.toString());
    }
    /* Creating a file */
    /* Count the number of lines in a file */

    /* Writing into files */
    /* Deleting contents in a file */
    /* spliting up lines into a file into feilds */

  }

  public void linkList() {
    // Creating a LinkedList
    LinkedList<Integer> linkedList = new LinkedList<>();

    // Adding Elements
    linkedList.add(10); // Adds an element to the end of the list
    linkedList.addFirst(5); // Adds an element to the beginning of the list

    // Accessing Elements
    int firstElement = linkedList.get(0); // Accesses the element at index 0

    // Removing Elements
    linkedList.remove(0); // Removes the element at index 0
    linkedList.removeFirst(); // Removes the first element
    linkedList.removeLast(); // Removes the last element

    // Iterating over Elements
    // Using an enhanced for loop
    for (Integer element : linkedList) {
      // Process each element
      System.out.println(element);
    }

    // Using an Iterator
    Iterator<Integer> iterator = linkedList.iterator();
    while (iterator.hasNext()) {
      Integer element = iterator.next();
      // Process each element
      System.out.println(element);
    }

    // Retrieving Size of the LinkedList
    int size = linkedList.size();
    System.out.println("Size: " + size);

    // Checking if an Element Exists
    boolean containsElement = linkedList.contains(10); // Checks if an element exists in the list

    // Clearing the LinkedList
    linkedList.clear(); // Removes all elements from the list

    // Checking if the LinkedList is Empty
    boolean isEmpty = linkedList.isEmpty(); // Checks if the list is empty
    /*Implementing a LinkedList:

        Implement a LinkedList class from scratch with methods like add, remove, get, and size.
        Reversing a LinkedList:

        Reverse a LinkedList in-place. Implement a method to reverse the order of elements in the list.
        Detecting a Loop in a LinkedList:

        Determine if a LinkedList contains a loop or cycle. Implement a method to detect and return the node at which the loop starts, if present.
        Finding the Middle Element of a LinkedList:

        Find the middle element of a LinkedList. Implement a method to return the middle node of the list.
        Merging Two Sorted LinkedLists:

        Merge two sorted LinkedLists into a single sorted LinkedList. Implement a method that takes two sorted lists as input and returns the merged list.
        Removing Duplicates from a LinkedList:

        Remove duplicates from a LinkedList. Implement a method to remove any duplicate elements from the list, keeping only the distinct elements.
        Finding the Nth Node from the End:

        Find the Nth node from the end of a LinkedList. Implement a method to return the value of the Nth node from the end of the list.
        Detecting the Intersection Point of Two LinkedLists:

        Given two LinkedLists, find the node at which they intersect. Implement a method to determine the intersection point, if any.
        Detecting Palindrome LinkedLists:

        Check if a LinkedList is a palindrome. Implement a method to determine whether the elements in the list form a palindrome sequence.
        Swapping Nodes in a LinkedList:

        Swap two nodes in a LinkedList. Implement a method that takes two node positions as input and swaps the nodes at those positions. */
  }

  public void trees() {
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
  class TreeNode {

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
    System.out.print(root.val + " ");
    preOrderTraversal(root.left);
    preOrderTraversal(root.right);
  }

  // In-order Traversal (Left, Root, Right)
  private void inOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    inOrderTraversal(root.left);
    System.out.print(root.val + " ");
    inOrderTraversal(root.right);
  }

  // Post-order Traversal (Left, Right, Root)
  private void postOrderTraversal(TreeNode root) {
    if (root == null) {
      return;
    }
    postOrderTraversal(root.left);
    postOrderTraversal(root.right);
    System.out.print(root.val + " ");
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
      System.out.print(node.val + " ");
      if (node.left != null) {
        queue.offer(node.left);
      }
      if (node.right != null) {
        queue.offer(node.right);
      }
    }
  }

  // Searching for a value in a Binary Tree
  private TreeNode search(TreeNode root, int target) {
    if (root == null || root.val == target) {
      return root;
    }
    TreeNode leftResult = search(root.left, target);
    if (leftResult != null) {
      return leftResult;
    }
    return search(root.right, target);
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
        node.left = new TreeNode(value);
        return;
      }
      if (node.right == null) {
        node.right = new TreeNode(value);
        return;
      }
      queue.offer(node.left);
      queue.offer(node.right);
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
        queue.offer(node.left);
        deepestNode = node.left;
      }
      if (node.right != null) {
        queue.offer(node.right);
        deepestNode = node.right;
      }
    }
    if (targetNode != null) {
      targetNode.val = deepestNode.val;
      deleteDeepest(root, deepestNode);
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
          node.left = null;
          return;
        }
        queue.offer(node.left);
      }
      if (node.right != null) {
        if (node.right == deepestNode) {
          node.right = null;
          return;
        }
        queue.offer(node.right);
      }
    }
  }

  public void hashTable() {
    // Creating a Hashtable
    Hashtable<String, Integer> hashtable = new Hashtable<>();

    // Adding Key-Value Pairs
    hashtable.put("apple", 10); // Adds a key-value pair to the Hashtable
    hashtable.put("banana", 20);
    hashtable.put("cherry", 30);

    // Retrieving Values
    int value = hashtable.get("apple"); // Retrieves the value associated with the key "apple"

    // Checking if Key Exists
    boolean containsKey = hashtable.containsKey("banana"); // Checks if the Hashtable contains the key "banana"

    // Removing Key-Value Pairs
    hashtable.remove("cherry"); // Removes the key-value pair associated with the key "cherry"

    // Iterating over Key-Value Pairs
    // Using an enhanced for loop
    for (String key : hashtable.keySet()) {
      int value1 = hashtable.get(key);
      // Process each key-value pair
      System.out.println(key + ": " + value1);
    }

    // Using an Enumeration
    Enumeration<String> keys = hashtable.keys();
    while (keys.hasMoreElements()) {
      String key = keys.nextElement();
      int value2 = hashtable.get(key);
      // Process each key-value pair
      System.out.println(key + ": " + value2);
    }

    // Using an Iterator
    Iterator<Map.Entry<String, Integer>> iterator = hashtable
      .entrySet()
      .iterator();
    while (iterator.hasNext()) {
      Map.Entry<String, Integer> entry = iterator.next();
      String key = entry.getKey();
      int value3 = entry.getValue();
      // Process each key-value pair
      System.out.println(key + ": " + value3);
    }

    // Retrieving Size of the Hashtable
    int size = hashtable.size(); // Retrieves the number of key-value pairs in the Hashtable

    // Checking if Hashtable is Empty
    boolean isEmpty = hashtable.isEmpty(); // Checks if the Hashtable is empty

    // Clearing the Hashtable
    hashtable.clear();
    /*Implementing a HashTable:

        Implement a HashTable from scratch with methods like put(), get(), containsKey(), and remove().
        Finding Duplicate Elements in an Array:

        Find and return the duplicate elements from an array using a HashTable.
        Grouping Elements by Frequency:

        Given an array, group the elements by their frequency using a HashTable.
        Finding Two Numbers that Add up to a Given Sum:

        Given an array of integers and a target sum, find two numbers that add up to the sum using a HashTable.
        Longest Subarray with Given Sum:

        Find the length of the longest subarray in an array with a given sum using a HashTable.
        Checking if Two Strings are Anagrams:

        Given two strings, check if they are anagrams using a HashTable.
        Checking if a String is a Palindrome Permutation:

        Determine if a string can be rearranged into a palindrome using a HashTable.
        Counting Characters in a String:

        Count the occurrence of each character in a string using a HashTable.
        Finding the First Non-Repeated Character in a String:

        Find the first non-repeated character in a string using a HashTable.
        Implementing a Frequency Counter:

        Given two arrays, check if the second array contains the squares of the elements from the first array using a HashTable.*/
  }

  public void hashMap() {
    // Creating a HashMap
    HashMap<String, Integer> hashMap = new HashMap<>();

    // Adding Key-Value Pairs
    hashMap.put("apple", 10); // Adds a key-value pair to the HashMap
    hashMap.put("banana", 20);
    hashMap.put("cherry", 30);

    // Accessing Values
    int value = hashMap.get("apple"); // Retrieves the value associated with the key "apple"

    // Checking if Key Exists
    boolean containsKey = hashMap.containsKey("banana"); // Checks if the HashMap contains the key "banana"

    // Removing Key-Value Pairs
    hashMap.remove("cherry"); // Removes the key-value pair associated with the key "cherry"

    // Iterating over Key-Value Pairs
    // Using an enhanced for loop
    for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
      String key = entry.getKey();
      int value1 = entry.getValue();
      // Process each key-value pair
      System.out.println(key + ": " + value1);
    }

    // Using an Iterator
    Iterator<Map.Entry<String, Integer>> iterator = hashMap
      .entrySet()
      .iterator();
    while (iterator.hasNext()) {
      Map.Entry<String, Integer> entry = iterator.next();
      String key = entry.getKey();
      int value2 = entry.getValue();
      // Process each key-value pair
      System.out.println(key + ": " + value2);
    }

    // Retrieving Size of the HashMap
    int size = hashMap.size(); // Retrieves the number of key-value pairs in the HashMap

    // Checking if HashMap is Empty
    boolean isEmpty = hashMap.isEmpty(); // Checks if the HashMap is empty

    // Clearing the HashMap
    hashMap.clear(); // Removes all key-value pairs from the HashMap
    /*Implementing a HashMap:

        Implement a HashMap from scratch with methods like put(), get(), containsKey(), and remove().
        Finding the First Non-Repeated Integer in an Array:

        Given an array of integers, find the first non-repeated integer using a HashMap.
        Group Anagrams:

        Given an array of strings, group the anagrams together using a HashMap.
        Finding Duplicate Elements:

        Find and return the duplicate elements from an array using a HashMap.
        Most Frequently Occurring Element:

        Find the most frequently occurring element in an array using a HashMap.
        Check if Two Strings are Anagrams:

        Given two strings, check if they are anagrams using a HashMap.
        Longest Subarray with Equal Number of Zeros and Ones:

        Find the length of the longest subarray in an array containing an equal number of zeros and ones using a HashMap.
        Checking Array Pair Sum:

        Given an array and a sum, find all pairs of elements that add up to the given sum using a HashMap.
        Implementing a LRU Cache:

        Implement a Least Recently Used (LRU) cache using a HashMap and a doubly linked list.
        Employee Hierarchy Problem:

        Given a list of employees and their managers, build an employee hierarchy using a HashMap. */
  }

  public void stacks() {
    // Creating a Stack
    Stack<Integer> stack = new Stack<>();

    // Pushing Elements onto the Stack
    stack.push(10); // Adds an element to the top of the stack
    stack.push(20);
    stack.push(30);

    // Popping Elements from the Stack
    int poppedElement = stack.pop(); // Removes and returns the top element from the stack

    // Peeking at the Top Element
    int topElement = stack.peek(); // Retrieves the top element from the stack without removing it

    // Checking if the Stack is Empty
    boolean isEmpty = stack.isEmpty(); // Checks if the stack is empty

    // Getting the Size of the Stack
    int size = stack.size(); // Retrieves the number of elements in the stack

    // Searching for an Element in the Stack
    int position = stack.search(20); // Returns the 1-based position of the element in the stack

    // Iterating over Elements in the Stack
    for (Integer element : stack) {
      // Process each element
      System.out.println(element);
    }

    // Clearing the Stack
    stack.clear(); // Removes all elements from the stack
    /* 

    Implementing a Stack:

        Implement a stack from scratch with methods like push(), pop(), peek(), and isEmpty().
        Validating Parentheses:

        Given a string containing parentheses, braces, and brackets, determine if the brackets are balanced using a stack.
        Evaluating Postfix Expressions:

        Evaluate a given postfix expression using a stack. The expression may contain operators (+, -, *, /) and operands.
        Next Greater Element:

        Given an array, find the next greater element for each element in the array using a stack.
        Reverse a Stack:

        Reverse the order of elements in a stack using only stack operations (push, pop, peek).
        Minimum Stack:

        Design a stack that supports a getMin() operation to retrieve the minimum element in constant time.
        Infix to Postfix Conversion:

        Convert a given infix expression to postfix notation using a stack.
        Implementing a Function Call Stack:

        Simulate a function call stack by implementing a stack that supports function calls, parameters, and return values.
        Stock Span Problem:

        Given an array representing the daily stock prices, determine the span of each stock price using a stack.
        Implementing Undo/Redo functionality:

        Implement a stack-based data structure to support undo and redo operations, such as in a text editor or command history.*/
  }

  public void queue() {
    // Creating a Queue
    Queue<Integer> queue = new LinkedList<>();

    // Adding Elements to the Queue
    queue.add(10); // Adds an element to the back of the queue
    queue.offer(20);
    queue.offer(30);

    // Removing Elements from the Queue
    int frontElement = queue.remove(); // Removes and returns the front element from the queue
    frontElement = queue.poll(); // Removes and returns the front element from the queue

    // Peeking at the Front Element
    frontElement = queue.peek(); // Retrieves the front element without removing it

    // Checking if the Queue is Empty
    boolean isEmpty = queue.isEmpty(); // Checks if the queue is empty

    // Retrieving the Size of the Queue
    int size = queue.size(); // Retrieves the number of elements in the queue

    // Iterating over Elements in the Queue
    for (Integer element : queue) {
      // Process each element
      System.out.println(element);
    }

    // Using an Iterator
    Iterator<Integer> iterator = queue.iterator();
    while (iterator.hasNext()) {
      Integer element = iterator.next();
      // Process each element
      System.out.println(element);
    }

    // Retrieving the Front Element (throws exception if queue is empty)
    frontElement = queue.element();

    // Checking if an Element Exists in the Queue
    boolean containsElement = queue.contains(20);
    /*Implementing a Queue:

        Implement a queue from scratch with methods like enqueue(), dequeue(), peek(), and isEmpty().
        Designing a Circular Queue:

        Design a circular queue with methods like enqueue(), dequeue(), isFull(), and isEmpty().
        Implementing a Recent Order Tracker:

        Design a data structure that keeps track of the most recent N elements added to a queue.
        First Non-Repeating Character:

        Given a string, find the first non-repeating character using a queue.
        Sliding Window Maximum:

        Given an array and a sliding window size, find the maximum element in each sliding window using a queue.
        Rotating a Queue:

        Rotate the elements of a queue by a given number of positions.
        Interleave the First Half of Queue with Second Half:

        Rearrange the elements of a queue such that the first half is interleaved with the second half.
        Implementing a Queue using Stacks:

        Implement a queue using two stacks, ensuring that enqueue and dequeue operations have constant amortized time complexity.
        Implementing a Priority Queue:

        Implement a priority queue using a min-heap or max-heap data structure.
        Implementing a Recent Calls Counter:

        Design a data structure that tracks the number of recent calls made within a specific time frame.*/

  }

  public void twoDimensionalArray() {
    /* Declaring a 2D Array */
    int[][] intTwoDArray;

    /* Initializing an empty 2D Array */
    intTwoDArray = new int[3][5];

    /* Declaring and initializing a 2D Array with values */
    String[][] stringTwoDArray = {
      { "working", "with" },
      { "2D", "arrays" },
      { "is", "fun" },
    };

    /* Accessing a Stored Element */
    String stored = stringTwoDArray[0][0];
    System.out.println("Element stored in stringTwoDArray[0][0]: " + stored);

    /*
     * Getting the Number of Subarrays (Rows) and Number of Elements in a Subarray
     * (Columns)
     */
    int numSubarrays = stringTwoDArray.length; // Number of rows
    int rows = numSubarrays;
    int subArrayLength = stringTwoDArray[0].length; // Number of columns
    int columns = subArrayLength;

    /*
     * Row-Major Traversing - Traverses through the 2D Array row by row
     */
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.println(
          "Row-Major print of stringTwoDArray[" +
          i +
          "][" +
          j +
          "] is: " +
          stringTwoDArray[i][j]
        );
      }
    }

    /* Adding Values to an Empty 2D Array */
    Random rand = new Random();
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        intTwoDArray[i][j] = rand.nextInt(100);
        System.out.println(
          "The number in index intTwoDArray[" +
          i +
          "][" +
          j +
          "] is: " +
          intTwoDArray[i][j]
        );
      }
    }

    /*
     * Column-Major Traversing - Traverses through the 2D Array column by column
     */
    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < rows; j++) {
        System.out.println(
          "Column-Major print of stringTwoDArray[" +
          j +
          "][" +
          i +
          "] is: " +
          stringTwoDArray[j][i]
        );
      }
    }

    int[][] twoDArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    // Iterating through the 2D array using stream and forEach
    Arrays
      .stream(twoDArray)
      .flatMapToInt(Arrays::stream)
      .forEach(System.out::println);
    /* 
      Traversing a 2D array: Write code to iterate through all elements of a 2D array row by row or column by column.

        Finding an element in a 2D array: Given a value, write code to search for the value in a 2D array and return its position (row and column).

        Finding the maximum or minimum value in a 2D array: Write code to find the maximum or minimum value in a 2D array and return its position.

        Rotating a 2D array: Given a square matrix (2D array), write code to rotate it 90 degrees clockwise or counterclockwise.

        Summing elements in a 2D array: Write code to calculate the sum of all elements in a 2D array or the sum of elements in each row or column.

        Checking for a specific pattern in a 2D array: Given a pattern or sub-matrix, write code to check if the pattern exists in a larger 2D array.

        Modifying elements in a 2D array: Write code to modify specific elements in a 2D array based on certain conditions or rules.

        Finding the number of islands in a 2D array: Given a 2D array representing land and water, write code to count the number of islands (connected land cells).

        Calculating the transpose of a 2D array: Write code to calculate the transpose of a 2D array (rows become columns and vice versa).

        Performing matrix operations: Write code to perform matrix operations such as matrix multiplication, addition, or subtraction.
        */
  }

  public static void main(String[] args) {
    JavaReview review = new JavaReview();
    // review.arrays();
    // review.randomNumber();
    // review.arrayList();
    // review.conversions();
    // review.stringManipulation();
    // review.fileManipulation();
    review.conditionals();
    // review.twoDementionalArray();
  }
}
