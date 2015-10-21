// Maryam Athar Khan
// Homework 08 part 2
// Due date is October 20, 2015
// This program is designed to process, parts or a complete, string and determine if they are letters
import java.util.Scanner; // import java class from outside
public class StringAnalysis { // define a class
   public static boolean analysis(String input) { // define the first anaylsis method that runs for the entire string. Method returns a boolean
   char c; // declare char c
   boolean letters = false; // declare letters variable
   for (int i=0;i<input.length();i++) { // loop runs until i is less than the string length
      c=input.charAt(i); // character at the position i 
      if (Character.isLetter(c)==true) { // if the character is a letter 
         letters = true; // assign true to letters
         break; // break and exit. Once you find a letter, there is no need to check the other characters
         } // end of if statement
      else { // else
         letters=false; // assign false to letters
      } // end of else statement
   } // end of loop
   return letters; // return letters
} // end of first analysis method
   public static boolean analysis(String input, int x ) { // define the second analysis method which processes a part fo the string
      char c; // declare char c
      boolean letters=true; // declare letters variable
      if (x>input.length()) { // if x is greater than the number of characters in a string
         letters=analysis(input); // run the first method which processes the entire string 
      } // end of if statement
      else { // otherwise
         for (int i=0;i<x;i++) { // loop runs until i is less than int x
            c=input.charAt(i); // character at position i
            if (Character.isLetter(c)==true) { // if character is a letter
               letters=true; // assign true to letters
               break; // break and exit since there is no need to check the other characters
               } // end of if statement
            else { // otherwise
               letters=false; // assign false to letters
               } // end of else statement
         } // end of loop
      } // end of big else
      return letters; // return letters
   } // end of second analysis method that accepts a string and an int 
   public static void main(String[] args) { // define the main method
   Scanner myScanner= new Scanner(System.in); // declare Scanner variable
   System.out.print("Please type in a string: "); // ask user to input string
   String str=myScanner.next(); // declare str and assign user's input to it
   System.out.print("Type in All if you want to examine all the characters. Otherwise type in Certain: "); // Asks user to type All or Certain
   String a="All"; // declare string a and assign All to it
   String b="Certain"; // declare string b and assign Certain to it 
   String input=myScanner.next(); // declare string input and assign user's input to it 
   boolean letters=true; // declare letters variable
   int x=0; // declare x which tells you how many characters to check
   while (true) { // loop always run
      if (input.equals(a) || input.equals(b) ) { // if user typed in All or Certain
         break; // break and exit the loop
      } // end of if statement
      else { // otherwise 
         System.out.println("ERROR. Please only type in All or Certain."); // display error message
         System.out.print("Type in All if you want to examine all the characters. Otherwise type in Certain: ");// prompt user again
         input=myScanner.next();// collects whatever the user inputs
      } // end of else statement
   } // end of while loop
   if (input.equals(a)) { // if user inputs All
      letters=analysis(str); // run the first analysis method with the entire string
      if (letters==true) { // if letters is true 
         System.out.println("Letters found."); // print that letters are found
      } // end of if statement 
      else { // otherwise if letters is false
         System.out.println("No letters found. "); // print that no letters are found
      } // end of else statement
   } // end of if user wants All statement
   if (input.equals(b)) { // if user inputs Certain
      System.out.print("Please input how many characters you would like to check: "); // ask what x should be
      while (true) { // loop always runs
           if (myScanner.hasNextInt()) { // if input is an int
               x=myScanner.nextInt(); // assign it to x
               break; // break and exit
           } // end of if statement
           else { // otherwise 
               System.out.print("Sorry, you did not enter an integer value. Try again: ");// error message and prompt user again
               myScanner.next(); // whatever user inputs
           } // end of else statement
       } // end of while loop
       letters=analysis(str,x); // run second analysis method where only part of a string is processed by using int x
       if (letters==true) { // if letters is true
          System.out.println("Letters found."); // print that letters are found
       } // end of if statement
       else { // otherwise
          System.out.println("No letters found."); // print that no letters are found
       } // end of else statement
   } // end of if user wants Certain statement
   
   } // end of main method 
} // end of class