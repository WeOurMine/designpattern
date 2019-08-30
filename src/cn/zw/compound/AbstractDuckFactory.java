package cn.zw.compound;


/**
 * 抽象工厂模式
 */

public abstract class AbstractDuckFactory {

    public abstract  Quackable createMallardDuck();

    public abstract  Quackable createRedheadDuck();

    public abstract  Quackable createDuckCall();

    public abstract  Quackable createRubberDuck();
}
