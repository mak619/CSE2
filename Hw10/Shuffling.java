// Maryam Athar Khan
// Homework 10
// Due date is November 3, 2015
// This program is designed to shuffle cards randomly and present a randomized hand

import java.util.Scanner; // import java class
public class Shuffling{ // define the main class
  public static void printArray(String[] x) { // declare printArray method
  for (int i=0; i<x.length; i++ ) { // loop runs the length of the array
      System.out.print(x[i]+" "); // print out an array index with spaces
  } // end of for loop
  System.out.println(""); // shift to the next line 
  } // end of printArray method
  public static String[] shuffle(String[] x) { // declare shuffle method
      int swap=52; // amount of times you want it to shuffle
      String m="kl"; // temporary m variable created to store the String located at x[0]
      for (int j=0; j<swap; j++) { // loop runs till j is less than the number of swaps
          int i=(int)(Math.random()*x.length); // randomize an index number of the list
          m=x[0]; // store the String at x[0] into m
          x[0]=x[i]; // swaps element at index i with the first element
          x[i]=m; // places first element at index i
      } // end of for loop
      System.out.println("Shuffled"); // print shuffled
      return x; // return the array 
  } // end of shuffle method
  public static String[] randomizeHand(String[] x) { // declare randomizeHand method
     String[] m=new String[5]; // declare and create a new String array with size 5
     int[] loc={-1,-1,-1,-1,-1}; // declare an int array that will serve as a control to ensure the same item is not picked twice 
     for (int j=0; j<5; j++) { // loop runs five times to pick five cards
          int i=(int)(Math.random()*52); // pick a random card with index i 
          while (true){ // loop always runs
            if(loc[0]==i || loc[1]==i || loc[2]==i || loc[3]==i || loc[4]==i) { // if i is equal to any of the loc indexes
                i=(int)(Math.random()*52); // generate a new random i
                continue; // go back to the beginning of the loop
            } // end of if statement
            else { // otherwise
                break; // exit the loop
            } // end of else statement
          } // end of while loop
          loc[j]=i; // assign i to loc at j index
          m[j]=x[i]; // assign random card at index i to the first five indexes of m array 
    } // end of for loop
    System.out.println("Randomized Hand!"); // print randomized hand
    return m; // return the array
  } // end of randomizeHand method
  public static void main(String[] args) { // define the main method
     Scanner scan = new Scanner(System.in); // declare Scanner variable
    //suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};  // declare the suitNames array and assign strings to it 
     String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"}; // declare the rankNames array and assign the strings to it
     String[] cards = new String[52]; // assign the length of cards array
     String[] hand = new String[5]; // assign the length of hand array
    for (int i=0; i<52; i++){ // loop runs until the end of the deck
       cards[i]=rankNames[i%13]+suitNames[i/13]; // assigns cards to card
       System.out.print(cards[i]+" "); // print out the cards in order
    } // end of for loop
    System.out.println(""); // shift to the next line
    cards=shuffle(cards); // run shuffle and assign it to cards
    printArray(cards); // run printArray to print the shuffled cards
    hand = randomizeHand(cards); // run randomizeHand and assign it to hand
    printArray(hand); // run printArray to print the randomized hand
  } // end of main method
} // end of class