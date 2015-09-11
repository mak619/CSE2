//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Maryam Athar Khan
// Lab 03
// September 11, 2015
// This program will determine how much each person in a group has to spend in order to pay the check after a restaurant meal
//
// import Scanner Class from outside
import java.util.Scanner;

// define a class
public class Check{
    // main method required for every Java program
    public static void main(String[] args) { 
    // declare an instance of the Scanner object
    Scanner myScanner= new Scanner( System.in );
    // Prompt user for the original cost of the chek
    System.out.print(" Enter the original cost of the check in the form xx.xx: ");
    // Accept user input
    double checkCost= myScanner.nextDouble();
    //  Accept the input from the user that is the tip percentage they wish to pay
    System.out.print(" Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
    // Accept user unput
    double tipPercent= myScanner.nextDouble();
    // We want to convert the percentage to into a decimal value
    tipPercent/= 100;
    // Prompt the user for how many people went to dinner
    System.out.print(" Enter the number of people who went out to dinner: ");
    // Accept the input
    int numPeople= myScanner.nextInt();
    // declare variables
    double totalCost;
    double costPerPerson;
    int dollars, pennies, dimes ; // whole dollar amount of cost dimes, pennies;
    // for storing digits to the right of the decimal point for the cost$
    totalCost=checkCost*(1+tipPercent);
    // What is the cost per person
    costPerPerson=totalCost/numPeople;
    // get the whole amount, dropping decimal fraction 
    dollars=(int)costPerPerson;
    // get dimes amount e.g. 
    // (int)(6.73*10) % 10 -> 67 % 10 -> 7
    // where the % (mod) operator returns the remainder 
    // after the division: 583%100 -> 83, 27%5 -> 2 
    dimes=(int)(costPerPerson*10) % 10;
    pennies=(int)(costPerPerson*100) % 10;
    System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
    
    
    } // end of main method
        
} // end of class
