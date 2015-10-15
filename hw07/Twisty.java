// Maryam Athar Khan
// Homework 07
// Due date is October 14,2015
// This program is designed to generate an 'X' pattern based on the user's desired lengths and widths

// import Scanner class
import java.util.Scanner;
// define a class
public class Twisty {
    // define a method
    public static void main(String[] args) {
        // Scanner class
        Scanner myScanner= new Scanner(System.in); 
        // declare length, width, column and line variables
        double length=0;
        double width=0;
        int column=0;
        int line=0;
        // prompt user for input
        System.out.print("Input your desired length: ");
        // while loop to see acceptable input or not
        while (myScanner.hasNextDouble()==false) {
                System.out.print("  Error: Please type in an integer."); // error message displayed
                System.out.println(" "); // space so the next output is printed on the next line
                System.out.print("Input your desired length: "); // prompt user again
                myScanner.nextLine(); // input added to Scanner
            }
          // assign double value to length
            length=myScanner.nextDouble();  
        while (length<0) { // loop runs if length is less than zero
            System.out.print("Please only enter a positive value. Try again: "); // error message and user is prompted again
            while(myScanner.hasNextDouble() == false){ // checking if value is an integer or not
                        System.out.print("Error: Please type in an integer."); // error message
                        System.out.println(""); // space so output is printed on the next line
                        System.out.print("Input your desired length: "); // prompt user again
                        String junk= myScanner.next(); // junk variable to store input 
                         }
                 length= myScanner.nextDouble(); // double value assigned to length
                 }
        while (length>80) { // loop runs if length is greater than 80
            System.out.print("Error. please enter a digit less than 80: "); // error message and prompt user again
            length=myScanner.nextDouble(); // value assigned to length
        }       
        // width
        System.out.print("Input your desired width: "); // prompt user to input width
        while (true) {
            if (myScanner.hasNextDouble()) { // if input value is a double
                width=myScanner.nextDouble(); // assign that value to width
                break; // break so it is not an infinite loop
            }
            else { // if it is not a double
                System.out.print("  Error: Please type in an integer. "); // display error message
                System.out.println(""); //space
                System.out.print("Input your desired width: "); // prompt user again
                myScanner.next(); // input stored in scanner
            }
        }
        while (width>length) { // loop runs if width is greater than length
            System.out.print("   Error: Please input an integer smaller than the length."); // error message
            System.out.println(""); // space
            System.out.print("Input your desired width: "); // prompt user again for width input
            width=myScanner.nextDouble(); // value assigned to double
        }
// declare char variables for # and /. Outchar is the character that will printed in the output. 
char first=' ';
char second=' ';
char outchar;
// base of one V is width*2. One base holds two 'X' patterns alternating. The first has '#' going down and the second has '#' going up. 
 
// Create a loop now. All examples given in the comment have width=7
for (line=1; line<width+1;line++) { // assign '1' to line. declare the condition than line should be less than (width+1). Increase line by 1 at the end of this loop. 
  for (column=1; column<length+1;column++) { // assign '1' to column. This loop will run in its entirety so all the column outputs will be printed in one line before it moves to the next line.
    if ((column-1)%(width*2)<width) { // if column lies before the width value column, it is the first pattern. eg. column=2. (2-1)%14=1 which is less than 7. So it is the first pattern.
        first='#'; // # goes down
        second='/'; // / goes up
    }
    else { // otherwise it is the second pattern. eg. column=12. (12-1)%14=11 which is greater than 7 so it is the second pattern
        first='\\'; // / goes down
        second='#';// # goes up
    } 
    if (column%width==line%width) { // first character is printed when col and line are the same. column 1 and line 1. if col1%7=line1%7...then the first character should be printed
        outchar=first; // output is first character
    }
    else if ((column+line)%width==1) { // second character lies in the positions: col 1 line 7, col 2 line 6, etc. So if (1+7)%7=1, print second character. eg2. (2+6)%7=1, print second character
        outchar=second; // output is second character
    }
    else { // otherwise
        outchar=' '; // output should be a space
    }
    System.out.print(outchar); // print outchar which is the output
  } // end inner loop
   System.out.println(" "); // print a space and then move to the next line so that the next line's output is actually generated onto the next line to create the pattern
} // end major loop

  } // end of method
    
} // end of class