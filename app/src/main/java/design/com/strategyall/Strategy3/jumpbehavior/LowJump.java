package design.com.strategyall.Strategy3.jumpbehavior;

public class LowJump implements JumpImpl {
    @Override
    public void Jump() {
        System.out.println("===Low jump===");
    }
}
