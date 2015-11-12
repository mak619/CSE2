// Maryam Athar Khan
// Homework 11
// Due date is November 12, 2015
// This program is designed to give us practice in searching single dimensional arrays

import java.util.Scanner; // import Scanner class
import java.util.Random; // import Random class

public class CSE2Linear { // define the class
    public static void binarySearch(int[] array, int input) { // define the binarySearch method
        int low=0; // assign low to be index 0
        int high=array.length-1; // assign high to be the last index
        boolean found=false; // declare found and assign false to it 
        int i=0; // i stands for the number of comparisons 
        while (high>=low) { // loop runs whilst high is greater than or equal to low
            i++; // increase i by 1
            int mid=(low+high)/2; // declare and find the mid index
            if (input<array[mid]) { // if input is less than the value at the mid index
                high=mid-1; // index at high will be one less than the mid index
            } // end of if statement
            else if (input==array[mid]) { // else if input is equal to the value at mid index
                found=true; // assign true to found
                System.out.println(input +" was found in the list with " +i+" comparisons"); // print out statement
                break; // break out of the loop
            } // end of else if statement
            else { // otherwise if input is greater than the value at mid index
                low=mid+1; // low becomes 1 + mid index 
            } // end of else statement
        } // end of while loop 
        if (found==false) { // if input was not found
            System.out.println(input +" was not found in the list with "+i+" comparisons"); // print statement
        } // end of if statement
    } // end of binarySearch method
    public static int[] scramble(int[] array) { // define the scramble method
        System.out.println("Scrambled: "); // print out statement
        int[] scrambled=new int[array.length]; // declare a new scrambled array and assign it the length of the "array"
        int[] ck={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1}; // declare an int array that will serve as a control to ensure the same item is not picked twice 
        Random random=new Random();  // declare Random variable
        for (int i=0; i<array.length;i++) { // loop runs until the length of the array ends
            int x=random.nextInt(array.length); // declare x and assign it a int random value
            while (true) { // loop always runs
                if (ck[0]==x || ck[1]==x || ck[2]==x || ck[3]==x || ck[4]==x || ck[5]==x || ck[6]==x || ck[7]==x || ck[8]==x || ck[9]==x || ck[10]==x || ck[11]==x || ck[12]==x || ck[13]==x || ck[14]==x){ // if x is equal to any of the ck indexes 
                    x=random.nextInt(array.length); // generate a new random x
                    continue; // continue with the loop
                }// end of if statement 
                else { // otherwise
                    break; // exit the loop
                } // end of else statement 
            } // end of while loop
            ck[i]=x; // assign x to ck at index i
            scrambled[i]=array[x]; // assign the value at x to the i index of the scrambled array
            System.out.print(scrambled[i] + " "); // print out the scrambled array
        } // end of for loop 
        System.out.println(""); // move onto the next line
        return scrambled; // return scrambled array
    } // end of scramble method
    public static void linearSearch(int[] array, int input) { // define linearSearch method
        int z=0; // z represents the number of comparisons
        boolean found=false; // declare found and assign false to it
        for (int i=0; i<array.length;i++) { // loop runs the length of the array
            z++; // increase z by 1 
            if (input==array[i]) { // if input is equal to the value at i
                found=true; // assign true to found
                System.out.println(input+ " was found in the list with "+z+" comparisons"); // print out statement
                break; // break and exit the loop
            } // end of if statement
        } // end of for loop
        if (found==false) { // if not found
            System.out.println(input + " was not found in the list with "+z+" comparisons"); // print out statement
        } // end of if statement
    } // end of linearSearch method
    public static void main(String[] args) { // define the main method 
        Scanner myScanner= new Scanner(System.in); // declare the Scanner variable
        int[] finalGrades= new int[15]; // declare and create finalGrades array with length 15
        System.out.print("Enter 15 ints for final grades in CSE2: "); // prompt user to enter input
        while (true) { // loop always runs 
            boolean noErrors=true; // declare noErrors and assign true to it 
            for (int i=0; i<finalGrades.length; i++) { // 
                while (myScanner.hasNextInt()==false) { // if input is not an integer
                    noErrors=false; // assign false to noErrors
                    System.out.print("Error. Please only enter an integer: "); // display error message
                    String junk=myScanner.next(); // collect junk that user inputs that is not an integer
                } // end of while loop
                noErrors=true; // assign true to noErrors
                int x=myScanner.nextInt(); // declare x and assign the user's input to it 
                while(x<0 || x>100) { // loop runs if x is less than 0 or greater than 100
                    noErrors=false; // assign false to noErrors
                    System.out.print("Error. Please enter an integer between 0-100: "); // display error message
                    while (myScanner.hasNextInt()==false) { // if input is not an integer
                        noErrors=false; // assign false to noErrors
                        System.out.print("Error. Please only enter an integer: "); // display error message
                        String junk=myScanner.next(); // collect junk that user inputs that is not an integer
                    } // end of loop to check if it is an integer
                    x=myScanner.nextInt(); // x is user's correct input
                } // end of while loop to check if it is within range or not 
                noErrors=true; // assign true to noErrors
                finalGrades[i]=x; // assign x to the i index of finalGrades
                while (i>0) { // when index is greater than 0
                  if (finalGrades[i]>=finalGrades[i-1]) { // if the value at the i index is greater than the value at the index before it 
                      noErrors=true; // assign true to noErrors
                      break; // break out of the loop
                  } // end of if statement
                  else { // otherwise
                      noErrors=false; // assign false to noErrors
                     System.out.print("Error. Please enter an integer that is greater than or equal to the last int: "); // display error message
                     while (myScanner.hasNextInt()==false) { // loop runs if input is not an integer
                        System.out.print("Error. Please only enter an integer: "); // display error message
                         String junk=myScanner.next(); // collect input that is not an integer
                    } // end of while loop
                    x=myScanner.nextInt(); // assign user's input to x 
                    while(x<0 || x>100) { // loop runs if x is out of the range
                    System.out.print("Error. Please enter an integer between 0-100: "); // display error message
                    while (myScanner.hasNextInt()==false) { // loop runs if input is not an integer
                        System.out.print("Error. Please only enter an integer: "); // display error message
                        String junk=myScanner.next(); // collect user's junk
                    } // end of while loop that checks for integer  
                    x=myScanner.nextInt(); // assign user's input to x
                    } // end of while loop that checks for range
                     finalGrades[i]=x; // assign input to the i index of the finalGrades array
                  } // end of else statement
               } // end of while (i>0) loop 
            } // end of for loop
            if (noErrors==true) { // if no errors
                break; // break and exit the loop
            } // end of if statement
        } // end of if statement
        System.out.println("Final Grades: "); // print the final input array
        for (int i=0; i<finalGrades.length; i++) { // loop run the length of the array
            System.out.print(finalGrades[i] + " "); // print out the array
        } // end of for loop
        System.out.println(); // move to next line 
        System.out.print("Enter a grade to search for: "); // prompt user to input
        while (myScanner.hasNextInt()==false) { // loop runs to check if input is an integer
                    System.out.print("Error. Please only enter an integer: "); // display an error message
                    String junk=myScanner.next(); // collect user's input that is not an integer
        } // end of loop
        int grade=myScanner.nextInt(); // assign user's value to grade
        binarySearch(finalGrades, grade); // call binarySearch method and run it 
        finalGrades=scramble(finalGrades); // call scramble method and run it 
        System.out.print("Enter a grade to search for: "); // prompt user to input
        while (myScanner.hasNextInt()==false) { // loop runs to check if input is an integer
                    System.out.print("Error. Please only enter an integer: "); // display error message
                    String junk=myScanner.next(); // collect's users input that is not an integer
        } // end of loop
        grade=myScanner.nextInt(); // assign user's value to grade
        linearSearch(finalGrades, grade); // call linearSearch method and run it 

    } // end of main method
} // end of class