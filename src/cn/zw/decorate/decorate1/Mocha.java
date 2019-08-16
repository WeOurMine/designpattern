package cn.zw.decorate.decorate1;


/**
 * 调料类
 *
 * 也是一个具体的装饰者类
 */

public class Mocha extends  CondimentDecorator {

    /**
     * 1.用一个实例变量记录饮料，也就是被装饰者
     */
    Beverage beverage;


    /**
     * 想办法让被装饰者（饮料） 被记录到实例变量中。这里的做法是把饮料当作构造器的参数，再由构造器将此饮料记录在实例变量中
     * @param beverage
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    /**
     * 要计算带Mocha饮料的价钱。首先把调用委托给被装饰对象，以计算价钱，然后再加上Mocha的价钱，得到最后的结果
     * @return
     */
    @Override
    public double cost() {
        return .20+beverage.cost();
    }
}
