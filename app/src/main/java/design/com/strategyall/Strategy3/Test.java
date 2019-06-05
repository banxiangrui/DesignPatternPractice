package design.com.strategyall.Strategy3;

import design.com.strategyall.Strategy3.cat.BlackCat;
import design.com.strategyall.Strategy3.cat.Cat;
import design.com.strategyall.Strategy3.cat.WhiteCat;
import design.com.strategyall.Strategy3.jumpbehavior.HighJump;

public class Test {

    public static void main(String[] args) {
        Cat cat = new WhiteCat();
        cat.display();
        cat.jump();
        cat.sound();

        Cat BlackCat = new BlackCat();
        BlackCat.display();
        BlackCat.sound();
        BlackCat.jump();
        BlackCat.setJump(new HighJump());
        BlackCat.jump();
    }
}
