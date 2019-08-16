package cn.zw.strategy.demo2;

public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;


    public Duck(){}

    public void swim(){

        System.out.println("All duck float,even decoys!");
    }

    public void display(){}

    public void performQuack(){

        quackBehavior.quack();
    }

    public void performFly(){

        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
