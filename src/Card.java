public class Card {

    //Enum is another variable similar to float and int

    public enum Suit {Hearts,Diamonds,Spades,Clubs}
    // Card Instance variables (Global variable)
    public Suit suit;
    public int number;

    public Card(Suit _suit, int _number) {
        suit = _suit;
        number = _number;

        //this.suit = suit (Would be used if tow variables had the same names)
    }

    //Card Methods
    public String toString(){
        // Acceses the main class to get cardIdToName
        return Main.cardIdToName.get(number) + " of " + suit;
    } //toString

} // public class Card
