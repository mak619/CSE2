/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Maryam Athar Khan
// Lab 04
// Septemeber 18,2015
// This program is designed to pick a random card from the deck of cards to allow the magician to practice alone.
//

// define a class
public class CardGenerator {
    // main method required of every Java program
    public static void main(String[] args) {
        // random card generator
        int card=(int)(Math.random()*52)+1;
        // Declare variables of card suit and card number
        String suitType="";
        String numberType="";
        // switch statements to get different cards
       int temp=(card/13)+1;
        if (card %13==0){
         temp=(card/13);
        }
        switch (temp){
            case 1:
                suitType="Diamonds";
                break;
            case 2:
                suitType="Clubs";
                break;
            case 3:
                suitType="Hearts";
                break;
            case 4:
                suitType="Spades";
                break;
            }
        int temp2=(card%13);
        if (card%13==0){
            temp2=(card/13);
        } 
        switch (temp2){
            case 0:
                numberType="Kings";
                break;
            case 1: 
                numberType="Ace";
                break;
            case 2:
                numberType="2";
                break;
            case 3:
                numberType="3";
                break;
            case 4:
                numberType="4";
                break;
            case 5:
                numberType="5";
                break;
            case 6:
                numberType="6";
                break;
            case 7:
                numberType="7";
                break;
            case 8:
                numberType="8";
                break;
            case 9:
                numberType="9";
                break;
            case 10:
                numberType="10";
                break;
            case 11:
                numberType="Jack";
                break;
            case 12:
                numberType="Queen";
                break;
            }
    // print
    System.out.println("You picked " +numberType+ " of " +suitType+".");
    }// end of main method
}// end of class