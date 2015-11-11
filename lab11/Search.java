// Maryam Athar Khan
// Lab 11
// This program is designed to to perform linear and binary searches on large arrays from random numbers

import java.util.Scanner;// import Scanner class from outside

public class Search{ // define the class
    public static void main(String[] args) { // define the main method
        Scanner myScanner=new Scanner(System.in); // declare Scanner variable
        int[] array1=new int[5000]; // create array1 of length 5000
        int[] array2=new int[5000]; // create array2 of length 5000
        for (int i=0;i<array1.length;i++) { // loop runs until array1 is filled
            array1[i]=(int)(Math.random()*100000); // generate and assign a random integer to an index of array1
        } // end of loop
        int max=array1[0]; // assign the zeroth index to max
        int j=0; // declare the control variable j
        for (j=1;j<array1.length;j++) { // linear search loop to check the max value
            if(array1[j]>max) { // if jth index is greater than max
                max=array1[j];// assign the jth index value to max
            } // end of if statement
        } // end of loop
        System.out.println("The maximum of array1 is: "+max);// print out the max value of array1 
        int min=array1[0];// assign the first value of array1 to minimum
        int z=0; // declare the control variable z
        for (z=1;z<array1.length;z++) { // loop to check the minimum value using linear search
             if(array1[z]<min) { // if the array1th index is less than the min 
                 min=array1[z]; // assign the array1th index value to mimimum
            } // end of if statement
        } // end of loop
        System.out.println("The minimum of array1 is: " +min); // print out the minimum value of array 1
        for (int i=0;i<array2.length;i++) { // loop runs to fill array2 in increasing random numbers
                if (i==0) {
                       array2[i]=(int)(Math.random()*100000);
                }
                else {
                    while (true) { // loop always runs 
                   if(array2[i]<array2[i-1]) { // if the index value is less than the value in the previous index
                       array2[i]=(int)(Math.random()*100000); // assign another random number 
                   }
                   else {
                       break;
                   }
                } // end of while loop
          } // end of else loop
        } // end of for loop
        System.out.println("The maximum of array2 is: "+array2[4999]); // print max array2
        System.out.println("The minimum of array2 is: "+array2[0]); // print min array2
        System.out.print("Enter an int: ");
        int input=myScanner.nextInt(); // assign user's input to input
        if (input<0) { // if input is less than 0
            return;
        } // end of if statement
        else { // otherwise
           int low=0;
           int high=array2.length-1;
           boolean found=false;
           while (high>= low) { // loop using binary search
               int mid=(low+high)/2; // calculate the mid-value
               if (input<array2[mid]) { // if input is less than the mid index value
                   high=mid-1;
               } // end of if statement
               else if(input==array2[mid]) {
                   found=true;
               } // end of else if statement
               else { // otherwsie
                   low=mid+1;
               }
           } // end of while loop
           if (found==true) {
               System.out.println(" The number was found in the list");
           } // end of if statement
           else { // if number was not found
               System.out.println(input+" was not found in the list");
               if (low==array2.length) {
                   System.out.println("The number above the key was none");
               }
               else {
                   System.out.println("The number above the key was " +array2[low]);
               }
               if (high==-1) {
                   System.out.println("The number below the key was none");
               }
               else {
                   System.out.println("The number below the key was " +array2[high]);
               }   
           } // end of else statement
        } // end of else statement
    } // end of main method
}// end of class