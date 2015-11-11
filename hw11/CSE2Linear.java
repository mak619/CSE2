// Maryam Athar Khan
// Homework 11
// Due date is November 10, 2015
// This program is designed to give us practice in searching single dimensional arrays

import java.util.Scanner; // import Scanner class
import java.util.Random; // import Random class

public class CSE2Linear { // define the class
    public static void sorted(int[] array) { // define the sorted method
        for (int i=0; i<array.length-1;i++) { // loop runs (length of the array -1) times
            int currentMin=array[i]; // allocate value at i to minimum
            int minIndex=i; // index at which minimum value is i 
            for (int j=i+1;j<array.length;j++) { // loop runs to check if it is in increasing order
                if (currentMin>array[j]) { // if your min is grater than the value at j or the next value
                    currentMin=array[j]; // assign the value at j to min
                    minIndex=j; // assign the minimum index to be j
                } // end of if statement
            } // end of j for loop
            if (minIndex!=i) { // thus if you min index is not equal to i, meaning it has changed
                array[minIndex]=array[i]; // assign the previous min value to value at j
                array[i]=currentMin; // and assign new min value to index i 
            } // end of if statement
        } // end of for loop
        System.out.println("Sorted:"); // print statement
        for (int z=0; z<array.length; z++) { // loop runs to print out the sorted array
            System.out.print(array[z] + " "); // print out the array
        } // end of loop
        System.out.println(""); // move to next line
    } // end of sorted method
    public static void binarySearch(int[] array, int input) { // define the binarySearch method
        int low=0; // assign low to be index 0
        int high=array.length-1; // assign high to be the last index
        boolean found=false; // declare found and assign false to it 
        int i=0; // i stands for the number of iterations 
        while (high>=low) { // loop runs whilst high is greater than or equal to low
            i++; // increase i by 1
            int mid=(low+high)/2; // declare and find the mid index
            if (input<array[mid]) { // if input is less than the value at the mid index
                high=mid-1; // index at high will be one less than the mid index
            } // end of if statement
            else if (input==array[mid]) { // else if input is equal to the value at mid index
                found=true; // assign true to found
                System.out.println(input +" was found in the list with " +i+" iterations"); // print out statement
                break; // break out of the loop
            } // end of else if statement
            else { // otherwise if input is greater than the value at mid index
                low=mid+1; // low becomes 1 + mid index 
            } // end of else statement
        } // end of while loop 
        if (found==false) { // if input was not found
            System.out.println(input +" was not found in the list with "+i+" iterations"); // print statement
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
        int z=0; // z represents the number of iterations
        boolean found=false; // declare found and assign false to it
        for (int i=0; i<array.length;i++) { // loop runs the length of the array
            z++; // increase z by 1 
            if (input==array[i]) { // if input is equal to the value at i
                found=true; // assign true to found
                System.out.println(input+ " was found in the list with "+z+" iterations"); // print out statement
                break; // break and exit the loop
            } // end of if statement
        } // end of for loop
        if (found==false) { // if not found
            System.out.println(input + " was not found in the list with "+z+" iterations"); // print out statement
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
            } // end of for loop
            if (noErrors==true) { // if no errors
                break; // break and exit the loop
            } // end of if statement
        } // end of if statement
        /* This whole part has been commented out because the third error and the sorting method contradict each other. 
        I was told to ignore the third error and only work with the sorting method. However, if we were to use the third
        error, it would be like this. 
        for (int i=0; i<finalGrades.length; i++) {
            while (myScanner.hasNextInt()==false) {
                System.out.print("Error. Please only enter an integer: ");
                String junk=myScanner.next();
            }
            int x=myScanner.nextInt();
            while(x<0 || x>100) {
                System.out.print("Error. Please enter an integer between 0-100: ");
                while (myScanner.hasNextInt()==false) {
                    System.out.print("Error. Please only enter an integer: ");
                    String junk=myScanner.next();
                }
                x=myScanner.nextInt();
            }
            finalGrades[i]=x;
              while (i>0) {
                  if (finalGrades[i]>=finalGrades[i-1]) {
                    break;
                  }
                  else {
                     System.out.println("Error. Please enter an integer that is greater than or equal to the last int: ");
                     while (myScanner.hasNextInt()==false) {
                        System.out.print("Error. Please only enter an integer: ");
                         String junk=myScanner.next();
                    }
                    x=myScanner.nextInt();
                    while(x<0 || x>100) {
                    System.out.print("Error. Please enter an integer between 0-100: ");
                    while (myScanner.hasNextInt()==false) {
                        System.out.print("Error. Please only enter an integer: ");
                        String junk=myScanner.next();
                    }   
                    x=myScanner.nextInt();
                    }
                     finalGrades[i]=x;
                  }
               }
               }*/ 
               // end of comment
        sorted(finalGrades); // call sorted method and run in with finalGrades
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