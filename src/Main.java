import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;

public class Main {

    //Global variables
    public static Scanner input;
    public static Random rand;
    // A HashMap maps one variable type to another
    // We give the HashMap a "key"; and it returns to us a "value"
    // In the case of this game, we use the HashMap to map a card number (Integer),
    // To the card name (String). (Give a key number of 1 and the value should be Ace)
    // Some examples:
    // Key        Value
    // 1           Ace
    //  11         Jack
    // 12          Queen
    // 13          King
    public static HashMap<Integer,String> cardIdToName;

    public static void main(String[] args) {
	// write your code here
        mainInit();
        Game blackJack = new Game();
        /*
        Card c = new Card(Card.Suit.Hearts, 9);
        System.out.println(c.suit); //Prints Hearts because we set it to hearts
        System.out.println(c.number);
        int key = 1;
        //.get gets the info from when we intialize the HashMap
        String value = cardIdToName.get(key);
        System.out.printf("Key = %d --> Value = %s\n", key, value);
        */

        blackJack.printDeck();
        blackJack.Game.createDeck();



    } // Main

    //Main functions/methods
    private static void mainInit(){
        input = new Scanner(System.in); //Able to take an input from the user same as sc.scanner
        rand = new Random();
        //Intialize the HashMap variable.
        cardIdToName = new HashMap<>();
        // Intialize the key -> value maps that we want
        //Put changes to what types you said inside of the HashMap
        cardIdToName.put(1, "Ace");
        cardIdToName.put(2, "2");
        cardIdToName.put(3, "3");
        cardIdToName.put(4, "4");
        cardIdToName.put(5, "5");
        cardIdToName.put(6, "6");
        cardIdToName.put(7, "7");
        cardIdToName.put(8, "8");
        cardIdToName.put(9, "9");
        cardIdToName.put(10, "10");
        cardIdToName.put(11, "Jack");
        cardIdToName.put(12, "Queen");
        cardIdToName.put(13, "King");
    } // mainInit

} //End of class Main
