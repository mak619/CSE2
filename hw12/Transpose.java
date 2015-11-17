// Maryam Athar Khan
// Homework 12
// Due date is November 17,2015
// This program is designed to implement matrix transposition on random matrices

import java.util.Scanner; // import Scanner class from outside

public class Transpose { // define main class
    public static int[][] randomMatrix(int w, int h) { // define randomMatrix method that returns a 2D array
        int[][] x= new int[h][w]; // create a 2D x array whose member arrays represent rows and the elements inside the member arrays include the numbers in the row
        for (int i=0; i<h; i++) { // for loop for the 2D array
            for (int z=0; z<w; z++) { // for loop for individual member arrays
                x[i][z]=(int)((Math.random()*21)-10); // generate random integers between -10 to 10 and assign them to the array
            } // end of inner z for loop
        } // end of outer i for loop
        return x; // return the 2D array
    } // end of randomMatrix method
    public static void printMatrix(int[][] x) { // define printMatrix method that prints out the 2D array
        for (int i=1; i<x.length; i++) { // loop runs to check if all the member arrays are equal in length
            if (x[i].length!=x[i-1].length) { // if two member arrays are not equal
                System.out.println("Warning. This is not a rectangular matrix."); // print warning
                break; // break out of the loop
            } // end of for loop
        } // end of for loop 
        for (int i=0; i<x.length; i++){ // loop runs to print the 2D array
            for (int z=0; z<x[i].length; z++) { // loop runs to print one row
              System.out.print(x[i][z] +" "); // print an element of the row
            } // end of inner for loop
            System.out.println(""); // move to next line to print the next row
        } // end of outer for loop 
    } // end of printMatrix method
    public static int[][] transposeMatrix(int[][] x) { // define transposeMatrix method 
        int newRows=x[0].length; // declare newRows variable
        int newColumns=x.length; // how many columns are there in the transposeMatrix
        int[][] transposed=new int[newRows][newColumns]; // declare and create a transposed array
        for (int i=0; i<newRows; i++) {
            for (int z=0; z<newColumns; z++) {
                transposed[i][z]=x[z][i];
            } // end of inner for loop
        } // end of outer for loop
        return transposed; // return the transposed array
    } // end of transposeMatrix method
    public static void main(String[] args) { // define main method
        int width=-1; // declare width variable
        int height=-1; // declare height variable 
        Scanner myScanner= new Scanner(System.in); // declare Scanner variable
        System.out.print("Enter the width of the matrix: "); // prompt user to enter input
        while(myScanner.hasNextInt()==false){ // checking if value is an integer or not
                     System.out.print("Sorry, you did not enter an integer. Try again: "); // try again
                     String junk = myScanner.next();
        }
        width=myScanner.nextInt(); // assign user's input to width
        while (width<=0) { // if mon is a negative number 
            System.out.print("Please only enter positive numbers. Try again: ");
            while(myScanner.hasNextInt()==false){ // checking if value is an integer or not
                    System.out.print("Sorry, you did not enter an integer. Try again: "); 
                    String junk = myScanner.next();
            }
           width=myScanner.nextInt(); // final width value
        }
        System.out.print("Enter the height of the matrix: "); // prompt use to enter input 
        while(myScanner.hasNextInt()==false){ // checking if value is an integer or not
                     System.out.print("Sorry, you did not enter an integer. Try again: "); // try again
                     String junk = myScanner.next();
        }
        height=myScanner.nextInt(); // assign user's input to width
        while (height<=0) { // if mon is a negative number 
            System.out.print("Please only enter positive numbers. Try again: ");
            while(myScanner.hasNextInt()==false){ // checking if value is an integer or not
                    System.out.print("Sorry, you did not enter an integer. Try again: "); 
                    String junk = myScanner.next();
            }
           height=myScanner.nextInt(); // final width value
        }
        System.out.println("Matrix:");
        int[][] matrix=randomMatrix(width, height); // call randomMatrix and run it with width and height
        printMatrix(matrix); // call printMatrix and print the matrix
        int[][] transposedMatrix=transposeMatrix(matrix); // call transponseMatrix and run it
        System.out.println("Transposed matrix: ");
        printMatrix(transposedMatrix); // call printMatrix and print the transposed matrix 
    }// end of main method
} // end of class