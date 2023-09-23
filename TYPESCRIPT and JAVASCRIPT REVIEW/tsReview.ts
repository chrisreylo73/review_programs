// How to run in terminal mode
// compile
/*tsc tsReview.ts or if you have a tsconfig.json file just tsc*/
// run
/*node tsReview.js*/

console.log('Hello, world! 🙌');

mathOperations();
stringManipulation();
conditionals();
allLoopExamples();
conversions(42);
conversions("3.14");

function mathOperations(): void {
   // Basic Arithmetic
   const num1: number = 10;
   const num2: number = 5;
   const sum: number = num1 + num2;
   const difference: number = num1 - num2;
   const product: number = num1 * num2;
   const quotient: number = num1 / num2;
 
   // Exponents and Square Roots
   const base: number = 2;
   const exponent: number = 3;
   const result1: number = Math.pow(base, exponent);
   const result2: number = Math.sqrt(16);
 
   // Trigonometric Functions
   const angleInRadians: number = Math.PI / 4;
   const sine: number = Math.sin(angleInRadians);
   const cosine: number = Math.cos(angleInRadians);
   const tangent: number = Math.tan(angleInRadians);
 
   // Rounding Numbers
   const decimalNumber: number = 5.6;
   const rounded1: number = Math.round(decimalNumber);
   const floorValue: number = Math.floor(decimalNumber);
   const ceilValue: number = Math.ceil(decimalNumber);
 
   // Random Numbers
   const randomFraction: number = Math.random();
   const randomNumberInRange: number = Math.floor(Math.random() * 10);
 
   // Absolute Value
   const num: number = -5;
   const absoluteValue: number = Math.abs(num);
 
   // Rounding to a Specified Decimal Place
   const pi: number = Math.PI;
   const roundedToTwoDecimals: number = Math.round(pi * 100) / 100;
 
   // Logarithmic Functions
   const number: number = 1000;
   const naturalLog: number = Math.log(number);
   const base10Log: number = Math.log10(number);
 
   // Math Constants
   const piConstant: number = Math.PI;
   const eulerConstant: number = Math.E;
 
   // Degree to Radian Conversion
   const degrees: number = 90;
   const radians: number = (degrees * Math.PI) / 180;
 
   // Min and Max Values
   const minValue: number = Math.min(2, 4, 1, 7, 3);
   const maxValue: number = Math.max(2, 4, 1, 7, 3);
 
   // Check for NaN (Not-a-Number)
   const value1: number = 42;
   const value2: number = NaN;
   const isValue1NaN: boolean = isNaN(value1);
   const isValue2NaN: boolean = isNaN(value2);
 
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

function stringManipulation(): void{

   //  Concatenate Strings:

   let str1 = "Hello";
   let str2 = "World";
   let combined = str1 + " " + str2; // Using the + operator
   let concatenated = str1.concat(" ", str2); // Using the concat method
   console.log(` --- Concatenate Strings: ---`);
   console.log(` ORIGINAL STRING'S = ${str1} , ${str2}`);
   console.log(` concat method 1 = ${combined}`);
   console.log(` concat method 2 = ${concatenated}`);
   console.log("\n");
   
   // Substring and Slicing:

   let str = "Hello, TypeScript";
   let substring = str.substring(0, 5); // "Hello"
   let sliced = str.slice(7, 16); // "TypeScript"
   let bracketNotation = str[0]; // "H"
   console.log(` --- Substring and Slicing: ---`);
   console.log(` ORIGINAL STRING = ${str}`);
   console.log(` substring = ${substring}`);
   console.log(` sliced = ${sliced}`);
   console.log(` get single character = ${bracketNotation}`);
   console.log("\n");
   
   // String Length:
   
   str = "Hello, TypeScript";
   let length = str.length; // 17
   console.log(` --- String Length: ---`)
   console.log(` ORIGINAL STRING = ${str}`);
   console.log(` length = ${length}`);
   console.log("\n");
   
   // Uppercase and Lowercase:

   str = "Hello";
   let upper = str.toUpperCase(); // "HELLO"
   let lower = str.toLowerCase(); // "hello"
   console.log(` --- Uppercase and Lowercase: ---`);
   console.log(` ORIGINAL STRING = ${str}`);
   console.log(` toUpperCase = ${upper}`);
   console.log(` toLowerCase= ${lower}`);
   console.log("\n");
   
   // Replace Substrings:

   str = "Hello, World";
   let replaced = str.replace("World", "TypeScript"); // "Hello, TypeScript"
   console.log(` --- Replace Substrings: ---`);
   console.log(`replacing = ${replaced}`);
   console.log("\n");
   
   // Trim Whitespace:

   str = "   Hello, TypeScript   ";
   let trimmed = str.trim(); // "Hello, TypeScript"
   console.log(` --- Trim Whitespace: ---`);
   console.log(` Trim Whitespace = ${trimmed}`);
   console.log("\n");
   
   //Split into an Array:

   str = "apple,banana,orange";
   let parts = str.split(","); // ["apple", "banana", "orange"]
   console.log(` --- Split into an Array: ---`);
   console.log(`Split into an Array = ${parts}`);
   console.log("\n");
   
   // Template Literals:

   let name = "Alice";
   let greeting = `Hello, ${name}! How are you today?`;
   console.log(` --- Template Literals: ---`);
   console.log(`Template Literals = ${greeting}`);
   console.log("\n");

   // Substring with Negative Indices:

   str = "Hello, TypeScript";
   let lastChars = str.slice(-10); // "TypeScript"
   console.log(` --- Substring with Negative Indices: ---`)
   console.log(` ORIGINAL STRING = ${str}`);
   console.log(` lastChars = ${lastChars}`);
   console.log("\n");

   // Find and Replace All Occurrences:

   str = "apple, banana, apple, orange";
   let replacedAll = str.replace(/apple/g, "fruit"); // "fruit, banana, fruit, orange"
   console.log(` --- Find and Replace All Occurrences: ---`)
   console.log(` ORIGINAL STRING = ${str}`);
   console.log(`replacedAll = ${replacedAll}`);
   console.log("\n");

   // String Interpolation with String Templates:

   let product = "Widget";
   let price = 19.99;
   let formattedString = `Product: ${product}, Price: $${price.toFixed(2)}`;
   console.log(` --- String Interpolation with String Templates: ---`)
   console.log(` ORIGINAL VARIABLES = product: ${product} & price: ${price}`);
   console.log(` formattedString = ${formattedString}`);
   console.log("\n");
  
   // Check if a String Starts or Ends with a Substring:

   str = "Hello, TypeScript";
   let startsWithHello = str.startsWith("Hello"); // true
   let endsWithTypeScript = str.endsWith("TypeScript"); // true
   console.log(` --- Check if a String Starts or Ends with a Substring: ---`)
   console.log(` ORIGINAL STRING = ${str}`);
   console.log(` startsWithHello = ${startsWithHello}`);
   console.log(` endsWithTypeScript = ${endsWithTypeScript}`);
   console.log("\n");
   
   // Pad a String:

   str = "42";
   let paddedStart = str.padStart(5, "0"); // "00042"
   let paddedEnd = str.padEnd(5, "0"); // "42000"
   console.log(` --- Pad a String: ---`)
   console.log(` ORIGINAL STRING = ${str}`);
   console.log(` paddedStart = ${paddedStart}`);
   console.log(` paddedEnd = ${paddedEnd}`);
   console.log("\n");
   
   // Regular Expressions:

   str = "Hello, TypeScript";
   let matches = str.match(/T[a-z]+/i); // ["TypeScript"]
   console.log(` --- Regular Expressions: ---`)
   console.log(` ORIGINAL STRING = ${str}`);
   console.log(` matches = ${matches}`);
   console.log("\n");
 
   // String Reversal:

   str = "Hello";
   let reversed = str.split("").reverse().join(""); // "olleH"
   console.log(` --- String Reversal: ---`)
   console.log(` ORIGINAL STRING = ${str}`);
   console.log(` reversed = ${reversed}`);
   console.log("\n");
   
   // String Comparison:

   str1 = "apple";
   str2 = "banana";
   let comparison = str1.localeCompare(str2); // -1 (str1 comes before str2)
   console.log(` --- String Comparison: ---`)
   console.log(` ORIGINAL STRING'S = ${str1} , ${str2}`);
   console.log(` comparison = ${comparison}`);
   console.log("\n");
}

function conditionals(): void {
   const number1: number = 10;
   const number2: number = 5;
 
   // if statement
   if (number1 > number2) {
     console.log("number1 is greater than number2");
   }
 
   // if-else statement
   if (number1 > number2) {
     console.log("number1 is greater than number2");
   } else {
     console.log("number2 is greater than or equal to number1");
   }
 
   // else-if ladder
   if (number1 > number2) {
     console.log("number1 is greater than number2");
   } else if (number1 < number2) {
     console.log("number2 is greater than number1");
   } else {
     console.log("number1 and number2 are equal");
   }
 
   // Ternary conditionals operator (? :)
   const result: string = number1 > number2 ? "number1 is greater" : "number2 is greater or equal";
   console.log(result);
 
   // switch statement
   const fruit: string = "apple";
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
 
 function allLoopExamples(): void {
   // For Loop
   console.log("For Loop:");
   for (let i = 1; i <= 5; i++) {
     console.log(`Iteration ${i}`);
   }
 
   // While Loop
   console.log("\nWhile Loop:");
   let count = 0;
   while (count < 5) {
     console.log(`Iteration ${count + 1}`);
     count++;
   }
 
   // Do-While Loop
   console.log("\nDo-While Loop:");
   let num = 5;
   do {
     console.log(`Countdown: ${num}`);
     num--;
   } while (num > 0);
 
   // For...of Loop (Iterating Over Arrays)
   console.log("\nFor...of Loop:");
   const colors: string[] = ["red", "green", "blue"];
   for (const color of colors) {
     console.log(color);
   }
 
   // Nested Loops
   console.log("\nNested Loops:");
   for (let i = 1; i <= 3; i++) {
     for (let j = 1; j <= 3; j++) {
       console.log(`(${i},${j})`);
     }
   }
 
   // Break and Continue Statements
   console.log("\nBreak and Continue:");
   for (let i = 1; i <= 5; i++) {
     if (i === 3) {
       continue; // Skip iteration when i is 3
     }
     if (i === 4) {
       break; // Exit the loop when i is 4
     }
     console.log(`Iteration ${i}`);
   }
 
   // Loop Control Variables
   console.log("\nLoop Control Variables:");
   let sum = 0;
   for (let i = 1; i <= 5; i++) {
     sum += i;
   }
   console.log(`Sum of numbers from 1 to 5: ${sum}`);
 
   // Infinite Loop with a Break Condition
   console.log("\nInfinite Loop with Break:");
   let infiniteLoopCount = 0;
   while (true) {
     if (infiniteLoopCount === 5) {
       break; // Exit the loop when count is 5
     }
     console.log(`Iteration ${infiniteLoopCount}`);
     infiniteLoopCount++;
   }
 }

 function conversions(input: number | string): void {
  if (typeof input === 'number') {
    // Number to String
    const stringNumber = input.toString();
    console.log("Number to String:", stringNumber);

    // Number to Binary String
    const binaryString = input.toString(2);
    console.log("Number to Binary String:", binaryString);

    // Number to Hexadecimal String
    const hexString = input.toString(16);
    console.log("Number to Hexadecimal String:", hexString);
  } else if (typeof input === 'string') {
    // String to Number
    const parsedNumber = parseFloat(input);
    console.log("String to Number:", parsedNumber);

    // String to Integer (using parseInt)
    const parsedInteger = parseInt(input, 10);
    console.log("String to Integer:", parsedInteger);

    // String to Binary Number (convert back to number)
    const binaryNumber = parseInt(input, 2);
    console.log("Binary String to Number:", binaryNumber);

    // String to Hexadecimal Number (convert back to number)
    const hexNumber = parseInt(input, 16);
    console.log("Hexadecimal String to Number:", hexNumber);
  } else {
    console.log("Invalid input type. Please provide a number or a string.");
  }
}





