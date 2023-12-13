package rdd;

public class Eagle extends Animal implements CanFly, Skinnable {
    public Eagle(String name, String color) {
        super(name, color);
        this.attack = 15;
        this.aggro = 10;
        this.hp = 200;
    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void makeNoise() {

    }
    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    @Override
    public void skin() {

    }
}
