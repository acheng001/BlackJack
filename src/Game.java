import java.util.Stack;
import java.util.Random;
import java.util.*; //Imports eery package in Java

public class Game {

    // Game Instance variables
    //Declaring a variable
    public static Stack<Card> deck = new Stack<>();
    public ArrayList<Player> players = new ArrayList<>();
    public LinkedList<Card> cards;

    public Game() {
        //Intializing a variable
        Main.input.next();
        cards = new LinkedList<>();
        createDeck();
        shuffleDeck();
        //Lets add some players
        players.add(new Player("Sarah"));
        players.add(new Player("Joe"));
        
    }

    //Game Methods
    private void createDeck(){
        for(int i = 1; i <= 13; i++){
            deck.push(new Card(Card.Suit.Hearts,i));
            deck.push(new Card(Card.Suit.Diamonds,i));
            deck.push(new Card(Card.Suit.Spades,i));
            deck.push(new Card(Card.Suit.Clubs,i));
        }
    } //create Deck

    public void printDeck(){ //Figure out why its not printing random values

        //This function prints all the cards in the deck
        //Note that the stack WE implemented, does not have a get() function, Java's does/

        //New way of writing for loop (Usually used for iterating over list or array)
        // ":" stands for in (Card c in deck)
        for(Card c : deck){
            System.out.println(c);
        }

    }

    private void shuffleDeck(){
        //for each card in the deck, swap it with a random card in the deck.
        // look up get/set methods for stack
        //Search java stack docs.oracle
        // For swapping:
        // - Get a random card fromthe deck
        // - Store it in a temporary (temp) card variable.
        // - Set the current card (index i) to the temp
        // - Set the random (index r) to the Current card
        //Loop over all the cards in the deck

        Random cards = new Random();

        for(int i= 0; i < deck.size(); i++){
            Card temp = deck.get(i);
            int r = Main.rand.nextInt(deck.size()); // 0 to bound -1
            // Set the i'th card to the random card.
            deck.set(i,deck.get(r));
            //Set the random card to the i'th card
            deck.set(r,temp); //Swaps the temporary card with a random variable

            //Stack Methods

        }



    } // shuffleDeck


} // public class Game
