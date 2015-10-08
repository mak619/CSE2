/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Maryam Athar Khan
// Homework 06 part 1
// Due date is October 6, 2015
// This program is deigned to give a visual expression of the amount of money spent per day
import java.util.Scanner;
public class BarGraph { // define a class
      public static void main(String[] args) { // define a method
            Scanner myScanner= new Scanner(System.in);
            int day=1; // there are seven day of the weeks. Day 1 is Monday.
            // declare all the variables for the money spent on each day
            double mon=0; 
            double tue=0;
            double wed=0;
            double thur=0;
            double fri=0;
            double sat=0;
            double sun=0;
            while (day<8) {
                switch (day) {
                 case 1: System.out.print("Expenses for Monday: $"); // prompt user to input Monday's expenses
                 
                 while(myScanner.hasNextDouble() == false){ // checking if value is an integer or not
                     System.out.print("Sorry, you did not enter an integer. Try again: $"); // try again
                     String junk = myScanner.next();
                 }
                 mon= myScanner.nextDouble(); // assign this expense a double value and assign in to Monday
                 while (mon<0) { // if mon is a negative number 
                     System.out.print("Please only enter positive numbers. Try again: $");
                     while(myScanner.hasNextDouble() == false){ // checking if value is an integer or not
                        System.out.print("Sorry, you did not enter an integer. Try again: $"); 
                        String junk = myScanner.next();
                         }
                 mon= myScanner.nextDouble(); // final mon value
                 }
                 day++; // indrease day by 1. It is now 2 so it is tuesday. 
                 break;
                 case 2: System.out.print("Expenses for Tuesday: $");// prompt user for Today's expenses
                  while(myScanner.hasNextDouble() == false) { // checking if value is an integer or not
                      System.out.print("Sorry, you did not enter an integer. Try again: $"); // try again
                      String junk= myScanner.next();
                      } 
                      tue=myScanner.nextDouble(); // assign value to tue
                  while (tue<0) { // if tue is negative
                      System.out.print("Please only enter positive numbers. Try again: $");
                      while (myScanner.hasNextDouble()==false) { // checking if value is integer or not
                          System.out.print("Sorry, you did not enter an integer. Try again: $");
                          String junk=myScanner.next();
                         }
                      tue=myScanner.nextDouble(); // final tue value 
                  }
                day++;// now wednesday
                      break;
                  case 3: System.out.print("Expenses for Wednesday: $"); // prompt user for Wednesday's input
                  while (myScanner.hasNextDouble()==false) { // if not an integer
                      System.out.print("Sorry, you did not enter an integer. Try again: $"); // try again
                      String junk=myScanner.next();
                  }
                  wed=myScanner.nextDouble(); // assign value to wed
                  while (wed<0) { // if wed is negative
                      System.out.print("Please only enter positive numbers. Try again: $");
                      while (myScanner.hasNextDouble()==false) { // check to see if integer or not
                          System.out.print("Sorry, you did not enter an integer. Try again: $");
                          String junk=myScanner.next();
                      }
                    wed=myScanner.nextDouble(); // final wed value
                      
                  }
                  day++;// thursday now
                  break;
                  case 4: System.out.print("Expenses for Thursday: $"); 
                  while (myScanner.hasNextDouble()==false) { // if value inputted is not an integer
                      System.out.print("Sorry you did not enter an integer. Try again: $"); // try again
                      String junk=myScanner.next();
                  }
                  thur=myScanner.nextDouble();// assign value to thurs
                  while (thur<0) { // if thurs is less than 0 
                    System.out.print("Please only enter positive numbers. Try again: $");
                      while (myScanner.hasNextDouble()==false) { // check to see if integer
                          System.out.print("Sorry, you did not enter an integer. Try again: $");
                          String junk=myScanner.next();
                          }
                    thur=myScanner.nextDouble(); // final thur value 
                  }
                  day++; // friday 
                  break;
                  case 5: System.out.print("Expenses for Friday: $"); 
                  while (myScanner.hasNextDouble()==false) { // if not an integer
                      System.out.print("Sorry, you did not enter an integer. Try again: $");
                      String junk=myScanner.next();
                  }
                  fri=myScanner.nextDouble();// assign value to fri
                  while (fri<0) {// if fri is less than 0
                      System.out.print("Please only enter positive numbers. Try again: $");
                      while (myScanner.hasNextDouble()==false) { // check to see if new inputted value is an integer
                          System.out.print("Sorry, you did not enter an integer. Try again: $");
                          String junk=myScanner.next();
                      }
                      fri=myScanner.nextDouble(); // final fri value
                  }
                  day++; // now saturday
                  break;
                  case 6: System.out.print("Expenses for Saturday: $");
                 while (myScanner.hasNextDouble()==false) { // check to see if integer or not
                      System.out.print("Sorry, you did not enter an integer. Try again: $");
                      String junk=myScanner.next();
                  }
                  sat=myScanner.nextDouble();// assign value to sat
                  while (sat<0) { // if sat is less than 0
                      System.out.print("Please only enter positive numbers. Try again: $");
                      while (myScanner.hasNextDouble()==false) { // check to see if integer
                          System.out.print("Sorry, you did not enter an integer. Try again: $");
                          String junk=myScanner.next();
                      }
                      sat=myScanner.nextDouble(); // final sat value
                  } 
                  day++; // now sunday
                  break;
                  case 7: System.out.print("Expenses for Sunday: $");
                  while (myScanner.hasNextDouble()==false) { // check to see if integer or not
                      System.out.print("Sorry, you did not enter an integer. Try again: $");
                      String junk=myScanner.next();
                  }
                  sun=myScanner.nextDouble(); // assign integer value to sun
                  while (sun<0) { // if sun less than 0
                      System.out.print("Please only enter positive numbers. Try again: $");
                      while (myScanner.hasNextDouble()==false) { // check to see if integer or not
                          System.out.print("Sorry, you did not enter an integer. Try again: $");
                          String junk=myScanner.next();
                      }
                      sun=myScanner.nextDouble(); // final sun value
                  }
                 day ++;// now day is 8. so loop will stop running. 
                 break; 
                  
                }// end of switch 
                } // end of loop
                
    // make visual bar graph
    // declare variables for the number of stars printed
    double starMon=0;
    double starTue=0;
    double starWed=0;
    double starThur=0;
    double starFri=0;
    double starSat=0;
    double starSun=0;
    // Loop for monday
    System.out.print("Mon: ");
      if (mon-((int)(mon)+0.5)>=0) { // rounding. so if value is for eg 17.95, it will be 17.95-17.50=0.25. 
            starMon=(int)(mon)+1; // it will round up then to 18
        }    
        else {
        starMon=(int)(mon); // round down to 17
            
        }
        for (int a=1; a<starMon+1; a++) {
      System.out.print("*");
    } // end of for loop monday
    // Loop for tuesday
    System.out.println("");
    System.out.print("Tue: ");
     if (tue-((int)(tue)+0.5)>=0) {
            starTue=(int)(tue)+1; // round up
        }    
        else {
        starTue=(int)(tue); // round down
            
        }
    for (int b=1; b<starTue+1;b++) {
        System.out.print("*");
    }// end of for loop tuesday
    // Loop for Wednesday
    System.out.println("");
    System.out.print("Wed: ");
     if (wed-((int)(wed)+0.5)>=0) {
            starWed=(int)(wed)+1; // round up
        }    
        else {
        starWed=(int)(wed); // round down
        }
    for (int c=1;c<starWed+1;c++){
        System.out.print("*");
    }//end of for loop wed
    // Loop for Thursday
    System.out.println("");
    System.out.print("Thu: ");
     if (thur-((int)(thur)+0.5)>=0) {
            starThur=(int)(thur)+1; // round up
        }    
        else {
        starThur=(int)(thur); // round down
            
        }
    for (int d=1;d<starThur+1;d++) {
        System.out.print("*");
    }//end of for loop thursday
    // Loop for friday
    System.out.println("");
    System.out.print("Fri: ");
     if (fri-((int)(fri)+0.5)>=0) {
            starFri=(int)(fri)+1; // round up
        }    
        else {
        starFri=(int)(fri); // round down
            
        }
    for (int e=1;e<starFri+1;e++) {
        System.out.print("*");
    }// end of loop for friday
    // Loop for saturday
    System.out.println("");
    System.out.print("Sat: ");
     if (sat-((int)(sat)+0.5)>=0) {
            starSat=(int)(sat)+1; // round up
        }    
        else {
        starSat=(int)(sat); // round down
            
        }
    for (int f=1;f<starSat+1;f++) {
        System.out.print("*");
    }// end of loop for sat
    // Loop for sunday
    System.out.println("");
    System.out.print("Sun: ");
     if (sun-((int)(sun)+0.5)>=0) {
            starSun=(int)(sun)+1; // round up
        }    
        else {
        starSun=(int)(sun); // round down
        }
    for (int g=1;g<starSun+1;g++) {
        System.out.print("*");
        }// end of loop for sun
        System.out.println("");
/// Part 2
// Average expenses
double average=(mon+tue+wed+thur+fri+sat+sun)/7;
double avFinal=Math.round(average*100.0)/100.0; // round to two decimal places
System.out.println("Your average weekly expenses are: " + avFinal);
double ranPer=0;
double expend=0;
double fourYear=0;
double m=0;
double z=0;
for (int i=1;i<209;i++) { // i is the number of weeks. So while i is less than 209(add one to 52*4), this loop will run. Increment i to keep on adding one week to the current value
  ranPer=(int)(Math.random()*20+1);
  z=(int)(Math.random()*1);
  if (z==0) {
      fourYear+=(1+ranPer/100)*(average); // increase in %
  }
  else {
      fourYear+=(1-ranPer/100)*(average);// decrease in %
  }
}
double fourYearFinal=Math.round(fourYear*100.0)/100.0; // round to two decimal places
    System.out.println("Estimated expenditure for four years: " + fourYearFinal);
          
      }// end of method
    
} // end of class

