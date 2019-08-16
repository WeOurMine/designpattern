package cn.zw.decorate.decorate1;


/**
 * 浓缩咖啡类
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
