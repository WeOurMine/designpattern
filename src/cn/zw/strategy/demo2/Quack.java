package cn.zw.strategy.demo2;

public class Quack  implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
