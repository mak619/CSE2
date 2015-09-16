/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Maryam Athar Khan
// Homework 3 part 2
// Due date is September 15,2015
// This program will calculate the volume of the block and the surface area
//
// import scanner from outside
import java.util.Scanner;
// define a class
public class Block{
    public static void main(String[] args){
    // declare an instance of the scanner object
    Scanner myScanner= new Scanner( System.in );
    // prompt the user for the length of the block
    System.out.print("Enter the length of the block:");
    // Accept the input
    double length= myScanner.nextDouble();
    // prompt the user for the width of the block
    System.out.print("Enter the width of the block:");
    // Accept the input
    double width= myScanner.nextDouble();
    // prompt the user for the height of the block
    System.out.print("Enter the heigh of the block:");
    // Accept the input
    double height= myScanner.nextDouble();
    // declare the variable volume
    double volume;
    // Calculate the volume
    volume=length*width*height;
    // declare the variable surface area
    double sArea;
    // Calculate surface area using formulas that Surface Area=2(lw+wh+lh)
    double lW, wH, lH;
    lW=length*width;
    wH=width*height;
    lH=length*height;
    sArea=2*(lW+wH+lH);
    // Give the user the output of the volume and the surface area
    System.out.println("The volume of the block of the dimensions "+length+" x "+width+" x "+height+" is "+volume+". The surface area of the block is "+sArea+".");
    
    
        
    } // end of main method
} // end of class 