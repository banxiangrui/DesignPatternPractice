package design.com.strategyall.strategy2.duck;

public class RedDuck extends Duck {


//    public RedDuck(){
//        mFly = new GoodFly();
//        mQuack = new GaGaQuack();
//    }

    @Override
    public void display() {
        System.out.println("====RedDuck====");
    }
}
