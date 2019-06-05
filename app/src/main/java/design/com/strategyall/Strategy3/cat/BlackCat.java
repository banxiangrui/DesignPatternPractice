package design.com.strategyall.Strategy3.cat;

import design.com.strategyall.Strategy3.jumpbehavior.LowJump;
import design.com.strategyall.Strategy3.soundbehavior.WuSound;

public class BlackCat extends Cat {

    public BlackCat(){
        mJump = new LowJump();
        mSound = new WuSound();
    }

    @Override
    public void display() {
        System.out.println("====BlackCat====display");
    }
}
