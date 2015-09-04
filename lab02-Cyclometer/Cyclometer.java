//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Maryam Athar Khan
// 09/04/15
// CSE2
// The purpose of the program is to calculate the distance for the two trips combined. 
//
public class Cyclometer {
    // main method required for every Java program
    public static void main (String[] args) {
        int secsTrip1=480; // This is the number of seconds Trip 1 took. 
        int secsTrip2=3220; // This is the number of seconds Trip 2 took.
        int countsTrip1=1561; // This is the number of rotations on front wheel that occured during Trip 1.
        int countsTrip2=9037; // This is the number of rotations on front wheel that occured during Trip 2. 
        double wheelDiameter=27.0; // This is the diameter of the front wheel
        double PI=3.14159; // This is the value of PI used when calculating the area of a formula.
        double feetPerMile=5280; // This is the distance travelled per mile.
        double inchesPerFoot=12; // This is how many inches are in a foot. 
        double secondsPerMinute=60; // This is how many seconds are in a minute. 
        double distanceTrip1, distanceTrip2, totalDistance; // 
        
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI; 
        distanceTrip1/=inchesPerFoot*feetPerMile;
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }  // end of main method 
 
} // end of class 