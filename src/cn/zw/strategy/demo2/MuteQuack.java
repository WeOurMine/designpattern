package cn.zw.strategy.demo2;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<  Silence   >>");
    }
}
