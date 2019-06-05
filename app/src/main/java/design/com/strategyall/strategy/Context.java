package design.com.strategyall.strategy;

public class Context {

    private StrategyImpl mStrategy;

    public Context(StrategyImpl strategy) {
        mStrategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return mStrategy.doOperation(num1, num2);
    }
}
