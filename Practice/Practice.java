//
import java.util.Scanner;
public class Practice{
    /*public static double x (String x, int y, double z) {
        return z+y;
    }
    public static int x(int x, double y, String z) {
        y=x+(int)y;
        return x;
    }
    public static String x(double x, String y, int z) {
        y+=z;
        y+=x;
        return y;
    }
    public static void main(String[] args) {
        String hello="Goodbye";
        String z="Hello";
        int x=3;
        double y=2;
        y=x(x,y,x(0.0,hello,x));
        System.out.println(y);
    }*/ 
    public static void main(String[] args){
    Scanner myScanner=new Scanner(System.in);
    int input=7;
    for (int i=0;i<input;i++) {
        for (int j=0;j<=i-1;j++) {
            System.out.print("o");
        }
        System.out.print("\\");
        for (int z=0;z<i-1;z++) {
            System.out.print("+");
        }
        System.out.println();
    }
    } 
} // end of class