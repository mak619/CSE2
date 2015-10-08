/////////////////////////////////////////////////////////
/* Maryam Athar Khan
Homework 06 program 2
Due date is October 6th,2015
This program is designed to develop an ISBN Validator */ 
import java.util.Scanner; // import Scanner class

public class CheckDigit { // define a class
    public static void main(String[] args) { // define a method
    Scanner myScanner= new Scanner( System.in ); // input
    int i=0;// i will be a certain character digit
    int j=0;// j is the number you have to multiply it with as it proceeds
    int sum=0;// keep account of all sums
    double checkSum=0; // what the last value should be
    int last=0;// value of last number given in the input 
    System.out.print("Please enter a 10 digit barcode: "); // prompt user input
    String barCode=myScanner.next(); // user input strings
    while (barCode.length()!=10) { // loop runs if the string length is not 10 units
    System.out.print("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
    barCode=myScanner.next();
    }
    if (barCode.charAt(9)=='X') {// checking to see if the last character is X. 
     last=10;// last digit is 10
    }
    else { // if last digit is not X
        last=(int)(barCode.charAt(9))-48; // convert char to int. We have to subtract 48 as a result of the unicode
    }
    j=2;
    for (i=8;i>-1;i--) { // start backwards from the 8th char
         sum+=((int)(barCode.charAt(i))-48)*j;
         j++; // add one to j because multipication increases as you move right to left through the ISBN
    }// loop
    checkSum=sum%11;//remainder to find the last digit
    if (checkSum==last) {
        System.out.println("This is a valid ISBN."); // if calculated value is equal to the last char inputed
    }
    else {
        if (checkSum==10) { // last digit should be a value of 10, then X should be printed. 
            System.out.println("This is not a valid ISBN. Check digit should be: X");
        }
        else {
            System.out.println("This is not a valid ISBN. Check digit should be: " +checkSum); // if not equal
            }
        } 
    
    
    } // end of method 

} // end of class