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
                System.out.print("  Error: Please type in an integer.");
                System.out.println(" ");
                System.out.print("Input your desired length: ");
                myScanner.nextLine(); 
            }
          // assign double value to length
            length=myScanner.nextDouble();  
        while (length<0) {
            System.out.print("Please only enter a positive value. Try again: ");
            while(myScanner.hasNextDouble() == false){ // checking if value is an integer or not
                        System.out.print("Error: Please type in an integer.");;
                        System.out.println("");
                        System.out.print("Input your desired length: ");
                        String junk= myScanner.next();
                         }
                 length= myScanner.nextDouble(); 
                 }
        while (length>80) {
            System.out.print("Error. please enter a digit less than 80: ");
            length=myScanner.nextDouble();
        }       
        // width
        System.out.print("Input your desired width: ");
        while (true) {
            if (myScanner.hasNextDouble()) {
                width=myScanner.nextDouble();
                break;
            }
            else {
                System.out.print("  Error: Please type in an integer. ");
                System.out.print("Input your desired width: ");
                myScanner.next();
            }
        }
        while (width>length) {
            System.out.print("   Error: Please input an integer smaller than the length.");
            System.out.println("");
            System.out.print("Input your desired width: ");
            width=myScanner.nextDouble();
        }
// declare char variables for # and /
char first=' ';
char second=' ';
char outchar;
// base of one V is width*2. One base holds two 'X' patterns alternating. The first has '#' going down and the second has '#' going up. 
 
// Create a loop now.
for (line=1; line<width+1;line++) {
  for (column=1; column<length+1;column++) {
    if ((column-1)%(width*2)<width) { // if column lies before the width value column, it is the first pattern. 
        first='#'; // # goes down
        second='/'; // / goes up
    }
    else { // otherwise it is the second pattern
        first='\\'; // / goes down
        second='#';// # goes up
    } 
    if (column%width==line%width) {
        outchar=first;
    }
    else if ((column+line)%width==1) {
        outchar=second;
    }
    else {
        outchar=' ';
    }
    System.out.print(outchar);
  } // end inner loop
   System.out.println(" ");
} // end major loop

  } // end of method
    
} // end of class