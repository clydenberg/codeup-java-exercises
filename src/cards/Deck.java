package cards;

import java.util.ArrayList;

public class Deck {
    public ArrayList<PokerCard> cards;
    public int size;
    public Deck() {
        //This acts like our constructor
        this.reset();
    }
    public void shuffle(){
        for(int i = 0; i < this.cards.size(); i++){
            int rand = (int) Math.floor(Math.random() * this.cards.size());
            PokerCard temp = this.cards.get(i);
            this.cards.set(i, this.cards.get(rand));
            this.cards.set(rand, temp);
        }
    }
    public void reset(){
        this.cards = new ArrayList<PokerCard>();
            String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
            String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen","King", "Ace"};
            for (String suit : suits) {
                for (String name : names) {
                    PokerCard newCard = new PokerCard(suit, name);
                    this.cards.add(newCard);
                }
            }
            this.size = this.cards.size();
            this.shuffle();
        }
    public PokerCard deal(){
        PokerCard dealt = this.cards.get(0);
        this.cards.remove(0);
        this.size--;
        return dealt;
    }
}
