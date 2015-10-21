// Maryam Athar Khan
// October 16, 2015
// Lab 08
// This program is designed to calculate the mean and median of five numbers

import java.util.Scanner; // import java Scanner class
public class Stats { // define a class
       public static double mean(double first, double second, double third, double fourth, double fifth) { // define Mean method
           double mean=(first+second+third+fourth+fifth)/5; // mean
           return mean;
       } // end of mean method
       public static double median(double first, double second, double third, double fourth, double fifth) { // define median method
           double median=third;
           return third;
       }
       public static void printStuff(double mean, double median) { // define print method 
           System.out.println("The mean for these inputs is: "+mean+" and the median for these inputs is: " +median);//
       }
       public static void main (String[] args) { // define main method
       Scanner myScanner= new Scanner(System.in); // define Scanner class
       System.out.print("Please input five numbers."); // prompt user for first number
       System.out.print("The first input is: ");
       double n1= myScanner.nextDouble();
       System.out.print("The second input is: "); // type in second input
       double n2= myScanner.nextDouble();
       while (n2<n1) {
           System.out.print("Error. You must input a value larger than the previous value: ");
           n2=myScanner.nextDouble();
       } // end of loop
       System.out.print("The third input is: "); // type third input
       double n3=myScanner.nextDouble();
       while (n3<n2) {
               System.out.print("Error. You must input a value larger than the previous value: ");
               n3=myScanner.nextDouble();
       } // end of loop
       System.out.print("The fourth input is: "); // type fourth input
       double n4=myScanner.nextDouble(); 
       while (n4<n3) {
               System.out.print("Error. You must input a value larger than the previous value: ");
               n4=myScanner.nextDouble();
        } // end of loop
       System.out.print("The fifth input is: ");// type fifth input
       double n5=myScanner.nextDouble(); 
       while (n5<n4) {
               System.out.print("Error. You must input a value larger than the previous value: ");
               n5=myScanner.nextDouble();
       }// end of loop
       double avg=mean(n1,n2,n3,n4,n5);  
       double median=median(n1,n2,n3,n4,n5);
       printStuff(avg,median);
       } // end of main method
    
} // end of a class