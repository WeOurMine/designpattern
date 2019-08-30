package cn.zw.compound;

/**
 *任何想被观察的对象都要实现这个接口
 */

public interface QuackObservable {

    public void registerObserver(Observer observer);

    public void notifyObservers();
}
