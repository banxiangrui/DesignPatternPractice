package design.com.strategyall.strategy2.flybehavior;

public class BadFly implements FlyImpl {
    @Override
    public void fly() {
        System.out.println("===badfly===");
    }
}
