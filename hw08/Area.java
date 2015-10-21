// Maryam Athar Khan
// Homework 08 Part 1
// Due date is October 20,2015
// This program is designed to calcuate the Area of a shape that the user inputs, using methods.

import java.util.Scanner; // import Scanner class

public class Area { // define a class
   public static double input() {// define input method with output of type double
       Scanner myScanner= new Scanner(System.in); // declare scanner variable
       while (true) { // loop always runs
           if (myScanner.hasNextDouble()) { // if Scanner is double
               double input=myScanner.nextDouble(); // store value into input
               return input; // ask to return input
           } // end of if statement
           else { // otherwise
               System.out.print("Sorry, you did not enter a double value. Try again: ");// error message and prompt user again
               myScanner.nextLine();// whatever user inputs
           } // end of else statement
       } // end of while loop
   } // end of input method
   public static double rectArea(double width, double height) {// define the rectangle area method
       double rectArea=width*height;// rectArea formula
       return rectArea;//return value
   } // end of rectArea method
   public static double triArea(double base, double height) {// define the triangle area method
       double triArea=0.5*base*height;// formula for the area of a triangle
       return triArea; // return value
   }// end of triArea method
   public static double cirArea(double radius) {// define the circle area method
      final double PI=3.14159; // declare the constant PI 
      double cirArea=PI*radius*radius; // formula for the area of a circle
      return cirArea; // return value
    } // end of cirArea method
   public static void main(String[] args) { // define the main method
      Scanner myScanner= new Scanner(System.in); // declare Scanner variable
      System.out.print("Please input what shape's area you would like to calculate: "); // ask user to input shape
      String a="rectangle"; // declare string a and assign rectangle to it
      String b="triangle"; // declare string b and assign triangle to it
      String c="circle"; // declare string c and assign circle to it
      double rWidth=0; // declare rectangle width
      double rHeight=0; // declare rectangle height
      double tBase=0; // declare triangle base
      double tHeight=0; // declare triangle height
      double radius=0; // delcare radius
      String shape=myScanner.next(); // declare shape and assign whatever the user inputs to it
      while (true) { // loop always runs
          if (shape.equals(a) || shape.equals(b) || shape.equals(c) ) { // if shape is equal to rectangle, triangle, or circle
              break; // break and exit
          } // end of if statement
          else { // otherwise
              System.out.println("This is not an acceptable shape. The acceptable shapes are: rectangle, triangle, or a circle."); // error message and tell them what acceptable shapes are
              System.out.print("Please input what shape's area you would like to calculate: "); // ask again
              shape=myScanner.next(); // assign what they input to shape
          } // end of else statement 
      } // end of while loop
      if (shape.equals(a)) {// if shape is a rectangle
          System.out.print("Please input the width of the rectangle: "); // ask width
          rWidth=input();// run input method with width value
          System.out.print("Please input the height of the rectangle: "); // ask height
          rHeight=input(); // run input method with heigh value
          double rectArea=rectArea(rWidth,rHeight); // calculate the area of the rectangle and run rectArea method
          System.out.println("The area of the rectangle is: " +rectArea);// print out output
      } // end of if rectangle statement
    else if (shape.equals(b)) { // if shape is a triangle  
          System.out.print("Please input the base length of the triangle: "); // ask base length
          tBase=input(); // run input method with triangle base value
          System.out.print("Please input the height of the triangle: "); // ask height
          tHeight=input(); // run input method with triangle height value
          double triArea=triArea(tBase,tHeight);// calculate triangle area by running triArea method
          System.out.println("The area of the triangle is: " +triArea); // print out output
        } // end of if triangle statement
    else if (shape.equals(c)) { // if shape is a circle
        System.out.print("Please input the radius of the circle: "); // ask the radius
        radius=input(); // run input method with radius
        double cirArea=cirArea(radius); // calculate area of a circle by running cirArea method
        System.out.println("The area of the circle is: " +cirArea); // print out output
    } // end of if circle statement
   } // end of main method
} // end of class