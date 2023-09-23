"use strict";
// How to run in terminal mode
// compile
/*tsc*/
// run
/*node tsReview.js*/
// import * as fs from 'fs';
console.log('Hello, world! 🙌');

function mathOperations() {
    // Basic Arithmetic
    var num1 = 10;
    var num2 = 5;
    var sum = num1 + num2;
    var difference = num1 - num2;
    var product = num1 * num2;
    var quotient = num1 / num2;
    // Exponents and Square Roots
    var base = 2;
    var exponent = 3;
    var result1 = Math.pow(base, exponent);
    var result2 = Math.sqrt(16);
    // Trigonometric Functions
    var angleInRadians = Math.PI / 4;
    var sine = Math.sin(angleInRadians);
    var cosine = Math.cos(angleInRadians);
    var tangent = Math.tan(angleInRadians);
    // Rounding Numbers
    var decimalNumber = 5.6;
    var rounded1 = Math.round(decimalNumber);
    var floorValue = Math.floor(decimalNumber);
    var ceilValue = Math.ceil(decimalNumber);
    // Random Numbers
    var randomFraction = Math.random();
    var randomNumberInRange = Math.floor(Math.random() * 10);
    // Absolute Value
    var num = -5;
    var absoluteValue = Math.abs(num);
    // Rounding to a Specified Decimal Place
    var pi = Math.PI;
    var roundedToTwoDecimals = Math.round(pi * 100) / 100;
    // Logarithmic Functions
    var number = 1000;
    var naturalLog = Math.log(number);
    var base10Log = Math.log10(number);
    // Math Constants
    var piConstant = Math.PI;
    var eulerConstant = Math.E;
    // Degree to Radian Conversion
    var degrees = 90;
    var radians = (degrees * Math.PI) / 180;
    // Min and Max Values
    var minValue = Math.min(2, 4, 1, 7, 3);
    var maxValue = Math.max(2, 4, 1, 7, 3);
    // Check for NaN (Not-a-Number)
    var value1 = 42;
    var value2 = NaN;
    var isValue1NaN = isNaN(value1);
    var isValue2NaN = isNaN(value2);
    // Logging the results
    console.log("Basic Arithmetic:");
    console.log("Sum:", sum);
    console.log("Difference:", difference);
    console.log("Product:", product);
    console.log("Quotient:", quotient);
    console.log("\nExponents and Square Roots:");
    console.log("2^3:", result1);
    console.log("Square root of 16:", result2);
    console.log("\nTrigonometric Functions:");
    console.log("Sine:", sine);
    console.log("Cosine:", cosine);
    console.log("Tangent:", tangent);
    console.log("\nRounding Numbers:");
    console.log("Rounded:", rounded1);
    console.log("Floor Value:", floorValue);
    console.log("Ceil Value:", ceilValue);
    console.log("\nRandom Numbers:");
    console.log("Random Fraction:", randomFraction);
    console.log("Random Number in Range (0-9):", randomNumberInRange);
    console.log("\nAbsolute Value:");
    console.log("Absolute Value:", absoluteValue);
    console.log("\nRounding to a Specified Decimal Place:");
    console.log("Rounded to Two Decimals:", roundedToTwoDecimals);
    console.log("\nLogarithmic Functions:");
    console.log("Natural Logarithm (ln):", naturalLog);
    console.log("Base 10 Logarithm:", base10Log);
    console.log("\nMath Constants:");
    console.log("PI Constant:", piConstant);
    console.log("Euler's Constant:", eulerConstant);
    console.log("\nDegree to Radian Conversion:");
    console.log("90 Degrees to Radians:", radians);
    console.log("\nMin and Max Values:");
    console.log("Min Value:", minValue);
    console.log("Max Value:", maxValue);
    console.log("\nCheck for NaN (Not-a-Number):");
    console.log("Is Value 1 NaN?", isValue1NaN);
    console.log("Is Value 2 NaN?", isValue2NaN);
}
function stringManipulation() {
    //  Concatenate Strings:
    var str1 = "Hello";
    var str2 = "World";
    var combined = str1 + " " + str2; // Using the + operator
    var concatenated = str1.concat(" ", str2); // Using the concat method
    console.log(" --- Concatenate Strings: ---");
    console.log(" ORIGINAL STRING'S = ".concat(str1, " , ").concat(str2));
    console.log(" concat method 1 = ".concat(combined));
    console.log(" concat method 2 = ".concat(concatenated));
    console.log("\n");
    // Substring and Slicing:
    var str = "Hello, TypeScript";
    var substring = str.substring(0, 5); // "Hello"
    var sliced = str.slice(7, 16); // "TypeScript"
    var bracketNotation = str[0]; // "H"
    console.log(" --- Substring and Slicing: ---");
    console.log(" ORIGINAL STRING = ".concat(str));
    console.log(" substring = ".concat(substring));
    console.log(" sliced = ".concat(sliced));
    console.log(" get single character = ".concat(bracketNotation));
    console.log("\n");
    // String Length:
    str = "Hello, TypeScript";
    var length = str.length; // 17
    console.log(" --- String Length: ---");
    console.log(" ORIGINAL STRING = ".concat(str));
    console.log(" length = ".concat(length));
    console.log("\n");
    // Uppercase and Lowercase:
    str = "Hello";
    var upper = str.toUpperCase(); // "HELLO"
    var lower = str.toLowerCase(); // "hello"
    console.log(" --- Uppercase and Lowercase: ---");
    console.log(" ORIGINAL STRING = ".concat(str));
    console.log(" toUpperCase = ".concat(upper));
    console.log(" toLowerCase= ".concat(lower));
    console.log("\n");
    // Replace Substrings:
    str = "Hello, World";
    var replaced = str.replace("World", "TypeScript"); // "Hello, TypeScript"
    console.log(" --- Replace Substrings: ---");
    console.log("replacing = ".concat(replaced));
    console.log("\n");
    // Trim Whitespace:
    str = "   Hello, TypeScript   ";
    var trimmed = str.trim(); // "Hello, TypeScript"
    console.log(" --- Trim Whitespace: ---");
    console.log(" Trim Whitespace = ".concat(trimmed));
    console.log("\n");
    //Split into an Array:
    str = "apple,banana,orange";
    var parts = str.split(","); // ["apple", "banana", "orange"]
    console.log(" --- Split into an Array: ---");
    console.log("Split into an Array = ".concat(parts));
    console.log("\n");
    // Template Literals:
    var name = "Alice";
    var greeting = "Hello, ".concat(name, "! How are you today?");
    console.log(" --- Template Literals: ---");
    console.log("Template Literals = ".concat(greeting));
    console.log("\n");
    // Substring with Negative Indices:
    str = "Hello, TypeScript";
    var lastChars = str.slice(-10); // "TypeScript"
    console.log(" --- Substring with Negative Indices: ---");
    console.log(" ORIGINAL STRING = ".concat(str));
    console.log(" lastChars = ".concat(lastChars));
    console.log("\n");
    // Find and Replace All Occurrences:
    str = "apple, banana, apple, orange";
    var replacedAll = str.replace(/apple/g, "fruit"); // "fruit, banana, fruit, orange"
    console.log(" --- Find and Replace All Occurrences: ---");
    console.log(" ORIGINAL STRING = ".concat(str));
    console.log("replacedAll = ".concat(replacedAll));
    console.log("\n");
    // String Interpolation with String Templates:
    var product = "Widget";
    var price = 19.99;
    var formattedString = "Product: ".concat(product, ", Price: $").concat(price.toFixed(2));
    console.log(" --- String Interpolation with String Templates: ---");
    console.log(" ORIGINAL VARIABLES = product: ".concat(product, " & price: ").concat(price));
    console.log(" formattedString = ".concat(formattedString));
    console.log("\n");
    // Check if a String Starts or Ends with a Substring:
    str = "Hello, TypeScript";
    var startsWithHello = str.startsWith("Hello"); // true
    var endsWithTypeScript = str.endsWith("TypeScript"); // true
    console.log(" --- Check if a String Starts or Ends with a Substring: ---");
    console.log(" ORIGINAL STRING = ".concat(str));
    console.log(" startsWithHello = ".concat(startsWithHello));
    console.log(" endsWithTypeScript = ".concat(endsWithTypeScript));
    console.log("\n");
    // Pad a String:
    str = "42";
    var paddedStart = str.padStart(5, "0"); // "00042"
    var paddedEnd = str.padEnd(5, "0"); // "42000"
    console.log(" --- Pad a String: ---");
    console.log(" ORIGINAL STRING = ".concat(str));
    console.log(" paddedStart = ".concat(paddedStart));
    console.log(" paddedEnd = ".concat(paddedEnd));
    console.log("\n");
    // Regular Expressions:
    str = "Hello, TypeScript";
    var matches = str.match(/T[a-z]+/i); // ["TypeScript"]
    console.log(" --- Regular Expressions: ---");
    console.log(" ORIGINAL STRING = ".concat(str));
    console.log(" matches = ".concat(matches));
    console.log("\n");
    // String Reversal:
    str = "Hello";
    var reversed = str.split("").reverse().join(""); // "olleH"
    console.log(" --- String Reversal: ---");
    console.log(" ORIGINAL STRING = ".concat(str));
    console.log(" reversed = ".concat(reversed));
    console.log("\n");
    // String Comparison:
    str1 = "apple";
    str2 = "banana";
    var comparison = str1.localeCompare(str2); // -1 (str1 comes before str2)
    console.log(" --- String Comparison: ---");
    console.log(" ORIGINAL STRING'S = ".concat(str1, " , ").concat(str2));
    console.log(" comparison = ".concat(comparison));
    console.log("\n");
}
function conditionalExamples() {
    var number1 = 10;
    var number2 = 5;
    // if statement
    if (number1 > number2) {
        console.log("number1 is greater than number2");
    }
    // if-else statement
    if (number1 > number2) {
        console.log("number1 is greater than number2");
    }
    else {
        console.log("number2 is greater than or equal to number1");
    }
    // else-if ladder
    if (number1 > number2) {
        console.log("number1 is greater than number2");
    }
    else if (number1 < number2) {
        console.log("number2 is greater than number1");
    }
    else {
        console.log("number1 and number2 are equal");
    }
    // Ternary conditional operator (? :)
    var result = number1 > number2 ? "number1 is greater" : "number2 is greater or equal";
    console.log(result);
    // switch statement
    var fruit = "apple";
    switch (fruit) {
        case "apple":
            console.log("It's an apple.");
            break;
        case "banana":
            console.log("It's a banana.");
            break;
        case "cherry":
            console.log("It's a cherry.");
            break;
        default:
            console.log("It's an unknown fruit.");
    }
}
function allLoopExamples() {
    // For Loop
    console.log("For Loop:");
    for (var i = 1; i <= 5; i++) {
        console.log("Iteration ".concat(i));
    }
    // While Loop
    console.log("\nWhile Loop:");
    var count = 0;
    while (count < 5) {
        console.log("Iteration ".concat(count + 1));
        count++;
    }
    // Do-While Loop
    console.log("\nDo-While Loop:");
    var num = 5;
    do {
        console.log("Countdown: ".concat(num));
        num--;
    } while (num > 0);
    // For...of Loop (Iterating Over Arrays)
    console.log("\nFor...of Loop:");
    var colors = ["red", "green", "blue"];
    for (var _i = 0, colors_1 = colors; _i < colors_1.length; _i++) {
        var color = colors_1[_i];
        console.log(color);
    }
    // For...in Loop (Iterating Over Object Properties)
    // console.log("\nFor...in Loop:");
    // const person = { name: "Alice", age: 30, city: "New York" };
    // for (const key in person) {
    //   console.log(`${key}: ${person[key]}`);
    // }
    // Nested Loops
    console.log("\nNested Loops:");
    for (var i = 1; i <= 3; i++) {
        for (var j = 1; j <= 3; j++) {
            console.log("(".concat(i, ",").concat(j, ")"));
        }
    }
    // Break and Continue Statements
    console.log("\nBreak and Continue:");
    for (var i = 1; i <= 5; i++) {
        if (i === 3) {
            continue; // Skip iteration when i is 3
        }
        if (i === 4) {
            break; // Exit the loop when i is 4
        }
        console.log("Iteration ".concat(i));
    }
    // Loop Control Variables
    console.log("\nLoop Control Variables:");
    var sum = 0;
    for (var i = 1; i <= 5; i++) {
        sum += i;
    }
    console.log("Sum of numbers from 1 to 5: ".concat(sum));
    // Infinite Loop with a Break Condition
    console.log("\nInfinite Loop with Break:");
    var infiniteLoopCount = 0;
    while (true) {
        if (infiniteLoopCount === 5) {
            break; // Exit the loop when count is 5
        }
        console.log("Iteration ".concat(infiniteLoopCount));
        infiniteLoopCount++;
    }
}
//  function readWriteFile(): void {
//    const inputFilePath: string = 'input.txt';
//    const outputFilePath: string = 'output.txt';
//    // Read from a file
//    fs.readFile(inputFilePath, 'utf8', (err: any, data: string) => {
//      if (err) {
//        console.error('Error reading file:', err);
//        return;
//      }
//      console.log('File contents:');
//      console.log(data);
//      // Modify the data (e.g., convert to uppercase)
//      const modifiedData: string = data.toUpperCase();
//      // Write to a file
//      fs.writeFile(outputFilePath, modifiedData, 'utf8', (err: any) => {
//        if (err) {
//          console.error('Error writing file:', err);
//          return;
//        }
//        console.log('Data written to output.txt');
//      });
//    });
//  }
// Call the readWriteFile function to read and write files
//  readWriteFile();
// Call the allLoopExamples function to see the results
allLoopExamples();
conditionalExamples();
stringManipulation();
mathOperations();
dataTypes(true, 2, 4, "Hello");
