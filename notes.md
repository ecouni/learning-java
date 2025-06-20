# 🖥️ Java Video Notes

This is my text file for notes taken from the java video

# 📝 Vocabulary Bank:

**Java Development Kit (JDK)** - Contains a compiler that compiles your written code into byte code to run on a machine. 

**Integraded Development Environment (IDE)** - A workspace where you can write code.

**Comment** - Notes in the program for comprehension //(single line) or /* */ (multi line).

**System.out.println()** - Used to output something to the console on a new line

**Variable** - Reusable Container for a value. Behaves as if it was the value it contains

**Primitive** - Simple value stored directly in memory (stack).

**Reference** - Memory address (stack) that points to the (heap).

**Scanner** - Can be used to accept user input. Needs to be imported


# Chapter Notes

## Chapter 1: Introduction
#### Learning Objective:  basics of programming, writing comments, and printing to console.

In order to write code you need both a jdk and a ide (using vscode).  
Firstly, you need to open up your class in your java file and then add in some default magic words. This can be done by using:

```java
public class Main {
    public static void main(String[] args){
        // Code Goes Here (This is a comment, it's just notes in the program to help with understanding.)
        /* 
         * Comments can be single lined or multi lined depending on what you need.
        */
    }
}
```

To output something to the console, you can print it using:
```java
System.out.print("hi!!") // Prints without the addition of a new line so addint on to whatever was already present (nothing in this case).
System.out.println("Hello World"); // This prints while also adding the subjec to a new line.
// adding  \n into a string also has a similar effect.
```
## Chapter 2: Variables
A variable contains a value and behaves like that value
There are primitive and reference variables.
```java
// Primitive Types are simple and easy to understand.
int wholeNum = 7; // an integer is a whole number
double decimalNum = 5.2; // a double is a value that contains a decimal
char letter = 'a'; // a character is a single letter or symbol
boolean test = True; // a boolean is just either a true or false value.

// Reference Variables are a bit more complex such as:
String name = "Shaniela"; // A string (Word or Phrase)
String[] Dogs = {"Billy", "Bob","Max"}; // A String Array (Containing multiple values)
// You are able to use these variables in place of the value they're storing.
System.out.println("My name is: " + name); // Should print "My name is: Shaniela"

```
## Chapter 3: User input
In order to  accept user input in java, we need a scanner which needs to be imported into your program. 
At the  top of your program you are going to write:
```java
import java.util.Scanner;
```
For a typical program we tend to:

    1) Accept input
    2) Process it
    3) Produce output
In order to accept user input create a scanner object
```java
    Scanner scanner = new Scanner(system.in); // the name of your scannner is the lowercase
    // you also want to close your scanner at the end of your program.
    scanner.close();
```

After prompting your user for input, you can use the scanner object to take in different variable types.
```java
System.out.print("Enter your name: ");
String name = scanner.nextLine; // takes in the entire next line
// you can also take in other types of variable:
scanner.nextBoolean();
scanner.nextByte(); 
scanner.nextDouble();
scanner.nextFloat();
scanner.nextInt();
scanner.nextLong();
scanner.nextShort();
scanner.next();
// In between assigning different scanners to variables, you can clear the scanner with just:
Scanner.nextLine();
// These all can be used to take in user data so it can be processed and worked with in order to give a output
```

## Chapter 4: Mad libs game
**Completed!!**
## Chapter 5: Arithmetic 
## Chapter 6: Shopping Cart Program
## Chapter 7: If Statements
## Chapter 8: Random Numbers
## Chapter 9: Math Class
## Chapter 10: Printf
## Chapter 11: Compound Interest Calculator
## Chapter 12: Nested If Statements
## Chapter 13: String Methods
## Chapter 14: Substrings
## Chapter 15: Weight Converter
## Chapter 16: Ternary Operator
## Chapter 17: Termperature Converter
## Chapter 18: Enhanced Switches
## Chapter 19: Calculator Program
## Chapter 20: Logical Operators
## Chapter 21: While loops
## Chapter 22: Number Guessing Game
## Chapter 23: For Loops
## Chapter 24: Break & Continue
## Chapter 25: Nested Loops
## Chapter 26: Methods
## Chapter 27: Overloaded Methods
## Chapter 28: Variable Scope
## Chapter 29: Banking Program
## Chapter 30: Dice Roller Program
## Chapter 31: Arrays
## Chapter 32: User Input in Arrays
## Chapter 33: Search Arrays
## Chapter 34: VarArgs
## Chapter 35: 2D Arrays
## Chapter 36: Quiz Game
## Chapter 37: Rock Paper Scissors
## Chapter 38: Slot Machine
## Chapter 39: Object-Oriented Programming
## Chapter 40: Constructors
## Chapter 41: Overloaded Constructors
## Chapter 42: Object Filled Arrays
## Chapter 43: Static
## Chapter 44: Inheritance
## Chapter 45: Super
## Chapter 46: Method Overriding
## Chapter 47: ToString Method
## Chapter 48: Abstraction
## Chapter 49: Interfaces
## Chapter 50: Polymorphism
## Chapter 51: Runtime Polymorphism
## Chapter 52: Getters and Setters
## Chapter 53: Aggregation
## Chapter 54: Compostion
## Chapter 55: Wrapper Classes
## Chapter 56: ArrayLists
## Chapter 57: Exception Handling
## Chapter 58: Write Files
## Chapter 59: Read Files
## Chapter 60: Music Player
## Chapter 61: Hangman Game
## Chapter 62: Dates & Tiems
## Chapter 63: Anonymous Classes
## Chapter 64: TimerTasks
## Chapter 65: Countdown Time
## Chapter 66: Genetics
## Chapter 67: Hashmaps 
## Chapter 68:Enums
## Chapter 69: Threading
## Chapter 70: MultiThreading
## Chapter 71: Alarm Clock