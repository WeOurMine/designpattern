package cn.zw.compound;


/**
 * 装饰者模式
 */

public class QuackCounter implements Quackable {

    Quackable duck;

    static int numberOfQuacks;

    Observable observable;

    public QuackCounter(Quackable duck) {
        this.duck = duck;

        observable = new Observable(this);
    }


    @Override
    public void quack() {

        duck.quack();

        numberOfQuacks++;

        notifyObservers();
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {

        observable.notifyObservers();
    }
}
