package rpg;

public class RpgApp {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("John");
        Fighter fighter2 = new Fighter("Jane");
        fighter1.shout();
        fighter1.attack(fighter2);
    }
}
