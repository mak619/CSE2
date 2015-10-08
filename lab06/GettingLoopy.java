/* Maryam Athar Khan
October 2nd, 2015
Lab 06
This program is designed to get us comfortable with loops */

public class GettingLoopy {
    // define method
    public static void main(String[] args) {
        // Step 1
        System.out.println("Step 1: ");
        int num=1; // declare the variable number
        while (num<8) {
            System.out.print(num);
            num++; // add one to the previous number
            
        } // end of while
        --num; // to get 7, so 8-1=7
       // Create loop to print multiple 7s
       int i=1; // create a variable to set a limit to print 7 6 times
       while (i<7) {
           System.out.print(num);
           i++; // add 1 to i until i reaches 7
           }
           System.out.println(" "); // new line
           // Step 2
           System.out.println("Step 2: ");
           
        
        int s=10;// numbers will be from 10-100
        // while loop that prints all prime numbers from 10-100
        System.out.print("WHILE LOOP: ");
        while (s<101){ // numbers should till 100 so less that 101
        if ((s%2!=0) && (s%3!=0) && (s%5!=0) && (s%7!=0) ) { // s should not have a factor of 2,3,5, and 7 in order for it to be a prime number
            System.out.print(" "+ s +" " ); 
        }
        s++; // add one to se so it check again for the next number
        }
        System.out.println(" ");
        // for loop
        System.out.println("FOR LOOP: ");
        
        for (int m=10; m<101; m++) {
            if ((m%2!=0) && (m%3!=0) && (m%5!=0) && (m%7!=0) ) {
            System.out.print(" "+ m +" " ); 
        }
        }
        System.out.println(" ");
        // Do-while Loop
        System.out.println("DO WHILE LOOP: ");
        int j=10;
        do {
        if ((j%2!=0) && (j%3!=0) && (j%5!=0) && (j%7!=0) ) {
            System.out.print( " " + j + " ");
        }
        j++;
        } while (j<101);
        System.out.println( "  ") ;
        // Step 3
        System.out.println("Step 3:");
        int random= (int)(Math.random()*196+5); // random number
        String m=":)";// smiley face
        int r=0;// variable to count the total amount of smiley faces per line
        int u=0;// variable to count the total amount of smiley faces
        while (u<random+1) {
            
            System.out.print( " " +m+ " ");// print smiley face
            u++; // add one to the total amount of smiley faces
            r++; // add one to the total smiley faces per line
            if (r==20) { // if 20 faces in a line, move to the next line
                System.out.println();
                r=0; // set r back to zero to start counting the number of smiley faces in the next line. 
                
            }
        }
        System.out.println(); // new line
        
        
        
    }// end of method
} // end of class