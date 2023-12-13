package rpg;

public class Fighter {
    public String name;
    public int hp;
    public Fighter(String name) {
        this.name = name;
        this.hp = 100;
    }
    public void shout(){
        System.out.println("I am " + this.name + "! fear me!!!");
    }
    public void attack(Fighter opponent){
        System.out.println(this.name + " attacks " + opponent.name + "for 10 damage!");
        opponent.hp -= 10;
        System.out.println(opponent.name + " has " + opponent.hp + " hp left.");
    }

}
