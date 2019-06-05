package design.com.strategyall.Strategy3.cat;

import design.com.strategyall.Strategy3.jumpbehavior.HighJump;
import design.com.strategyall.Strategy3.soundbehavior.MiaoSound;

public class WhiteCat extends Cat {


    public WhiteCat(){
        mJump = new HighJump();
        mSound = new MiaoSound();
    }

    @Override
    public void display() {
        System.out.println("====whitecat====display");
    }
}
