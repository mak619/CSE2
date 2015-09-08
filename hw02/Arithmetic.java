//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Maryam Athar Khan
// Homework 2
// The purpose of the program is to calculate the cost of the shopping done at Walmart. 
// 
// first compile the program
//     javac Arithmetic.java
// run the program
//  java Arithmetic//

// define a class
public class Arithmetic{
    // main method required for every Java Program
    public static void main(String[] args) {
// Number of pairs of socks
int nSocks=3;
// Cost per pair of socks
// ($) is part of the variable name 
double sockCost$=2.58;
// Number of drinking glasses
int nGlasses=6;
// Cost per glass
double glassCost$=2.29;
// Number of boxes of envelopes
int nEnvelopes=1;
// Cost per box of envelope
double envelopeCost$=3.25;
// Sales Tax
double taxPercent=0.06;

// Print out statements that show the item being bought, how many of the given item is being bought, and the cost per item.
System.out.println("3 pair of socks are bought and each pair costs $"+sockCost$+".");
System.out.println("6 drinking glasses are bought and each drinking glass costs $"+glassCost$+".");
System.out.println("1 box of envelope is bought and each box of envelope costs $"+envelopeCost$+".");

// total cost of socks
double totalSockCost$=nSocks*sockCost$;
// sales tax for the total cost of socks
double taxtotalSockCost$=totalSockCost$*taxPercent;
// rounded value of sales tax of socks
double roundSock$=(int)(taxtotalSockCost$*100)/100.0;

// total cost of drinking glasses
double totalGlassCost$=nGlasses*glassCost$;
// sales tax for the total cost of drinking glasses
double taxtotalGlassCost$=totalGlassCost$*taxPercent;
// rounded value of sales tax of glasses
double roundGlass$=(int)(taxtotalGlassCost$*100)/100.0;

// total cost of a box of envelope
double totalEnvelopeCost$=nEnvelopes*envelopeCost$;
// sales tax for the total cost of a box of envelope
double taxtotalEnvelopeCost$=totalEnvelopeCost$*taxPercent;
// rounded value of sales tax of a box of envelope
double roundEnvelope$=(int)(taxtotalEnvelopeCost$*100)/100.0;

// Print out the total cost of each item and the sales tax for that item
System.out.println("The total cost of Socks is $"+totalSockCost$+" and the sales tax for Socks is $"+roundSock$+".");
System.out.println("The total cost of Drinking Glasses is $"+totalGlassCost$+" and the sales tax for Drinking Glasses is $"+roundGlass$+".");
System.out.println("The total cost of an Envelope Box is $"+totalEnvelopeCost$+" and the sales tax for an Envelope Box is $"+roundEnvelope$+".");

// total cost of the purchases before tax
double totalCostBeforeTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
// total sales tax
double totalSalesTax$=roundSock$+roundGlass$+roundEnvelope$;
// total cost of the purchases after tax
double totalCostAfterTax$=totalCostBeforeTax$+totalSalesTax$;
// rounnded value of total cost of purchases after tax
double roundTotalCostAfterTax$=(int)(totalCostBeforeTax$*100)/100.0;

// Print out the total cost of purchases before and after tax and the total sales tax 
System.out.println("The total cost of purchases before tax is $"+totalCostBeforeTax$+".");
System.out.println("The total sales tax is $"+totalSalesTax$+".");
System.out.println("The total cost of purchases after tax is $"+totalCostAfterTax$+".");


    } // end of main method
    
} // end of class 
