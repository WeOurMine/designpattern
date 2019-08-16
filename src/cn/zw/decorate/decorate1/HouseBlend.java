package cn.zw.decorate.decorate1;

/**
 * 这是另外一种咖啡
 */
public class HouseBlend  extends  Beverage {

    public HouseBlend() {

        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
