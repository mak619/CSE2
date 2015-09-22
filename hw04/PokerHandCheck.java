///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Maryam Athar Khan
// Homework 04
// Due date is September 22,2015
// This program is designed to create specific combinations that may occur whilst playing poker.
//
// define a class
public class PokerHandCheck {
    // main method required of every Java program
    public static void main(String[] args) {
        // random card generator
        int card1=(int)(Math.random()*52+1);
        int card2=(int)(Math.random()*52+1);
        int card3=(int)(Math.random()*52+1);
        int card4=(int)(Math.random()*52+1);
        int card5=(int)(Math.random()*52+1);
        // declare variables of card suit, card number, a pair, two pair, three of a kind
        String suitType1="";
        String numberType1="";
        String suitType2="";
        String numberType2="";
        String suitType3="";
        String numberType3="";
        String suitType4="";
        String numberType4="";
        String suitType5="";
        String numberType5="";
        // switch statements to get different card types 
        // switch statements to get different cards
        // card 1 suit type
       int temp1=(card1/13)+1;
        if (card1 %13==0){
         temp1=(card1/13);
        }
        switch (temp1){
            case 1:
                suitType1="Diamonds";
                break;
            case 2:
                suitType1="Clubs";
                break;
            case 3:
                suitType1="Hearts";
                break;
            case 4:
                suitType1="Spades";
                break;
            }
        // card 2 suit type
        int temp2=(card2/13)+1;
        if (card2 %13==0){
         temp2=(card2/13);
        }
        switch (temp2){
            case 1:
                suitType2="Diamonds";
                break;
            case 2:
                suitType2="Clubs";
                break;
            case 3:
                suitType2="Hearts";
                break;
            case 4:
                suitType2="Spades";
                break;
            }
        // card 3 suit type
        int temp3=(card3/13)+1;
        if (card3 %13==0){
         temp3=(card3/13);
        }
        switch (temp3){
            case 1:
                suitType3="Diamonds";
                break;
            case 2:
                suitType3="Clubs";
                break;
            case 3:
                suitType3="Hearts";
                break;
            case 4:
                suitType3="Spades";
                break;
            }
        // card 4 suit type
        int temp4=(card4/13)+1;
        if (card4 %13==0){
         temp4=(card4/13);
        }
        switch (temp4){
            case 1:
                suitType4="Diamonds";
                break;
            case 2:
                suitType4="Clubs";
                break;
            case 3:
                suitType4="Hearts";
                break;
            case 4:
                suitType4="Spades";
                break;
            }
        // card 5 suit type
         int temp5=(card5/13)+1;
        if (card5 %13==0){
         temp5=(card5/13);
        }
        switch (temp5){
            case 1:
                suitType5="Diamonds";
                break;
            case 2:
                suitType5="Clubs";
                break;
            case 3:
                suitType5="Hearts";
                break;
            case 4:
                suitType5="Spades";
                break;
            }
        // switch statements to get different card numbers
        // card 1 number
        int temp11=(card1%13);
        if (card1%13==0){
            temp11=(card1/13);
        } 
        switch (temp11){
            case 0:
                numberType1="Kings";
                break;
            case 1: 
                numberType1="Ace";
                break;
            case 2:
                numberType1="2";
                break;
            case 3:
                numberType1="3";
                break;
            case 4:
                numberType1="4";
                break;
            case 5:
                numberType1="5";
                break;
            case 6:
                numberType1="6";
                break;
            case 7:
                numberType1="7";
                break;
            case 8:
                numberType1="8";
                break;
            case 9:
                numberType1="9";
                break;
            case 10:
                numberType1="10";
                break;
            case 11:
                numberType1="Jack";
                break;
            case 12:
                numberType1="Queen";
                break;
            }
        // card 2 number
         int temp22=(card2%13);
        if (card2%13==0){
            temp22=(card2/13);
        } 
        switch (temp22){
            case 0:
                numberType2="Kings";
                break;
            case 1: 
                numberType2="Ace";
                break;
            case 2:
                numberType2="2";
                break;
            case 3:
                numberType2="3";
                break;
            case 4:
                numberType2="4";
                break;
            case 5:
                numberType2="5";
                break;
            case 6:
                numberType2="6";
                break;
            case 7:
                numberType2="7";
                break;
            case 8:
                numberType2="8";
                break;
            case 9:
                numberType2="9";
                break;
            case 10:
                numberType2="10";
                break;
            case 11:
                numberType2="Jack";
                break;
            case 12:
                numberType2="Queen";
                break;
            }
        // card 3 number type
         int temp33=(card3%13);
        if (card3%13==0){
            temp33=(card3/13);
        } 
        switch (temp33){
            case 0:
                numberType3="Kings";
                break;
            case 1: 
                numberType3="Ace";
                break;
            case 2:
                numberType3="2";
                break;
            case 3:
                numberType3="3";
                break;
            case 4:
                numberType3="4";
                break;
            case 5:
                numberType3="5";
                break;
            case 6:
                numberType3="6";
                break;
            case 7:
                numberType3="7";
                break;
            case 8:
                numberType3="8";
                break;
            case 9:
                numberType3="9";
                break;
            case 10:
                numberType3="10";
                break;
            case 11:
                numberType3="Jack";
                break;
            case 12:
                numberType3="Queen";
                break;
            }
        // card 4 number
         int temp44=(card4%13);
        if (card4%13==0){
            temp44=(card4/13);
        } 
        switch (temp44){
            case 0:
                numberType4="Kings";
                break;
            case 1: 
                numberType4="Ace";
                break;
            case 2:
                numberType4="2";
                break;
            case 3:
                numberType4="3";
                break;
            case 4:
                numberType4="4";
                break;
            case 5:
                numberType4="5";
                break;
            case 6:
                numberType4="6";
                break;
            case 7:
                numberType4="7";
                break;
            case 8:
                numberType4="8";
                break;
            case 9:
                numberType4="9";
                break;
            case 10:
                numberType4="10";
                break;
            case 11:
                numberType4="Jack";
                break;
            case 12:
                numberType4="Queen";
                break;
            }
        // card 5 number
         int temp55=(card5%13);
        if (card5%13==0){
            temp55=(card5/13);
        } 
        switch (temp55){
            case 0:
                numberType5="Kings";
                break;
            case 1: 
                numberType5="Ace";
                break;
            case 2:
                numberType5="2";
                break;
            case 3:
                numberType5="3";
                break;
            case 4:
                numberType5="4";
                break;
            case 5:
                numberType5="5";
                break;
            case 6:
                numberType5="6";
                break;
            case 7:
                numberType5="7";
                break;
            case 8:
                numberType5="8";
                break;
            case 9:
                numberType5="9";
                break;
            case 10:
                numberType5="10";
                break;
            case 11:
                numberType5="Jack";
                break;
            case 12:
                numberType5="Queen";
                break;
            }
        // print out the five random cards
        System.out.println("Your random cards were:");
        System.out.println("the " +numberType1+ " of " +suitType1+ " ");
        System.out.println("the " +numberType2+ " of " +suitType2+ " ");
        System.out.println("the " +numberType3+ " of " +suitType3+ " ");
        System.out.println("the " +numberType4+ " of " +suitType4+ " ");
        System.out.println("the " +numberType5+ " of " +suitType5+ " ");
        // declare match, pair, two pair, high card and three pair variables
       int match=0; 
       int pair=0;// you want to keep count of the number of matches and pair, hence declare them as integers. 
       boolean Pair=false;
       boolean twoPair=false;
       boolean threeKind=false;
       boolean highCard=false;
       // compare card 1 with card 2
       if (numberType1==numberType2) {
           match=match+1; // match++
       }
       if (numberType1==numberType3) {
           match=match+1;
       }
       if (numberType1==numberType4) {
           match=match+1;
       }
       if (numberType1==numberType5) {
           match=match+1;
       }
       if (match==2) {
           threeKind=true; // if card 1 matches with two other card, it is three of a kind
       }
       if (match==1) {
           pair=1;
           Pair=true; // if there is only one match, there is only one pair
       }
       
       match=0; // set match is equal to zero so we can check other card combinations
       // check combinations with card 2
       if (numberType2==numberType3) {
           match=match+1;
       }
       if (numberType2==numberType4) {
           match=match+1;
       }
       if (numberType2==numberType5) {
           match=match+1;
       }
       if ((pair==1) && (match>0)) {
         twoPair=true; // you have card 1 matching with another card and card 2 matching as well 
       }
       if (match==2) {
          threeKind=true; // you have card 2 matching with two other cards
       }
       else if ((pair==0) && (match>0)){
           pair=1;
           Pair=true; // you have no cards matching with card 1 but card 2 matching with other cards
       }
       
       // check combiantions with card 3
       match=0;
       if (numberType3==numberType4) {
           match=match+1;
       }
       if (numberType3==numberType5) {
           match=match+1;
       }
       if ((pair==1) && (match>0)) {
           twoPair=true; // you have card 1 matching with another card and card 3 matching as well
       }
       if (match==2) {
           threeKind=true;// card 3 matches with 2 other cards
       }
       else if ((pair==0) && (match>0)){
           pair=1;
       Pair=true; // card 3 matches with another card
       }
       
       // check combinations with card 4
       match=0;
       if (numberType4==numberType5) {
           match=match+1;
       }
       if ((pair==1) && (match>0)) {
           twoPair=true; // card 1 matches with another card and so does card 4 with other cards
       }
       else if ((pair==0) && (match==1)) {
           Pair=true;// card 4 maches with a card
       }
       
       // printing out statements now
       System.out.println("                 ");// blank line between what the cards are and the combination
       if (threeKind==true) {
           System.out.println("You have three of a kind!"); // three cards match
       }
        else if (twoPair==true) { 
            System.out.println("You have two pair!"); // you have two pairs
        }
       else if (Pair==true) { 
           System.out.println("You have a pair!"); // only one pair
        }
       else {
           System.out.println("You have a high card!");
       }
        
        
    } // end of main method
}// end of class