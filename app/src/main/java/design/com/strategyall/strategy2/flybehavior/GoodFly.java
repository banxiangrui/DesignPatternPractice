package design.com.strategyall.strategy2.flybehavior;

public class GoodFly implements FlyImpl {
    @Override
    public void fly() {
        System.out.println("=====GoodFly====");
    }
}
