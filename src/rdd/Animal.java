package rdd;

public abstract class Animal {
    public String color;
    public int hp;
    public String name;
    public int aggro;
    public int attack;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        this.hp = 100;
        this.aggro = 0;
        this.attack = 1;
    }

    public abstract void move();
    public abstract void eat();
    public abstract void makeNoise();
}
