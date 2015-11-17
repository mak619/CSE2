// Maryam Athar Khan
// Lab 12
// This program passes arrays to and from method

public class arrayManipulation { // define the main class
    public static int[][] raggedArray() { // define raggedArray method
        int mem=(int)((Math.random()*11)+10); // random no of member array
        int[][] array= new int[mem][];
        for (int i=0; i<mem;i++) {
            int insideMem=(int)((Math.random()*11)+10);
            array[i]= new int[insideMem];
            for (int z=0; z<array[i].length;z++) {
                array[i][z]=(int)((Math.random()*2000)-1000);
            } // end of inner loop
        } // end of big for loop
        return array;
    } // end of raggedArray method
    public static void printArray(int[][] x) { // define printArraymethod
      for (int i=0;i<x.length;i++) {
          System.out.print("Member " +i +":");
          for (int z=0; z<x[i].length; z++) {
              System.out.print(x[i][z]+" ");
          } // end of inner loop
          System.out.println();
      } // end of big loop
      System.out.println();
    } // end of printArray method
    public static void printArray(int[] x) { // define printArray 2 method
        for (int i=0;i<x.length;i++) {
            System.out.print(x[i] +" ");
        }
        System.out.println();
    } // end of printArray 2 method
    public static int[] findSmallest(int[][] x) { // define the Smallest method
        int[] min=x[0];
        for (int i=1; i<x.length; i++) {
            if (x[i].length<min.length) {
                min=x[i];
            }
        }
        return min;
    } // end of findSmallest method
    public static int[] findLargest(int[][] x) { // define the Largest method
        int[] max=x[0];
        for (int i=1; i<x.length; i++) {
            if (x[i].length>max.length) {
                max=x[i];
            }
        }
        return max;
    } // end of findLargest method
    public static int[] mostEven(int[][] x) { // define the mostEven method
        int[] maxEven=x[0];
        for (int i=0; i<x.length; i++) {
            if (x[i].length%2==0) {
                if (x[i].length>maxEven.length) {
                    maxEven=x[i];
                }
            }
        }
        return maxEven;
    } // end of mostEven method
    public static void main(String[] args) { // define the main method
        int[][] arr=raggedArray();
        printArray(arr);
        int[] min=findSmallest(arr);
        System.out.println("Smallest member array:");
        printArray(min);
        int[] max=findLargest(arr);
        System.out.println("Largest member array: ");
        printArray(max);
        int[] even=mostEven(arr);
        System.out.println("Largest even array:");
        printArray(even);
        
    } // end of main method
} // end of class