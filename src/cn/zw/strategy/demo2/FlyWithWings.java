package cn.zw.strategy.demo2;

public class FlyWithWings  implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
