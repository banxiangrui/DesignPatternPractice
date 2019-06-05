package design.com.strategyall.strategy2.duck;

import design.com.strategyall.strategy2.flybehavior.FlyImpl;
import design.com.strategyall.strategy2.quackbehavior.QuackImpl;

public abstract class Duck {

    FlyImpl mFly;
    QuackImpl mQuack;


    public void Fly() {
        mFly.fly();
    }

    public void Quack() {
        mQuack.quack();
    }

    public abstract void display();

    public void setmFly(FlyImpl mFly) {
        mFly.fly();
    }

    public void setmQuack(QuackImpl mQuack) {
        mQuack.quack();
    }
}
