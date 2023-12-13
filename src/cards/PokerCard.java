package cards;

public class PokerCard extends Card{
    public PokerCard(String suit, String name){
        super(suit, name);
        switch(name){
            case "Jack":
                this.value = 11;
                break;
            case "Queen":
                this.value = 12;
                break;
            case "King":
                this.value = 13;
                break;
            case "Ace":
                this.value = 14;
                break;
        }
    }
}
