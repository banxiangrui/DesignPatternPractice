package design.com.strategyall.Strategy3.cat;

import design.com.strategyall.Strategy3.jumpbehavior.JumpImpl;
import design.com.strategyall.Strategy3.soundbehavior.SoundImpl;

public abstract class Cat {

    JumpImpl mJump;
    SoundImpl mSound;

    public Cat() {

    }

    public abstract void display();

    public void jump() {
        mJump.Jump();
    }

    public void sound() {
        mSound.Sound();
    }

    public void setJump(JumpImpl jump){
       mJump = jump;
    }

}
