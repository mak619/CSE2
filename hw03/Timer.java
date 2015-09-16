//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Maryam Athar Khan
// Homework 3 part 1 
// Due date is September 15,2015
// This program will calculate the amount of time remaining until the user goes out to eat dinner with his friends.
// 
// import scanner class from outside
import java.util.Scanner;

// define a class
public class Timer{
    // main method required for every Java program
    public static void main(String[] args) {
    // declare an instance of the Scanner object
    Scanner myScanner= new Scanner( System.in );
    // Prompt user for the current time
    System.out.print("Enter the current time:");
    // Accept user input
    int currentTime= myScanner.nextInt();
    // Prompt user for the time that they will be eating dinner
    System.out.print("Enter the time that you will be eating dinner:");
    // Accept user input
    int dinnerTime= myScanner.nextInt();
    // Declare a variable which will tell us the amount of time remaining
    int remainingTime;
    // This will calculate how much military time is actually left
    remainingTime= (int)(dinnerTime - currentTime);
    // How many hours is left
    int hoursLeft;
    hoursLeft=remainingTime/100;
    // convert hours to military time
    int minutes=hoursLeft*100;
    // how many minutes are left
    int minutesLeft;
    minutesLeft=remainingTime-minutes;
    // Tell the user how much time is left
    System.out.println("You have "+hoursLeft+" hours and "+minutesLeft+" minutes until dinner.");
    

        } // end of main method

} // end of class
