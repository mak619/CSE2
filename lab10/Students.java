// Maryam Athar Khan
// Lab 09
// October 30, 2015
// This program assigns students their midterm grades using arrays

import java.util.Scanner; // import Scanner class
public class Students { // define a class
    public static void main(String[] args) { // define the main method
        Scanner myScanner=new Scanner(System.in);// declare scanner variable
        int x=(int)(Math.random()*6)+5; // random integer between 5-10
        String[] students= new String[x]; // declare an array, and create an array
        System.out.println("Enter " +x+ " student names:"); // ask the user to input x amount of names
        for (int i=0; i<x; i++) { // loop created to run until all the arrays are filed
            students[i]=myScanner.next(); // user's input assigned inside the array
        } // end of for loop
        int[] midterms= new int[x]; // declare the midterms array, create it, and assign it the same size as the student's arrays
        for (int i=0; i<x; i++) { /// loop runs and fills all the midterm arrays
            midterms[i]=(int)(Math.random()*101);// assigns random integers to midterm arrays
        } // end of loop
        for (int i=0; i<x;i++) {
            System.out.println(students[i]+": "+midterms[i]);
        }
    } // end of main method
} // end of class