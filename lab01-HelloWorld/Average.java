import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int h=6;
        double y= 3 + (double)h;
        System.out.println(y);
        Scanner myScanner= new Scanner( System.in );
        System.out.print( "Enter the first digit: ");
        int first= myScanner.nextInt();
        System.out.print("Enter the second digit: ");
        int second= myScanner.nextInt();
        System.out.print("Enter the third digit: ");
        int third= myScanner.nextInt();
        int average= (first + second + third)/3;
        System.out.println( "Average: " + average);
        if (average>0) {
            System.out.println( "Average is positive ");
        }
        else if (average==0) {
            System.out.println(" Average is zero ");
        }
        else if (average<0) {
            System.out.println("Avergae is neagtive");
            
    
        }
            
        
    }
}