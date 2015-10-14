// Maryam Athar Khan
// Lab 07
// This program is designed to hide a secret message X

import java.util.Scanner;

public class encrypted_x {
    public static void main(String [] agrs) {
        Scanner myScanner= new Scanner(System.in);
        System.out.print("Please input an integer value between 0-100: ");
        int input=0;
        
        while (true) {
            if (myScanner.hasNextInt()) {
                break;
            }
            else {
            System.out.print("Error value. Please input an integer value between 0-100: ");    
            myScanner.nextLine();
        }
        input=myScanner.nextInt();
        }
        while (true) {
            if (input<=0 && input>=100) {
                System.out.print("Error value. Please input an integer value between 0-100: ");
                myScanner.nextLine();
            }
            else {
                input=myScanner.nextInt();
             break;
                
            }
            }
        
        
for (int i=0; i<input; i++) {
    for (int j=0; j<input+1; j++) {
        if (i==j|| j==input-i ) {
            System.out.print(" ");
           }
         else {
             System.out.print("*");
             } 
    }
    System.out.println();
}    
        
    }
}