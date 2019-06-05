package design.com.strategyall.strategy2;

import design.com.strategyall.strategy2.duck.Duck;
import design.com.strategyall.strategy2.duck.RedDuck;
import design.com.strategyall.strategy2.flybehavior.BadFly;
import design.com.strategyall.strategy2.quackbehavior.GeGeQuack;

public class StrategyTest {

    public static void main(String[] args) {

        Duck duck = new RedDuck();


        duck.display();
//        duck.Fly();
//        duck.Quack();


        duck.setmFly(new BadFly());
        duck.setmQuack(new GeGeQuack());
    }
}
