package cards;

public class BlackJack {
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        myDeck.shuffle();
        myDeck.shuffle();
        myDeck.shuffle();
        myDeck.shuffle();
        myDeck.shuffle();
        myDeck.shuffle();
        myDeck.shuffle();
        PokerCard myCard = myDeck.deal();
        myCard.flip();
    }
}
