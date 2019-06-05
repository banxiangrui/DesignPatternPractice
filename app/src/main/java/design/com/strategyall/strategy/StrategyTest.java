package design.com.strategyall.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        Context context = new Context(new StrategyAdd());
        context.executeStrategy(10, 20);
        System.out.println("==context.StrategyAdd(10, 20)====" + context.executeStrategy(10, 20));

        context = new Context(new StrategyMultiply());
        context.executeStrategy(3, 5);
        System.out.println("==context.StrategyMultiply(10, 20)====" + context.executeStrategy(10, 20));
    }
}
