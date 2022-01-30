import java.util.*;
import java.io.*;

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
        System.out.println("Random integer value from 0 to" + (upperbound - 1) + " : " + int_random);
        System.out.println("Random float value between 0.0 and 1.0 : " + float_random);
        System.out.println("Random double value between 0.0 and 1.0 : " + double_random);

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
        System.out.println("Changed element in index 0 : " + list2.set(0, "Changed String"));
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
        int indexFind = str5.indexOf("i");// finds first occurence of "i" and returns index
        System.out.println(indexFind);
        int lastIndexFind = str5.lastIndexOf("i");// Finds last occurence of "i" and returns index
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
        System.out.println("The character " + search + " occurs " + count + " times in the string " + str_sample);
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
        str_sample = str_sample.substring(0, 1).toUpperCase() + str_sample.substring(1, str_sample.length());
        System.out.println(str_sample);
        /* Make all of the upper case letters becide the first lowercase */
        str_sample = "AuRORa";
        str_sample = str_sample.substring(0, 1) + str_sample.substring(1, str_sample.length()).toLowerCase();
        System.out.println(str_sample);
        /* Find how many uppercase letters are in a string */
        str_sample = "HJKJGAKGnsndjkagka";
        int counter = 0;
        for (int j = 0; j < str_sample.length(); j++) {
            if (str_sample.substring(j, j + 1).equals(str_sample.substring(j, j + 1).toUpperCase())) {
                counter++;
            }
        }
        System.out.println("The number of upper case letters in this string is : " + counter);
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
                System.out.print((char) i);// prints a character at a time
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

    }

    public void hashTable() {

    }

    public void hashMap() {

    }

    public void list() {

    }

    public void stack() {

    }

    public void queue() {

    }

    public void twoDementionalArray() {
        /* Declaring a 2dArray */
        int[][] intTwoDArray;
        /* Initializing an empty 2dArray */
        intTwoDArray = new int[3][5];
        /* Declaring and initializing an 2dArray with vaules */
        String[][] stringTwoDArray = new String[][] { { "working", "with" },
                { "2D", "arrays" },
                { "is", "fun" } };
        /* Access a stored Element */
        String stored = stringTwoDArray[0][0];
        System.out.println("Element stored instringTwoDArray[0][0]: " + stored);
        /*
         * Store the number of subArrays in a 2d Array
         * A subarray is like this { "working", "with" } in out stringTwoDArray
         * AKA Number of rows
         */
        int numSubarrays = stringTwoDArray.length;
        int rows = numSubarrays;
        /*
         * Store the number of elements inside a subarray.
         * AKA Number of coulumns
         */
        int subArrayLength = stringTwoDArray[0].length;
        int columns = subArrayLength;
        /*
         * RowMajor traversing - traverses through row by row instead of column by
         * column
         */
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < columns; k++) {
                System.out.println(
                        "Row Major print of stringTwoDArray[" + i + "][+" + k + "] is : " + stringTwoDArray[i][k]);
            }
        }
        /* How to add values to an empty 2d array */
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < columns; k++) {
                intTwoDArray[i][k] = rand.nextInt(100);
                System.out.println("The number in index intTwoDArray[" + i + "][" + k + "] is : " + intTwoDArray[i][k]);
            }
        }
        /*
         * ColumnMajor traversing-traverses through column by column instead of row by
         * row
         */
        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                System.out.println(
                        "Column major print of stringTwoDArray[" + k + "][+" + i + "] is : " + stringTwoDArray[k][i]);
            }
        }

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
